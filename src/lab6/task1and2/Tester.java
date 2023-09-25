package lab6.task1and2;

public class Tester {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(100,0,20,30,5);
        MovablePoint point = new MovablePoint(0,0,10,10);
        point.moveUp();
        System.out.println(point);
        point.moveRight();
        System.out.println(point);
        point.moveLeft();
        System.out.println(point);
        point.moveDown();
        System.out.println(point);

        circle.moveLeft();
        System.out.println(circle);
        circle.moveRight();
        System.out.println(circle);
        circle.moveUp();
        System.out.println(circle);
        circle.moveDown();
        System.out.println(circle);

        MovablePoint point1 = new MovablePoint(0,100,10,10);
        MovablePoint point2 = new MovablePoint(100,0,10,10);
        MovablePoint point3 = new MovablePoint(200,10,10,100);

        MovableRectangle rectangle = new MovableRectangle(point1,point2);
        System.out.println(rectangle);
        MovableRectangle rectangleError = new MovableRectangle(point1,point3);
        System.out.println(rectangleError);
    }
}
