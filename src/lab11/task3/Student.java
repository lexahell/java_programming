package lab11.task3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private SimpleDateFormat formatter;
    public Student(String name, int id, Date dateOfBirth) {
        String[] firstAndSecondNames = name.split(" ");
        this.firstName = firstAndSecondNames[0];
        this.lastName = firstAndSecondNames[1];
        this.id = id;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }
    public void setFormatType(SimpleDateFormat formatter) {
        this.formatter = formatter;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatter2 = new SimpleDateFormat("dd MMM, yyyy");
        SimpleDateFormat formatter3 = new SimpleDateFormat("EEEE, dd MMM, yyyy");
        return "Имя: " + this.firstName + "\nФамилия: " + this.lastName + "\nId: " + this.id + "\nДата рождения: " + this.formatter.format(this.dateOfBirth);
    }
}
