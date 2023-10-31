package lab24.task3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditorWindow {
    private ICreateDocument documentFactory;
    private IDocument document;

    public EditorWindow(ICreateDocument documentFactory, String name, Color color) {
        this.documentFactory = documentFactory;

        // Создание главного окна редактора
        JFrame frame = new JFrame(name);

        // Создание меню File
        JMenu fileMenu = new JMenu("File");

        // Пункт меню New
        JMenuItem newItem = new JMenuItem("New");
        newItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                document = documentFactory.createNew();
                document.open();
            }
        });

        // Пункт меню Open
        JMenuItem openItem = new JMenuItem("Open");
        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                document = documentFactory.createOpen();
                document.open();
            }
        });

        // Пункт меню Save
        JMenuItem saveItem = new JMenuItem("Save");
        saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (document != null) {
                    document.save();
                }
            }
        });

        // Пункт меню Exit
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
//                System.exit(0);
            }
        });

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        // Создание главного меню
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().setBackground(color);
    }
}

