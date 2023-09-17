package lab41.task10;

public class Train extends Transport {
    public Train(String name, double speed, double costPerHour) {
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
