package lab6.task10;

public class Processor {
    private String model;
    private double clockSpeed; // в ГГц

    public Processor(String model, double clockSpeed) {
        this.model = model;
        this.clockSpeed = clockSpeed;
    }
    public String getModel() {
        return model;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setClockSpeed(double clockSpeed) {
        this.clockSpeed = clockSpeed;
    }
}
