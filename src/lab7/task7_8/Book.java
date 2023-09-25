package lab7.task7_8;

public class Book implements Printable{
    private String name;
    public Book(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(this.name);
    }
    public static void printBooks(Printable[] printable) {
        for(Printable item: printable) {
            if(item instanceof Book) {
                item.print();
            }
        }
    }
}
