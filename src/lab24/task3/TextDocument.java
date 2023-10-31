package lab24.task3;

public class TextDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Opening a text document");
    }

    @Override
    public void save() {
        System.out.println("Saving a text document");
    }
}
