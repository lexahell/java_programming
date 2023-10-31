package lab21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Solution{
    public static <T> ArrayList<T> newArrayList(T ... objs){
        return new ArrayList<>(Arrays.asList(objs));
    }
    public static <T> HashSet<T> newHashSet(T ... objs){
        return new HashSet<>(Arrays.asList(objs));
    }
    public static <K, V> HashMap<K,V> newHashMap(K[] ks, V[] vls) throws IllegalArgumentException{
        HashMap<K,V> map = new HashMap<>();
        if (ks.length != vls.length){
            throw new IllegalArgumentException("The key and value arrays must be the same size");
        }else{
            for(int i = 0; i < ks.length; i++){
                map.put(ks[i], vls[i]);
            }
        }
        return map;
    }
}
