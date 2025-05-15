package org.example;

import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.*;
import java.util.*;
import java.util.regex.*;

public class bt3 {
    public static void main(String[] args) {
        String inputFile = "app.log";
        String outputFile = "log_report.txt";

        Pattern logPattern = Pattern.compile("^(\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2})\\s+(INFO|ERROR|WARN)");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        Map<String, Integer> eventCount = new HashMap<>();
        List<LocalDateTime> infoTimestamps = new ArrayList<>();
        List<LocalDateTime> errorTimestamps = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(inputFile));
             BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                Matcher matcher = logPattern.matcher(line);
                if (matcher.find()) {
                    String timestampStr = matcher.group(1);
                    String eventType = matcher.group(2);

                    eventCount.put(eventType, eventCount.getOrDefault(eventType, 0) + 1);

                    LocalDateTime timestamp = LocalDateTime.parse(timestampStr, formatter);
                    if (eventType.equals("INFO")) {
                        infoTimestamps.add(timestamp);
                    } else if (eventType.equals("ERROR")) {
                        errorTimestamps.add(timestamp);
                    }
                }
            }

            Duration avgInfoDuration = calculateAverageDuration(infoTimestamps);
            Duration avgErrorDuration = calculateAverageDuration(errorTimestamps);

            writer.write("=== Log Report ===\n");
            writer.write("INFO count: " + eventCount.getOrDefault("INFO", 0) + "\n");
            writer.write("ERROR count: " + eventCount.getOrDefault("ERROR", 0) + "\n");
            writer.write("WARN count: " + eventCount.getOrDefault("WARN", 0) + "\n");

            writer.write("Average time between INFO events: " + formatDuration(avgInfoDuration) + "\n");
            writer.write("Average time between ERROR events: " + formatDuration(avgErrorDuration) + "\n");

            System.out.println("Report written to: " + outputFile);

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static Duration calculateAverageDuration(List<LocalDateTime> timestamps) {
        if (timestamps.size() < 2) return Duration.ZERO;

        Duration total = Duration.ZERO;
        for (int i = 1; i < timestamps.size(); i++) {
            total = total.plus(Duration.between(timestamps.get(i - 1), timestamps.get(i)));
        }
        return total.dividedBy(timestamps.size() - 1);
    }

    private static String formatDuration(Duration duration) {
        if (duration.isZero()) return "N/A";
        long hours = duration.toHours();
        long minutes = duration.toMinutesPart();
        long seconds = duration.toSecondsPart();
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
