package lab41.task7;

public class Tester {
    public static void main(String[] args) {
        Learner[] studyPeople = new Learner[4];
        studyPeople[0] = new SchoolChild("Иван", 14, 9);
        studyPeople[1] = new SchoolChild("Мария", 13, 8);
        studyPeople[2] = new Student("Алексей", 20, "РГУ");
        studyPeople[3] = new Student("Ольга", 21, "МГУ");
        System.out.println("Школьники:");
        for (Learner people : studyPeople) {
            if (people instanceof SchoolChild) {
                SchoolChild schoolChild = (SchoolChild) people;
                System.out.println(schoolChild);
            }
        }

        System.out.println("\nСтуденты:");
        for (Learner people : studyPeople) {
            if (people instanceof Student) {
                Student student = (Student) people;
                System.out.println(student);
            }
        }
    }
}
