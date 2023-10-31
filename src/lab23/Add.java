package lab23;

public class Add implements Evaluatable{
    private Evaluatable left;
    private Evaluatable right;
    @Override
    public double evaluate(double varVal) {
        return left.evaluate(varVal) + right.evaluate(varVal);
    }
    public Add(Evaluatable left, Evaluatable right){
        this.left = left;
        this.right = right;
    }
}
