package lab24.task3;

public class ImageDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Opening an image document");
    }

    @Override
    public void save() {
        System.out.println("Saving an image document");
    }
}