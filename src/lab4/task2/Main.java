package lab4.task2;


enum Size {
    XXS (32), XS (34), S(36), M(38), L(40);
    private int euroSize;
    Size(int euroSize ) {
        this.euroSize = euroSize;
    }
    public String getDescription() {
        if (this == XXS) {
            return "Детский размер";
        } else {
            return "Взрослый размер";
        }
    }
    public int getEuroSize() {
        return euroSize;
    }
}

interface MenClothing {
    void dressMan();
}

interface WomenClothing {
    void dressWomen();
}
abstract class Clothes{
    protected Size size;
    protected double cost;
    protected String color;

    public Clothes(Size size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }
}

class TShirt extends Clothes implements MenClothing, WomenClothing{
    public TShirt(Size size, double cost, String color){
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одет в футболку");
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина одета в футболку");
    }
}
class Pants extends Clothes implements MenClothing, WomenClothing{
    public Pants(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одет в штаны");
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина одета в штаны");
    }
}
class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина одета в юбку");
    }
}
class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double cost, String color) {
        super(size, cost, color);
    }
    @Override
    public void dressMan() {
        System.out.println("Мужчина одет в галстук");
    }
}
class Atelier{
    public void dressWomen(Clothes[] clothes){
        System.out.println("Женская одежда: ");
        for (Clothes item : clothes){
            if (item instanceof WomenClothing){
                System.out.println("Размер: " + item.size + ", Цена: " + item.cost + ", Цвет: " + item.color);
                ((WomenClothing) item).dressWomen();
            }
        }
    }

    public void dressMan(Clothes[] clothes){
        System.out.println("Мужская одежда:");
        for (Clothes item : clothes) {
            if (item instanceof MenClothing) {
                System.out.println("Размер: " + item.size + ", Цена: " + item.cost + ", Цвет: " + item.color);
                ((MenClothing) item).dressMan();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.M, 999.99, "Черная"),
                new Pants(Size.L, 3400.00, "Серые"),
                new Skirt(Size.S, 2699.99, "Красная"),
                new Tie(Size.XS,  550.00, "Зеленый")
        };
        Atelier atelier = new Atelier();
        atelier.dressWomen(clothes);
        atelier.dressMan(clothes);
    }
}
