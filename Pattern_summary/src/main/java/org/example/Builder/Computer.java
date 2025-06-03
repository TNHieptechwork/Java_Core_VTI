package org.example.Builder;

public class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String graphicsCard;

    private Computer(ComputerBuilder computerBuilder) {
        this.CPU = computerBuilder.CPU;
        this.RAM = computerBuilder.RAM;
        this.storage = computerBuilder.storage;
        this.graphicsCard = computerBuilder.graphicsCard;
    }


    public static class ComputerBuilder {
        private String CPU;
        private String RAM;
        private String storage;
        private String graphicsCard;

        public Computer build() {
            return new Computer(this);
        }


        public ComputerBuilder setCPU(String CPU) {
            this.CPU = CPU;
            return  this;
        }


        public ComputerBuilder setRAM(String RAM) {
            this.RAM = RAM;
            return  this;
        }

        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return  this;
        }

        public ComputerBuilder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return  this;
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                '}';
    }
}
