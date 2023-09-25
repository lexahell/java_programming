package lab6.task9;

import lab6.task6.Printable;
import lab6.task7.Book;

public class Tester {
    public static void main(String[] args) {
        Printable[] books = new Printable[]{
                new Book("книга 1"),
                new Book("журнал 1"),
                new Book("книга 2")
        };
        for(Printable book: books) {
            book.print();
        }
    }
}
