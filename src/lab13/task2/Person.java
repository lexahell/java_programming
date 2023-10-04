package lab13.task2;

public class Person {
    private String secondname;
    private String firstname;
    private String surname;
    public Person(String secondname){
        this.secondname = secondname;
    }
    public Person(String secondname, String firstname, String surname){
        this.secondname = secondname;
        this.firstname = firstname;
        this.surname = surname;
    }
    public String getNames(){
        if (firstname==null){
            return secondname;
        }else{
            return secondname +' '+ firstname.charAt(0)+'.'+surname.charAt(0)+'.';
        }
    }
}
