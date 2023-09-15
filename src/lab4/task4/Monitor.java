package lab4.task4;

public class Monitor {
    private String model;
    private int screenSize;

    public Monitor(String model, int screenSize) {
        this.model = model;
        this.screenSize = screenSize;
    }

    public String getModel() {
        return model;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}
