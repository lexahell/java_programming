package lab3.task9;

import java.util.Formatter;
import java.text.NumberFormat;
public class Report {
    public void generateReport(Employee[] employees){
        for (Employee employee: employees){
            Formatter formatter = new Formatter();
            System.out.printf("%-20s %15.2f%n", employee.getFullName() + ":", employee.getSalary());
        }
    }
}
