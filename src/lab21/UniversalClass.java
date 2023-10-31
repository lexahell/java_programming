package lab21;

import java.util.Arrays;

public class UniversalClass<E>{
    E [] arr;
    public UniversalClass(E [] arr){
        this.arr = arr;
    }
    public E getByInd(int ind){
        return arr[ind];
    }
    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}