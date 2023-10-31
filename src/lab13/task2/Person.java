package lab13.task2;

public class Person {
    private String secondname;
    private String firstname;
    private String otchestvo;
    public Person(String secondname){
        this.secondname = secondname;
    }
    public Person(String secondname, String firstname, String otchestvo){
        this.secondname = secondname;
        this.firstname = firstname;
        this.otchestvo = otchestvo;
    }
    public String getNames(){
        if (firstname==null || otchestvo==null){
            return secondname;
        }
        else{
            return secondname +' '+ firstname.charAt(0)+'.'+otchestvo.charAt(0)+'.';
        }
    }
}
