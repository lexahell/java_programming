package lab4.task4;

public class Tester {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel Core i5", 3.2);
        Memory memory = new Memory(8, "DDR3");
        Monitor monitor = new Monitor("Samsung", 24);
        Computer computer = new Computer(ComputerBrand.Acer, processor, memory, monitor);

        System.out.println("Brand: " + computer.getBrand());
        System.out.println("Processor: " + computer.getProcessor().getModel());
        System.out.println("Memory: " + computer.getMemory().getSize() + "GB " + computer.getMemory().getType());
        System.out.println("Monitor: " + computer.getMonitor().getModel() + " " + computer.getMonitor().getScreenSize() + " inches");
    }
}
