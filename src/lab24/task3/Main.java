package lab24.task3;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ICreateDocument textDocumentFactory = new CreateTextDocument();
        ICreateDocument musicDocumentFactory = new CreateMusicDocument();
        ICreateDocument imageDocumentFactory = new CreateImageDocument();

        EditorWindow textEditor = new EditorWindow(textDocumentFactory, "text", Color.RED);
        EditorWindow musicEditor = new EditorWindow(musicDocumentFactory, "music", Color.GREEN);
        EditorWindow imageEditor = new EditorWindow(imageDocumentFactory, "image", Color.YELLOW);
    }
}




