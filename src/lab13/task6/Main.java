package lab13.task6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Введите имя файла: ");
            String fileName = reader.readLine();
            reader.close();
            System.out.println(getLine(fileName));
        } catch(IOException e) {
            System.out.print(e.getMessage());
        }
    }
    public static String getLine(String fileName) throws IOException{
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        List<String> words = new ArrayList<>();
        String line;
        while ((line = fileReader.readLine()) != null) {
            String[] wordArray = line.split(" ");
            for (String word : wordArray) {
                words.add(word);
            }
        }
        fileReader.close();

        if (words.isEmpty()) {
            return "Файл пустой";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(words.get(0));
        words.remove(0);
        while(!words.isEmpty()) {
            boolean found = false;
            for(int i = 0; i < words.size(); ++i) {
                String lastLetter = sb.substring(sb.length() - 1);
                String firstLetter = words.get(i).substring(0, 1);
                if(lastLetter.equalsIgnoreCase(firstLetter)) {
                    sb.append(" ");
                    sb.append(words.get(i));
                    words.remove(i);
                    found = true;
                    break;
                }
            }
            if(!found) {
                break;
            }
        }
        return sb.toString();
    }
}
