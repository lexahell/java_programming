package lab23;

import java.util.Arrays;

public class ArrayQueue<E> extends AbstractQueue implements Queue<E>{
    private Object[] qArr;
    public ArrayQueue(E[] queue){
        qArr = new Object[queue.length];
        System.arraycopy(queue, 0, qArr, 0, queue.length);
        size = queue.length;
    }
    public ArrayQueue(){
        qArr = new Object[0];
    }
    @Override
    public void enqueue(E elem){
        Object[] nqArr = new Object[size+1];
        for(int i = 0; i < size; i++){
            nqArr[i] = qArr[i];
        }
        nqArr[size] = elem;
        qArr = nqArr;
        size += 1;
    }
    @Override
    public E element(){
        if(size > 0){
            return (E)qArr[0];
        }else{
            return null;
        }
    }
    @Override
    public E dequeue(){
        if(size > 0){
            Object elem = qArr[0];
            Object[] nqArr = new Object[size-1];
            for(int i = 1; i < size; i++){
                nqArr[i-1] = qArr[i];
            }
            qArr = nqArr;
            size -= 1;
            return (E)elem;
        }else{
            return null;
        }
    }

    @Override
    public void clear() {
        qArr = new Object[0];
        size = 0;
    }

    @Override
    public String toString(){
        return Arrays.toString(qArr);
    }
}
