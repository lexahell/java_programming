package lab11.task3;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;


public class Tester {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatter2 = new SimpleDateFormat("dd MMM, yyyy", Locale.ENGLISH);
        SimpleDateFormat formatter3 = new SimpleDateFormat("EEEE, dd MMM, yyyy", Locale.ENGLISH);
        Student student1 = new Student("Георгий Савчук", 89, formatter1.parse("28/01/2004"));
        student1.setFormatType(formatter1);
        System.out.println(student1.toString());
        System.out.println("----------------");
        Student student2 = new Student("Иван Иванов", 13, formatter2.parse("13 Mar, 2000"));
        student2.setFormatType(formatter2);
        System.out.println(student2.toString());
        System.out.println("----------------");
        Student student3 = new Student("Олег Петров", 13, formatter3.parse("Thursday, 05 Dec, 2002"));
        student3.setFormatType(formatter3);
        System.out.print(student3.toString());
    }
}
