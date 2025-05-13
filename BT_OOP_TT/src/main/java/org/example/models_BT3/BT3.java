package org.example.models_BT3;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileHandler handler = null;

        System.out.println("Select file:");
        System.out.println("1. Text file");
        System.out.println("2. Image file");
        System.out.println("3. Video file");
        System.out.print("Your option: ");
        int type = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter name's file: ");
        String fileName = scanner.nextLine();

        switch (type) {
            case 1:
                handler = new TextFileHandler(fileName);
                break;
            case 2:
                handler = new ImageFileHandler(fileName);
                break;
            case 3:
                handler = new VideoFileHandler(fileName);
                break;
            default:
                System.out.println("Choose invalid.");
                return;
        }

        while (true) {
            System.out.println("\nChọn thao tác:");
            System.out.println("1. Read");
            System.out.println("2. Write");
            System.out.println("3. Delete");
            System.out.println("4. Compress ");
            System.out.println("5. Encrypt");
            System.out.println("0. Exit");
            System.out.print("Choose options: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    handler.read();
                    break;
                case 2:
                    System.out.print("Enter content: ");
                    String content = scanner.nextLine();
                    handler.write(content);
                    break;
                case 3:
                    handler.delete();
                    break;
                case 4:
                    if (handler instanceof Compressible)
                        ((Compressible) handler).compress();
                    else
                        System.out.println("File not support compress.");
                    break;
                case 5:
                    if (handler instanceof Encryptable)
                        ((Encryptable) handler).encrypt();
                    else
                        System.out.println("File not support encrypt.");
                    break;
                case 0:
                    System.out.println("Exit Program.");
                    return;
                default:
                    System.out.println("Option is invalid.");
            }
        }
    }
}
