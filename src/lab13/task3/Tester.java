package lab13.task3;

public class Tester {
    public static void main(String[] args) {
        Address a = new Address("Country1,region1,city1,street1,house1,corpus1,flat1");
        System.out.println(a);
        System.out.println();
        Address b = new Address("Country2.region2.city2.street2.house2.corpus2.flat2", ".");
        System.out.println(b);
        System.out.println();
        Address c = new Address("Country3;region3;city3;street3;house3;corpus3;flat3", ";");
        System.out.println(c);
        System.out.println();
        Address d = new Address("Country4|region4|city4|street4|house4|corpus4|flat4", "|");
        System.out.println(d);
        System.out.println();
    }
}
