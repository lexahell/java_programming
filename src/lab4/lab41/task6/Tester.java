package lab4.lab41.task6;

public class Tester {
    public static void main(String[] args) {
        Employer employer = new Employer("Иван", "Васильев", 70000);
        Manager manager = new Manager("Петр", "Иванов", 90000, 4000);
        System.out.println("Заработная плата сотрудника: " + employer.getIncome());
        System.out.println("Заработная плата менеджера: " + manager.getIncome());

        Employer[] employees = new Employer[2];
        employees[0] = employer;
        employees[1] = manager;

        for (Employer emp : employees) {
            System.out.println("Заработная плата: " + emp.getIncome());
        }
    }

}