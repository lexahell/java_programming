package lab2.task7;

import java.util.Arrays;

public class Bookshelf {
    private Book[] books;
    private int numberOfBooks;

    public Bookshelf(int sizeBookshelf){
        this.books = new Book[sizeBookshelf];
        this.numberOfBooks = 0;
    }
    public void addBook(Book book) {
        if (numberOfBooks < books.length) {
            books[numberOfBooks] = book;
            numberOfBooks++;
        } else {
            System.out.println("На книжной полке нет свободного места!");
        }
    }
    // Метод поиска книги с самым ранним годом издания
    public Book findEarliestBook() {
        if (numberOfBooks == 0){
            return null;
        }
        Book erliestBook = books[0];
        for (int i = 1; i < numberOfBooks;i++){
            if (books[i].getYear_of_writing() < erliestBook.getYear_of_writing()){
                erliestBook = books[i];
            }
        }
        return erliestBook;
    }
    // Метод поиска книги с самым поздним годом издания
    public Book findLatestBook() {
        if (numberOfBooks == 0){
            return null;
        }
        Book LatestBook = books[0];
        for (int i = 1; i < numberOfBooks;i++){
            if (books[i].getYear_of_writing() > LatestBook.getYear_of_writing()){
                LatestBook = books[i];
            }
        }
        return LatestBook;
    }
    // Метод для сортировки книг по году издания
    public void sortBooks(){
        for (int i = 0; i < numberOfBooks;i++){
            for (int j = i+1; j < numberOfBooks-1;j++){
                if (books[i].getYear_of_writing() > books[j].getYear_of_writing()){
                    Book temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }
    }
    // Метод для вывода всех книг на полке
    public void displayBooks() {
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println(books[i]);
        }
    }
}
