package lab2.task9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        String[] suits = {"буби", "черви", "пики", "крести"};
        ArrayList<String>deck = new ArrayList<String>(52);
        int i = 0;
        for (int value:values) {
            for (String suit:suits) {
                if (value >= 2 && value <=10) {
                    deck.add(i,value + " " + suit);
                }else if(value == 1){
                    deck.add(i,"Туз" + " " + suit);
                }else if(value ==11 ){
                    deck.add(i,"Валет" + " " + suit);
                }else if(value ==12){
                    deck.add(i,"Дама" + " " + suit);
                }else {
                    deck.add(i,"Король" + " " + suit);
                }
                i++;
            }
        }
        System.out.println("Введите число игроков");
        if (!scanner.hasNextInt()){
            System.out.println("Ошибка ввода");
            return;
        }
        int number_players = scanner.nextInt();
        if(number_players <= 0 || number_players>9){
            System.out.println("Введено неположительное число или слишком большое(максимальное число игроков 9)");
            return;
        }
        String[] CardsInGame = new String[number_players*5];
        for(int j = 0; j < number_players; j++){
            for (int k = 0; k < 5;k++){
                int index = (int) (Math.random() * deck.size());
                String card = deck.remove(index);
                System.out.print(card);
                if(k<4){
                    System.out.print(",");
                }
                System.out.print(" ");

            }
            System.out.println();
            System.out.println();
        }
    }
}
