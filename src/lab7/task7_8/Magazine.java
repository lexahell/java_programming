package lab7.task7_8;

public class Magazine implements Printable{
    private String name;
    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
    }
    public static void printMagazines(Printable[] printable) {
        for(Printable item: printable) {
            if(item instanceof Magazine) {
                item.print();
            }
        }
    }
}
