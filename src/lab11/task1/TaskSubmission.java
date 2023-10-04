package lab11.task1;

import java.util.Date;

public class TaskSubmission {
    public static void main(String[] args) {
        String developerName = "Петров A.A";
        Date dateReceived = new Date();
        long sevenDaysInMillis = 24 * 60 * 60 * 1000L;
        Date dateSubmission = new Date(System.currentTimeMillis() + sevenDaysInMillis);


        System.out.println("Разработчик: " + developerName);
        System.out.println("Дата и время получения задания: " + dateReceived);
        System.out.println("Дата и время сдачи задания:     " + dateSubmission);
    }
}
