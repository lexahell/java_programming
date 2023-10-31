package lab23;

public class Variable implements Evaluatable{
    private final String name;
    @Override
    public double evaluate(double varVal) {
        return varVal;
    }
    public Variable(String name){
        this.name = name;
    }
}
