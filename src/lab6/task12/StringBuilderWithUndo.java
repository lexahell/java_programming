package lab6.task12;
import java.util.ArrayList;
import java.util.List;
public class StringBuilderWithUndo {
    private StringBuilder stringBuilder;
    private List<Command> commandHistory;

    public StringBuilderWithUndo() {
        this.stringBuilder = new StringBuilder();
        this.commandHistory = new ArrayList<Command>();
    }

    public void append(String text) {
        Command command = new AppendCommand(text);
        command.execute(this.stringBuilder);
        commandHistory.add(command);
    }

    public void delete(int length) {
        int currentLength = stringBuilder.length();
        if (currentLength >= length) {
            String deletedText = stringBuilder.substring(currentLength - length);
            Command command = new DeleteCommand(length, deletedText);
            command.execute(this.stringBuilder);
            commandHistory.add(command);
        }
    }

    public void undo() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.remove(commandHistory.size() - 1);
            lastCommand.undo(this.stringBuilder);
        }
    }

    public String toString() {
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        StringBuilderWithUndo sb = new StringBuilderWithUndo();

        sb.append("Гоша ");
        sb.append("Король Севера!");
        System.out.println(sb.toString());

        sb.delete(14);
        System.out.println(sb.toString());

        sb.undo();
        System.out.println(sb.toString());
    }
}