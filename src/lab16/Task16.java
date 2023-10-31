package lab16;


import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.util.Random;


public class Task16 {
    private class Finder extends JFrame{
        Finder(){
            super("Finder");
            setDefaultCloseOperation( EXIT_ON_CLOSE );
            setSize(400, 400);
            class FoundListener implements MouseListener {
                int pos;
                static boolean found = false;
                static int tries = 0;
                static Random random = new Random();
                static int tofind = random.nextInt(20);
                String posName;
                public FoundListener(int pos, String posName){
                    this.pos = pos;
                    this.posName = posName;
                }
                public static void reset(){
                    found = false;
                    tries = 0;
                    tofind = random.nextInt(20);
                }
                @Override
                public void mouseClicked(MouseEvent e) {}
                @Override
                public void mousePressed(MouseEvent e) {}
                @Override
                public void mouseReleased(MouseEvent e) {}
                @Override
                public void mouseEntered(MouseEvent e) {
                    if ((tofind/4) == pos && tries < 2 && !found){
                        found = true;
                        JOptionPane.showMessageDialog(null, ("Позиция "+posName+" угадана!"));
                    }else if (!found){
                        if (tries < 2){
                            tries += 1;
                        }else{
                            JOptionPane.showMessageDialog(null, ("Позиция не найдена!"));
                            found = true;
                        }
                    }
                }
                @Override
                public void mouseExited(MouseEvent e) {}
            }
            JPanel main = new JPanel();
            main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
            JButton reset = new JButton("Сбросить");
            reset.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    FoundListener.reset();
                }
            });
            main.add(reset);
            JPanel container = new JPanel();
            container.setLayout(new BorderLayout(50,50));

            JLabel n = new JLabel("Север", JLabel.CENTER);
            n.setBorder(BorderFactory.createLineBorder(Color.RED));
            n.addMouseListener(new FoundListener(0, "Север"));

            JLabel s = new JLabel("Юг", JLabel.CENTER);
            s.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
            s.addMouseListener(new FoundListener(1, "Юг"));

            JLabel w = new JLabel("Запад", JLabel.CENTER);
            w.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
            w.addMouseListener(new FoundListener(2, "Запад"));

            JLabel e = new JLabel("Восток", JLabel.CENTER);
            e.setBorder(BorderFactory.createLineBorder(Color.GREEN));
            e.addMouseListener(new FoundListener(3, "Восток"));

            JLabel c = new JLabel("Центр", JLabel.CENTER);
            c.setBorder(BorderFactory.createLineBorder(Color.CYAN));
            c.addMouseListener(new FoundListener(4, "Центр"));

            container.add(n, BorderLayout.NORTH);
            container.add(s, BorderLayout.SOUTH);
            container.add(w, BorderLayout.WEST);
            container.add(e, BorderLayout.EAST);
            container.add(c, BorderLayout.CENTER);

            main.add(container);
            add(main);
            setVisible(true);
        }
    }
    private class TextColor extends JFrame{
        private JPanel tpanel;
        TextColor(){
            super("Text interactor");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(400,400);
            tpanel = new JPanel();
            tpanel.setLayout(new BorderLayout());

            JTextArea text = new JTextArea(5,30);
            text.setFont(new Font("Times New Roman", Font.PLAIN, 14));
            text.setLineWrap(true);

            JMenuBar menuBar = new JMenuBar();

            JMenu fileMenu = new JMenu("Файл");

            JMenu clrMenu = new JMenu("Цвет");
            fileMenu.add(clrMenu);

            JMenuItem blue = new JMenuItem("Синий");
            blue.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    text.setForeground(Color.BLUE);
                }
            });
            clrMenu.add(blue);

            JMenuItem red = new JMenuItem("Красный");
            red.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    text.setForeground(Color.RED);
                }
            });
            clrMenu.add(red);

            JMenuItem black = new JMenuItem("Чёрный");
            black.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    text.setForeground(Color.BLACK);
                }
            });
            clrMenu.add(black);

            JMenu fontMenu = new JMenu("Шрифт");
            fileMenu.add(fontMenu);

            JMenuItem tnr = new JMenuItem("Times New Roman");
            tnr.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    text.setFont(new Font("Times New Roman", Font.PLAIN, 14));
                }
            });
            fontMenu.add(tnr);

            JMenuItem msss = new JMenuItem("MS Sans Serif");
            msss.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    text.setFont(new Font("MS Sans Serif", Font.PLAIN, 14));
                }
            });
            fontMenu.add(msss);

            JMenuItem cn = new JMenuItem("Courier New");
            cn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    text.setFont(new Font("Courier New", Font.PLAIN, 14));
                }
            });
            fontMenu.add(cn);


            menuBar.add(fileMenu);

            setJMenuBar(menuBar);
            tpanel.add(text, BorderLayout.CENTER);

            setJMenuBar(menuBar);
            getContentPane().add(tpanel);
            setVisible(true);
        }
    }
    private class PassVer extends JFrame{
        private JPanel main;
        private JPanel spanel;
        private JPanel npanel;
        private JPanel ppanel;
        String correctpass = "123";
        String correctlogin = "login";
        String correctservice = "service";
        PassVer(){
            super("Password verification");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(400,200);

            main = new JPanel(new VerticalLayout());
            spanel = new JPanel();
            npanel = new JPanel();
            ppanel = new JPanel();


            JLabel slabel = new JLabel("Service: ");
            JTextField sfield = new JTextField(20);

            sfield.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {}

                @Override
                public void keyPressed(KeyEvent e) {}

                @Override
                public void keyReleased(KeyEvent e) {
                    if (sfield.getText().equals(correctservice)){
                        sfield.setBorder(BorderFactory.createLineBorder(Color.GREEN));
                    }else{
                        sfield.setBorder(BorderFactory.createLineBorder(Color.RED));
                    }
                }
            });

            JLabel nlabel = new JLabel("User name: ");
            JTextField nfield = new JTextField(20);

            nfield.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {}

                @Override
                public void keyPressed(KeyEvent e) {}

                @Override
                public void keyReleased(KeyEvent e) {
                    if (nfield.getText().equals(correctlogin)){
                        nfield.setBorder(BorderFactory.createLineBorder(Color.GREEN));
                    }else{
                        nfield.setBorder(BorderFactory.createLineBorder(Color.RED));
                    }
                }
            });

            JLabel plabel = new JLabel("Password: ");
            JPasswordField pfield = new JPasswordField(20);

            pfield.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {}

                @Override
                public void keyPressed(KeyEvent e) {}

                @Override
                public void keyReleased(KeyEvent e) {
                    if (pfield.getText().equals(correctpass)){
                        pfield.setBorder(BorderFactory.createLineBorder(Color.GREEN));
                    }else{
                        pfield.setBorder(BorderFactory.createLineBorder(Color.RED));
                    }
                }
            });

            spanel.add(slabel);
            spanel.add(sfield);
            npanel.add(nlabel);
            npanel.add(nfield);
            ppanel.add(plabel);
            ppanel.add(pfield);
            main.add(spanel);
            main.add(npanel);
            main.add(ppanel);
            getContentPane().add(main);
            setVisible(true);
        }
    }
    public void do_thing(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                new Finder();
                new TextColor();
                new PassVer();
            }
        });
    }
}