package lab2.task1;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Пушкин","pochta_pushkina@mail.ru",'M');
        System.out.println(a1.toString());
        String updateEmail="new_pochta@mail.ru";
        System.out.println("Имя автора:" + a1.getName());
        a1.setEmail(updateEmail);
        System.out.println("Email: " + a1.getEmail());
        System.out.println("Gender:" + a1.getGender());
    }
}
