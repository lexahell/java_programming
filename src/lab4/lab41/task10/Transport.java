package lab4.lab41.task10;

public abstract class Transport {
    private String name;
    private double speed;
    private double costPerHour;

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public double getCostPerHour() {
        return costPerHour;
    }

    public Transport(String name, double speed, double costPerHour) {
        this.name = name;
        this.speed = speed;
        this.costPerHour = costPerHour;
    }

    public abstract double calculateTime(double distance);

    public abstract double calculateCost(double distance);
}
