package lab24.task2;

public class Client {

    public Chair chair;

    public void sit(){
        System.out.println("Сел на стул");
        if (chair instanceof MagicChair){
            ((MagicChair) chair).doMagic();
        }
        else if (chair instanceof VictorianChair){
            int age = ((VictorianChair) chair).getAge();
            System.out.println("Стул имеет возраст: " + age);
        }
        else if(chair instanceof FunctionalChair){
            int sum = ((FunctionalChair)chair).sum(1, 7);
            System.out.println("Сумма равна: " + sum);
        }
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
