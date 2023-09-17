package lab41.task10;

public class Tester {
    public static void main(String[] args) {
        Car car = new Car("Машина", 100.0, 10.0);
        Airplane airplane = new Airplane("Самолет", 800.0, 50.0);
        Train train = new Train("Поезд", 120.0, 20.0);
        Ship ship = new Ship("Корабль", 30.0, 15.0);

        double distance = 550.0;

        System.out.println(car.getName() + " время: " + car.calculateTime(distance) + " часов, стоимость: $" + car.calculateCost(distance));
        System.out.println(airplane.getName() + " время: " + airplane.calculateTime(distance) + " часов, стоимость: $" + airplane.calculateCost(distance));
        System.out.println(train.getName() + " время: " + train.calculateTime(distance) + " часов, стоимость: $" + train.calculateCost(distance));
        System.out.println(ship.getName() + " время: " + ship.calculateTime(distance) + " часов, стоимость: $" + ship.calculateCost(distance));
    }
}
