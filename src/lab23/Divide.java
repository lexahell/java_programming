package lab23;

public class Divide implements Evaluatable{
    private Evaluatable left;
    private Evaluatable right;
    @Override
    public double evaluate(double varVal) {
        return left.evaluate(varVal) / right.evaluate(varVal);
    }
    public Divide(Evaluatable left, Evaluatable right){
        this.left = left;
        this.right = right;
    }
}
