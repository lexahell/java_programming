package lab4.task1;

enum Seasons {
    WINTER(-5),
    SUMMER(18),
    AUTUMN(8),
    SPRING(10);
    public final double averageTemperature;

    Seasons(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }
    static public void getDescription(Seasons season) {
        if(season == Seasons.SUMMER) {
            System.out.println("Теплое время года");
        } else {
            System.out.println("Холодное время года");
        }
    }
    public double getAverageTemperature() {
        return this.averageTemperature;
    }
    static public void printFavouriteSeason(Seasons season) {
        switch(season) {
            case WINTER: {
                System.out.println("Я люблю зиму");
                break;
            }
            case SUMMER: {
                System.out.println("Я люблю лето");
                break;
            }
            case AUTUMN: {
                System.out.println("Я люблю осень");
                break;
            }
            case SPRING: {
                System.out.println("Я люблю весну");
                break;
            }
        }
    }
}

