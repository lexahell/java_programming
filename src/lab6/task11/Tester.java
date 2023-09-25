package lab6.task11;


import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру по Цельсию: ");
        double celsiusTemperature = scanner.nextDouble();

        Convertable kelvin = new Kelvin();
        Convertable fahrenheit = new Fahrenheit();

        double kelvinTemperature = kelvin.convert(celsiusTemperature);
        double fahrenheitTemperature = fahrenheit.convert(celsiusTemperature);
        System.out.println("Температура по Кельвину: " + celsiusTemperature + " C");
        System.out.println("Температура по Кельвину: " + kelvinTemperature + " K");
        System.out.println("Температура по Фаренгейту: " + fahrenheitTemperature + " °F");
    }
}
