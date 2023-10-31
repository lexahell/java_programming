package lab23;

public interface Queue<E>{
    void enqueue(E elem);
    E element();
    E dequeue();
    int size();
    boolean isEmpty();
    void clear();
}
