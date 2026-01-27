package creational.builder;

public class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String screen;

    protected Computer(){}

    protected Computer(String CPU, String RAM, String storage, String screen) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.storage = storage;
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }

    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private String screen;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }
        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }
        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        public Builder setScreen(String screen) {
            this.screen = screen;
            return this;
        }
        public Computer build() {
            return new Computer(CPU, RAM, storage, screen);
        }
    }
}
