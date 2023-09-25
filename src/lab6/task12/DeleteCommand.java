package lab6.task12;

public class DeleteCommand implements Command{
    private final int lengthToDelete;
    private final String deletedText;
    public DeleteCommand(int lengthToDelete, String deletedText) {
        this.lengthToDelete = lengthToDelete;
        this.deletedText = deletedText;
    }
    public void execute(StringBuilder sb) {
        int currentLength = sb.length();
        if(this.lengthToDelete <= currentLength) {
            sb.delete(currentLength - this.lengthToDelete, currentLength);
        }
    }
    public void undo(StringBuilder sb) {
        sb.append(this.deletedText);
    }
}