package lab23;

public class Subtract implements Evaluatable{
    private Evaluatable left;
    private Evaluatable right;
    @Override
    public double evaluate(double varVal) {
        return left.evaluate(varVal) - right.evaluate(varVal);
    }
    public Subtract(Evaluatable left, Evaluatable right){
        this.left = left;
        this.right = right;
    }
}
