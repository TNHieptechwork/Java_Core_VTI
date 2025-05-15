package org.example;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bt2 {
    public static void main(String[] args) {
        try (
                BufferedReader reader = new BufferedReader(new FileReader("user.json"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("filtered_users.csv"))
        ) {
            writer.write("name,age,address,email");
            writer.newLine();

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.equals("[") || line.equals("]")) continue;

                if (line.endsWith(",")) {
                    line = line.substring(0, line.length() - 1);
                }

                if (line.startsWith("{") && line.endsWith("}")) {
                    Pattern pattern = Pattern.compile("\"(\\w+)\":\\s*\"?([^\",}]*)\"?");
                    Matcher matcher = pattern.matcher(line);

                    String name = "", ageStr = "", address = "", email = "";
                    while (matcher.find()) {
                        String key = matcher.group(1).trim();
                        String value = matcher.group(2).trim();

                        switch (key) {
                            case "name": name = value; break;
                            case "age": ageStr = value; break;
                            case "address": address = value; break;
                            case "email": email = value; break;
                        }
                    }

                    try {
                        int age = Integer.parseInt(ageStr);
                        if (age > 30) {
                            writer.write((name) + "," +
                                    ageStr + "," +
                                    (address) + "," +
                                    (email));
                            writer.newLine();
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }

            System.out.println("Successfully wrote filtered_users.csv.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


