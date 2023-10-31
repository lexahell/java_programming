package lab22;

import javax.swing.*;
import java.util.EmptyStackException;
import java.util.Stack;

public class CalculatorModel{
    Stack<String> numbers;
    Stack<String> operations;
    public CalculatorModel(){
        numbers = new Stack<>();
        operations = new Stack<>();
    }
    public String calculate(String expr){
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
            return String.valueOf(numbers.pop());
        }catch (EmptyStackException e){
            System.out.println("Невозможно выполнить POP для пустого стека");
            JOptionPane.showMessageDialog(null, "Выражение введено неверно", "Error",JOptionPane.ERROR_MESSAGE);
            return "";
        }
    }
}
