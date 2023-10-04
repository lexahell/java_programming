package lab11.task2;

import java.util.Comparator;
import java.util.Date;

public class CompareDates {
    private Date userDate;
    public CompareDates(Date userDate) {
        this.userDate = userDate;
    }

    public Date getUserDate() {
        return userDate;
    }
    public void compare(Date currentDate) {
        if (this.userDate.before(currentDate)) {
            System.out.println("Введенная дата меньше текущей даты.");
        } else if (this.userDate.after(currentDate)) {
            System.out.println("Введенная дата больше текущей даты.");
        } else {
            System.out.println("Введенная дата совпадает с текущей датой.");
        }
    }
}
