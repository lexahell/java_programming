package lab2.task7;


public class BookTest {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf(10);

        Book book1 = new Book("Автор1", "Название1", 2000, 300);
        Book book2 = new Book("Автор2", "Название2", 1995, 342);
        Book book3 = new Book("Автор3", "Название3", 2010, 414);

        bookshelf.addBook(book1);
        bookshelf.addBook(book2);
        bookshelf.addBook(book3);

        System.out.println("Все книги на полке:");
        bookshelf.displayBooks();

        System.out.println("\nКнига с самым ранним годом издания:");
        System.out.println(bookshelf.findEarliestBook());

        System.out.println("\nКнига с самым поздним годом издания:");
        System.out.println(bookshelf.findLatestBook());

        System.out.println("\nСортировка книг по году издания:");
        bookshelf.sortBooks();
        bookshelf.displayBooks();
    }
}
