package lab14;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class StringManager {
    public static void main(String[] args) {
        //Задание 2
        System.out.println("Введите строку: ");
        Pattern pattern = Pattern.compile("^abcdefghijklmnopqrstuv18340$", Pattern.CASE_INSENSITIVE);
        Scanner scanner = new Scanner(System.in);
        Matcher matcher = pattern.matcher(scanner.next());
        System.out.println(matcher.matches()?"Строка подходит":"Строка не подходит");
        //Задание 3
        String regex = "[1-9]+[0-9]*(.[0-9]{1,2})?\\s(USD|EU|RUB){1}";
        String string = "56.46 RUB5.456.4.321..46 USD5.4.654.654..21.321.5 EU.465.465.4.2.13 USD2.56.46 USD54564.56.4 EU65.4.654.3..2 USD4.654.65 EU.4156. USD165.1.51.1.6.5.454.5645 RUB432432";

        pattern = Pattern.compile(regex, Pattern.MULTILINE);
        matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }

        //Задание 5
        System.out.println("Введите дату");
        regex = "(30|31|[1-2][0-9]|0[1-9])\\/(1[0-2]|0[1-9])\\/(19[0-9]{2}|[2-9][0-9]{3})";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(scanner.next());

        if (matcher.matches()){
            if (matcher.group(2).equals("02") && Integer.parseInt(matcher.group(1)) >= 29 && Integer.parseInt(matcher.group(3))%4 != 0){
                System.out.println("Дата введена неправильно");
            }else{
                System.out.println("Дата введена правильно");
            }
        }else{
            System.out.println("Дата введена неправильно");
        }
        //Задание 6
        System.out.println("Введите e-mail");
        regex = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(scanner.next());
        System.out.println(matcher.matches()?"e-mail подходит":"e-mail не подходит");

    }
}
