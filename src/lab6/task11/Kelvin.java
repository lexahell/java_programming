package lab6.task11;

class Kelvin implements Convertable {
    @Override
    public double convert(double temperature) {
        return temperature + 273.15;
    }
}
