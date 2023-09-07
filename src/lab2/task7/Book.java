package lab2.task7;

public class Book {
    private String author;
    private String title;
    private int year_of_writing;
    private int numberOfPages;

    public Book(String author, String title, int year_of_writing, int numberOfPages) {
        this.author = author;
        this.title = title;
        this.year_of_writing = year_of_writing;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear_of_writing() {
        return year_of_writing;
    }

    public void setYear_of_writing(int year_of_writing) {
        this.year_of_writing = year_of_writing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year_of_writing=" + year_of_writing +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
