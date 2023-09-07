package lab2.task2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball();
        Ball ball2 = new Ball(25, 100);

        System.out.println("Координата x 1-го мяча: " + ball1.getX());
        System.out.println("Координата y 1-го мяча: " + ball1.getY());

        System.out.println("Координата x 2-го мяча: " + ball2.getX());
        System.out.println("Координата y 2-го мяча: " + ball2.getY());

        ball1.setX(2.42);
        ball1.setY(223.4);
        System.out.println("Координат мячей изменены");
        System.out.println("Координата x 1-го мяча: " + ball1.getX());
        System.out.println("Координата y 1-го мяча: " + ball1.getY());

        ball2.setXY(234.5, 53.3);
        System.out.println("Координата x 2-го мяча: " + ball2.getX());
        System.out.println("Координата y 2-го мяча: " + ball2.getY());

        ball2.move(10, 500);
        System.out.println(ball2.toString());
    }
}
