package lab23;

public abstract class AbstractQueue{
    protected int size = 0;
    public int size() {
        return size;
    }
    public boolean isEmpty(){
        return (size == 0);
    }
}
