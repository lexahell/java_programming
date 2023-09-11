package lab3.task9;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Employee[] employees = new Employee[5];
        String[] names = {"Ivan", "Nikolay", "Georgiy", "Aleksey", "Vasiliy"};
        for (int i = 0; i < 5; i++){
            employees[i] = new Employee(names[i], rand.nextInt(100000)+1+rand.nextDouble());
        }
        Report report = new Report();
        report.generateReport(employees);
    }
}
