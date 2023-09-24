package lab4.task4;

public class Computer {
    private ComputerBrand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    // Геттеры и сеттеры для свойств компьютера
    public ComputerBrand getBrand() {
        return brand;
    }
    public Processor getProcessor() {
        return processor;
    }
    public Memory getMemory() {
        return memory;
    }
    public Monitor getMonitor() {
        return monitor;
    }
    public void setBrand(ComputerBrand brand) {
        this.brand = brand;
    }
    public void setProcessor(Processor processor) {
        this.processor = processor;
    }
    public void setMemory(Memory memory) {
        this.memory = memory;
    }
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
