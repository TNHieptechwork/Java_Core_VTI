package org.example.Builder;

public class main {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder().setCPU("i7")
                .setRAM("32Gb")
                .setStorage("512GB").
                setGraphicsCard("RTX4050")
                .build();
        System.out.println(computer);
    }
}
