package lab23;

public class Const implements Evaluatable{
    private final double value;
    @Override
    public double evaluate(double varVal) {
        return value;
    }

    public Const(double value){
        this.value = value;
    }
}
