package lab23;

public class LinkedQueue<E> extends AbstractQueue implements Queue<E>{
    private class QueueNode<E>{
        E value;
        QueueNode next;
        QueueNode(E value){
            this.value = value;
            this.next = null;
        }
    }
    private QueueNode<E> first;
    public LinkedQueue(E[] queue){
        first = null;
        for(E i:queue){
            if(first == null){
                first = new QueueNode<>(i);
            }else{
                for(QueueNode<E> j = first;;j = j.next){
                    if(j.next == null){
                        j.next = new QueueNode<>(i);
                        break;
                    }
                }
            }
        }
        size = queue.length;
    }
    public LinkedQueue(){
        first = null;
        size = 0;
    }
    @Override
    public void enqueue(E elem) {
        if(first == null){
            first = new QueueNode<>(elem);
        }else{
            for(QueueNode<E> j = first;;j = j.next){
                if(j.next == null){
                    j.next = new QueueNode<>(elem);
                    break;
                }
            }
        }
        size += 1;
    }

    @Override
    public E element() {
        if(first == null){
            return null;
        }else{
            return first.value;
        }
    }

    @Override
    public E dequeue() {
        if(first == null){
            return null;
        }else{
            E val = first.value;
            first = first.next;
            size -= 1;
            return val;
        }
    }

    @Override
    public void clear() {
        first = null;
        size = 0;
    }
    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        if(first != null){
            for(QueueNode<E> j = first;j != null;j = j.next){
                res.append(j.value.toString()).append(", ");
            }
            res.deleteCharAt(res.length()-1);
            res.deleteCharAt(res.length()-1);
        }
        return "[" +res.toString() + "]";
    }
}
