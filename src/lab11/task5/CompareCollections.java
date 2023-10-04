package lab11.task5;

import java.util.Date;
import java.util.List;

public class CompareCollections {
    public long insertionOperation(List<Integer> list) {
        Date start = new Date();
        list.set(list.size() / 2, 2);
        Date end = new Date();
        return end.getTime() - start.getTime();
    }
    public long deleteOperation(List<Integer> list) {
        Date start = new Date();
        list.remove(list.size() / 2);
        Date end = new Date();
        return end.getTime() - start.getTime();
    }
    public long addingOperation(List<Integer> list) {
        Date start = new Date();
        list.add(5);
        Date end = new Date();
        return end.getTime() - start.getTime();
    }
    public long sampleSearchOperation(List<Integer> list) {
        Date start = new Date();
        boolean result = list.contains(4);
        Date end = new Date();
        return end.getTime() - start.getTime();
    }
}
