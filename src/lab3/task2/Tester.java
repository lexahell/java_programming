package lab3.task2;

import java.util.Arrays;
import java.util.Comparator;

public class Tester{
    private Circle[] circles;
    private int countCircles;
    public Tester(int count){
        this.circles = new Circle[count];
        this.countCircles = 0;
    }
    public void addCircle(Circle circle){
        if (countCircles < circles.length){
            circles[countCircles]= circle;
            countCircles++;
        } else {
            System.out.println("Массив окружностей заполнен.");
        }
    }
    public Circle findSmallestCircle(){
        if (countCircles == 0){
            return  null;
        }
        Circle smallestCircle = circles[0];
        for (int i =1; i < countCircles;i++){
            if (circles[i].getRadius() < smallestCircle.getRadius()){
                smallestCircle = circles[i];
            }
        }
        return smallestCircle;
    }
    public Circle findLargestCircle(){
        if (countCircles==0) {
            return null;
        }
        Circle largestCircle = circles[0];
        for (int i = 1; i < countCircles;i++){
            if (circles[i].getRadius() > largestCircle.getRadius()){
                largestCircle = circles[i];
            }
        }
        return largestCircle;
    }
    public void sortCirclesByRadius(){
        for (int i = 0; i < countCircles;i++){
            for(int j = 1; j < countCircles-i;j++){
                if (circles[j-1].getRadius() > circles[j].getRadius()){
                    Circle temp = circles[j-1];
                    circles[j-1] = circles[j];
                    circles[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Tester tester = new Tester(5);
        for (int i = 0; i < 5; i++){
            Circle randomCircle = Circle.createRandomCircle();
            tester.addCircle(randomCircle);
        }
        System.out.println("Окружности до сортировки по радиусу: ");
        for (Circle circle : tester.circles){
            System.out.println(circle);
        }

        System.out.println("Самая маленькая окружность:");
        System.out.println(tester.findSmallestCircle());

        System.out.println("Самая большая окружность:");
        System.out.println(tester.findLargestCircle());

        System.out.println("Окружности после сортировки по радиусу:");
        tester.sortCirclesByRadius();

        for (Circle circle : tester.circles){
            System.out.println(circle);
        }
    }
}
