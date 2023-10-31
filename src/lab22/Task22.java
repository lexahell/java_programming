package lab22;


import javax.swing.*;
import java.util.EmptyStackException;
import java.util.Stack;

public class Task22 {
    private static void polCalc(String expr){
        String[] parts = expr.split(" +");
        Stack<Double> numbers = new Stack<>();
        try {
            for (String i : parts) {
                try {
                    numbers.push(Double.parseDouble(i));
                } catch (NumberFormatException e) {
                    double first = numbers.pop();
                    double second = numbers.pop();
                    if (i.equals("/")) {
                        numbers.push(second / first);
                    } else if (i.equals("*")) {
                        numbers.push(second * first);
                    } else if (i.equals("-")) {
                        numbers.push(second - first);
                    } else if (i.equals("+")) {
                        numbers.push(second + first);
                    }
                }
            }
            if(numbers.size() > 1){
                throw new EmptyStackException();
            }
            System.out.println(numbers.pop());
        }catch (EmptyStackException e){
            System.out.println("Неверное выражение");
        }
    }
    public static void main(String[] args){
        //Задание 1
        polCalc("4 5 * 6 -");
        //Задание 2
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorControl(new CalculatorView(), new CalculatorModel());
            }
        });
    }
}
