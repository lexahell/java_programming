package lab6.task12;

public interface Command {
    public void execute(StringBuilder sb);
    public void undo(StringBuilder sb);
}
