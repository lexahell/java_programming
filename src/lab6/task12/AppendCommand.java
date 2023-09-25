package lab6.task12;

public class AppendCommand implements Command{
    private final String textToAdd;
    public AppendCommand(String textToAdd) {
        this.textToAdd = textToAdd;
    }

    public void execute(StringBuilder sb) {
        sb.append(this.textToAdd);
    }
    public void undo(StringBuilder sb) {
        int start = sb.length() - textToAdd.length();
        int end = sb.length();
        sb.delete(start, end);
    }
}