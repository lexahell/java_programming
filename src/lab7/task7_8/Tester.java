package lab7.task7_8;

public class Tester {
    public static void main(String[] args) {
        Printable[] printable = new Printable[]{
                new Book(    "книга 1"),
                new Magazine("журнал 1"),
                new Magazine("журнал 2")
        };
        Book.printBooks(printable);
        System.out.println("------------------");
        Magazine.printMagazines(printable);
    }
}
