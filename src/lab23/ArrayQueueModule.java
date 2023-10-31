package lab23;

public class ArrayQueueModule <E>{
    private ArrayQueue<E> queue;

    public ArrayQueueModule(E[] arr){
        queue = new ArrayQueue<>(arr);
    }
    public ArrayQueueModule(){
        queue = new ArrayQueue<>();
    }
    public E cycle(){
        E cycled = queue.dequeue();
        if(cycled != null){
            queue.enqueue(cycled);
        }
        return cycled;
    }
    public void addElements(E[] elems){
        for (E i: elems) {
            queue.enqueue(i);
        }
    }
    public boolean isInQueue(E elem){
        boolean flag = false;
        for(int i = queue.size(); i > 0; i--){
            if (cycle().equals(elem) && !flag){
                flag = true;
            }
        }
        return flag;
    }
    public void enqueue(E elem){
        queue.enqueue(elem);
    }
    public E element(){
        return queue.element();
    }
    public E dequeue(){
        return queue.dequeue();
    }
    public int size() {
        return queue.size();
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    public void clear(){
        queue.clear();
    }
    @Override
    public String toString(){
        return queue.toString();
    }
}
