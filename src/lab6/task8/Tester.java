package lab6.task8;

import lab6.task6.Printable;

public class Tester {
    public static void main(String[] args) {
        Printable[] shops = new Printable[]{
                new Shop("КБ"),
                new Shop("5"),
                new Shop("Перекресток")
        };
        for(Printable shop: shops) {
            shop.print();
        }
    }
}
