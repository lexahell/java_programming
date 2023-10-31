package lab23;

import java.util.List;

public class ArrayQueueADT {
    public static <E> E cycle(ArrayQueue<E> queue){
        E cycled = queue.dequeue();
        if(cycled != null){
            queue.enqueue(cycled);
        }
        return cycled;
    }
    public static <E> void addElements(ArrayQueue<E> queue, E[] elems){
        for (E i: elems) {
            queue.enqueue(i);
        }
    }
    public static <E> boolean isInQueue(ArrayQueue<E> queue, E elem){
        boolean flag = false;
        for(int i = queue.size(); i > 0; i--){
            if (cycle(queue).equals(elem) && !flag){
                flag = true;
            }
        }
        return flag;
    }
}
