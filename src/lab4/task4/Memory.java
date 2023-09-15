package lab4.task4;

public class Memory {
    private int size; // в ГБ
    private String type;

    public Memory(int size, String type) {
        this.size = size;
        this.type = type;
    }
    public int getSize() {
        return size;
    }
    public String getType() {
        return type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }
}
