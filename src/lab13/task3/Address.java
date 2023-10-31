package lab13.task3;

import java.util.StringTokenizer;

public class Address {
    String strana;
    String region;
    String gorod;
    String ulitsa;
    String dom;
    String korpus;
    String kvartira;
    public Address(String addr){
        String[] spladdr = addr.split(",");
        strana = spladdr[0];
        region = spladdr[1];
        gorod = spladdr[2];
        ulitsa = spladdr[3];
        dom = spladdr[4];
        korpus = spladdr[5];
        kvartira = spladdr[6];
    }
    public Address(String addr, String splitter){
        StringTokenizer tokenizer = new StringTokenizer(addr, splitter);
        strana = tokenizer.nextToken();
        region = tokenizer.nextToken();
        gorod = tokenizer.nextToken();
        ulitsa = tokenizer.nextToken();
        dom = tokenizer.nextToken();
        korpus = tokenizer.nextToken();
        kvartira = tokenizer.nextToken();
    }
    @Override
    public String toString(){
        return "Страна: " + strana + '\n' + "Регион: " + region + '\n' + "Город: " + gorod + '\n' + "Улица: " + ulitsa + '\n' + "Дом: " + dom + '\n' + "Корпус: " + korpus + '\n' + "Квартира: " + kvartira;
    }
}
