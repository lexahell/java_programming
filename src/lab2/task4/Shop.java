package lab2.task4;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Computer> ComputersInStoke = new ArrayList<Computer>();

    Shop(){}
    Shop(String[] arr){
        for (String elem:
             arr) {
            Computer new_comp = new Computer(elem);
            ComputersInStoke.add(new_comp);
        }
    }
    public boolean add_computer(String name){
        Computer new_comp = new Computer(name);
        return ComputersInStoke.add(new_comp);
    }
    public void remove_computer(String name){
        int index = this.search(name);
        ComputersInStoke.remove(index);
    }
    public int search(String name){
        for (int i = 0; i < ComputersInStoke.size();i++){
            if (name.equals(ComputersInStoke.get(i).getName())){
                return i;
            }
        };
        return -1;
    }

    @Override
    public String toString(){
        String result = "Computers in stoke: ";
        for (Computer comp:ComputersInStoke
             ) {
            result = result + comp.getName() + " ";
        }
        return result;
    }

}
