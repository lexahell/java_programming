package lab24.task2;

import lab24.task1.Complex;

public class Tester {
    public static void main(String[] args) {
        AbstractChairFactory factory = new ChairFactory();
        Chair chair1 = factory.createMagicChair();
        Chair chair2 = factory.createFunctionalChair();
        Chair chair3 = factory.createVictorianChair();
        Client client = new Client();
        client.setChair(chair1);
        client.sit();

        client.setChair(chair2);
        client.sit();

        client.setChair(chair3);
        client.sit();
    }
}
