package lab7.task6;

import lab7.task5.StringMethods;

public class ProcessStrings implements StringMethods {
    @Override
    public int countChars(String s) {
        return s.length();
    }
    @Override
    public String subOddString(String s) {
        String sOdd = "";
        for (int i = 1; i < s.length(); i += 2) {
            sOdd += s.charAt(i);
        }
        return sOdd;
    }
    @Override
    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    public static void main(String[] args) {
        String str = "авиамотор";
        StringMethods stringManipulator = new ProcessStrings();

        int charCount = stringManipulator.countChars(str);
        System.out.println("Количество символов: " + charCount);

        String oddPositionChars = stringManipulator.subOddString(str);
        System.out.println("Символы на нечетных позициях: " + oddPositionChars);

        String reversedString = stringManipulator.reverse(str);
        System.out.println("Инвертированная строка: " + reversedString);
    }
}