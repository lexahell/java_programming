package lab23;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args){
        //Задание 1
        ArrayQueueModule<Integer> q1 = new ArrayQueueModule<>();
        q1.addElements(new Integer[]{1,2,3,4,5,6,7,8,9});
        System.out.println(q1.cycle());
        System.out.println(q1.size());
        System.out.println(q1);

        System.out.println();
        ArrayQueue<Double> q2 = new ArrayQueue<>();
        ArrayQueueADT.addElements(q2, new Double[]{1.2,3.4,5.6});
        System.out.println(q2);
        System.out.println(ArrayQueueADT.cycle(q2));
        System.out.println(q2);
        System.out.println(ArrayQueueADT.isInQueue(q2, 1.2));
        System.out.println(q2.size());
        q2.clear();
        System.out.println(q2.size());
        System.out.println(q2);
        //Задание 2
        System.out.println();
        Queue<Integer> q3 = new ArrayQueue<>(new Integer[]{1,3,2});
        System.out.println(q3);
        System.out.println(q3.size());
        System.out.println(q3.dequeue());
        System.out.println(q3);
        System.out.println(q3.size());
        q3.clear();
        System.out.println(q3);

        System.out.println();
        LinkedQueue<Double> q4 = new LinkedQueue<>(new Double[]{1.2,3.4,5.6});
        System.out.println(q4);
        System.out.println(q4.dequeue());
        System.out.println(q4);
        q4.enqueue(7.8);
        q4.enqueue(9.1);
        System.out.println(q4);
        System.out.println(q4.size());
        q4.clear();
        System.out.println(q4);
        System.out.println(q4.size());
        //Задание 3
        Scanner scanner = new Scanner(System.in);
        System.out.println(new Subtract(new Multiply(new Const(2), new Variable("x")), new Const(3)).evaluate(5));//((x*2) - 7)
        System.out.print("Введите x для выражения x^2 - 2x +1:");
        System.out.println(new Add(
                new Subtract(
                        new Multiply(
                                new Variable("x"),
                                new Variable("x")),
                        new Multiply(
                                new Const(2),
                                new Variable("x"))),
                new Const(1)).evaluate(scanner.nextDouble()));//( ( (x*x) - (2 * x) ) + 1)
    }
}
