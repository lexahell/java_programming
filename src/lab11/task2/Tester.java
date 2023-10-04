package lab11.task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.print("Введите дату в формате yyyy-MM-dd-HH-mm: ");
        Scanner scanner = new Scanner(System.in);
        String userDate = scanner.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH-mm", Locale.ENGLISH);
        try {
            Date date = formatter.parse(userDate);
            CompareDates compareDates = new CompareDates(date);
            System.out.println(compareDates.getUserDate());
            Date currentDate = new Date();
            System.out.println(currentDate);
            compareDates.compare(currentDate);
        } catch (ParseException e) {
            System.out.print(e.getMessage());
            return;
        }
    }
}
