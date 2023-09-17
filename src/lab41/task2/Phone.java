package lab41.task2;

public class Phone {
    public String number;
    public String model;
    public double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

        this("", "");
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + ", номер: " + callerNumber);
    }

    public void sendMessage(String... phoneNumbers) {
        if (phoneNumbers.length != 1) {
            System.out.println("Отправка сообщения на следующие номера:");
        } else {
            System.out.println("Отправка сообщения на следующий номер: ");
        }
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }
}
