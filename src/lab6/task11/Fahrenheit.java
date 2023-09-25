package lab6.task11;

class Fahrenheit implements Convertable {
    @Override
    public double convert(double temperature) {
        return (temperature * 9/5) + 32;
    }
}
