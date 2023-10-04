package lab13.task1;

public class StringLearn {
    public static void task1(String s){
        System.out.println("2. Последний символ строки: " + s.charAt(s.length()-1));
        System.out.println("3. строка заканчивается подстрокой \"!!!\": " + s.endsWith("!!!"));
        System.out.println("4. строка начинается подстрокой \"I like\": " + s.startsWith("I like"));
        System.out.println("5. Строка содержит подстроку \"Java\": " + s.contains("Java"));
        System.out.println("6. Индекс подстроки \"Java\": " + s.indexOf("Java"));
        System.out.println("7. Cимволы \"a\" заменены на \"o\": " + s.replace('a','o'));
        System.out.println("8. Приведение строки к верхнему регистру: " + s.toUpperCase());
        System.out.println("9. Приведение строки к нижнему регистру: " + s.toLowerCase());
        System.out.println("10. Вырезание строки: " + s.substring(7,11));
    }
    public static void main(String[] args) {
        task1("I like Java!!!");
    }
}
