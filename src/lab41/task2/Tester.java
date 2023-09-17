package lab41.task2;

public class Tester {
    public static void main(String[] args) {
        Phone phone1 = new Phone("123-456-789", "Samsung Galaxy S22", 0.4);
        Phone phone2 = new Phone("987-654-321", "Google Pixel 7");
        Phone phone3 = new Phone("111-222-333", "iPhone 13", 0.35);

        System.out.println("Phone 1: " + phone1.getNumber() + ", " + phone1.getModel() + ", " + phone1.getWeight() + " кг");
        System.out.println("Phone 2: " + phone2.getNumber() + ", " + phone2.getModel() + ", " + phone2.getWeight() + " кг");
        System.out.println("Phone 3: " + phone3.getNumber() + ", " + phone3.getModel() + ", " + phone3.getWeight() + " кг");

        phone1.receiveCall("Мария");
        phone2.receiveCall("Петр", "666-777-888");
        phone3.receiveCall("Анна");

        phone1.sendMessage("333-222-111", "189-788-606");
        phone2.sendMessage("257-890-990");
    }
}
