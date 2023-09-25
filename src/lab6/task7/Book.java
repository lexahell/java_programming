package lab6.task7;


import lab6.task6.Printable;

public class Book implements Printable {
    private String name;
    public Book(String name) {
        this.name = name;
    }
    public void print(){
        System.out.println(this.name);
    }
}
