package lab4.lab41.task10;

public class Car extends Transport {
    public Car(String name, double speed, double costPerHour) {
        super(name, speed, costPerHour);
    }

    @Override
    public double calculateTime(double distance) {
        return distance / getSpeed();
    }

    @Override
    public double calculateCost(double distance) {
        return calculateTime(distance) * getCostPerHour();
    }
}
