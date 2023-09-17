package lab41.task5;

public class Tester {
    public static void main(String[] args) {
        Reader reader = new Reader("Иванов А. А.", 001, "ИИТ", "01.01.2004", "+7 (999) 999-9999");

        reader.takeBook(3);

        Book book1 = new Book("Приключения", "Автор");
        Book book2 = new Book("Словарь", "Лингвист");
        Book book3 = new Book("Энциклопедия", "Биолог");

        reader.takeBook(book1, book2, book3);
        reader.takeBook("Энциклопедия","Приключения");
        reader.returnBook(2);

        reader.returnBook(book1, book2);
    }
}
