package lab4.task1;

import lab4.task1.Seasons;

public class Tester {
    public static void main(String[] args) {
        Seasons favourite = Seasons.WINTER;
        Seasons.printFavouriteSeason(favourite);
        Seasons[] seasons = new Seasons[]{Seasons.SPRING, Seasons.SUMMER, Seasons.AUTUMN, Seasons.WINTER};
        for(int i = 0; i < seasons.length; i++) {
            System.out.println(Seasons.values()[i]);
            System.out.println("Средняя температура: " + seasons[i].getAverageTemperature() + " °С");
            Seasons.getDescription(seasons[i]);
        }
    }
}
