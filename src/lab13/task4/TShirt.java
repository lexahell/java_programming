package lab13.task4;

public class TShirt {
    String s;
    String type;
    String color;
    String size;
    public TShirt(String str){
        String[] spls = str.split(",");
        s = spls[0];
        type = spls[1];
        color = spls[2];
        size = spls[3];
    }
    @Override
    public String toString(){
        return "Serial: "+s+" Type: "+type+" Color: "+color+" Size: "+size;
    }
}
