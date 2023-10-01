package lab4.lab41.task6;

public class Employer {
    private String firstName;
    private String lastName;
    private double income;
    public Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }
    public double getIncome() {
        return this.income * 12;
    }
}
