package org.example.bt2;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Application started.");

        Logger anotherLogger = Logger.getInstance();
        anotherLogger.log("Logging from another reference.");

    }
}
