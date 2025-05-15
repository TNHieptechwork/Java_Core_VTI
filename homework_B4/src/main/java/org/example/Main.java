package org.example;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String inputFile = "app.log";
        String outputFile = "word_appear.txt";
        Map<String, Integer> wordCounts = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] word = line.toLowerCase().split("[^a-zA-Z0-9]+");
                System.out.println(line);
                for(String w : word){
                    if(!w.isEmpty()){
                        wordCounts.put(w, wordCounts.getOrDefault(w,0) + 1);
                    }
                }
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
                for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                    writer.write(entry.getKey() + " : " + entry.getValue());
                    writer.newLine();
                }
            }

            System.out.println("Counted & wrote into : " + outputFile);

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
