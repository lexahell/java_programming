package lab22;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CalculatorView extends JFrame {
    private ArrayList<JButton> buttons;
    private JTextArea text = new JTextArea(3,30);
    protected ArrayList<JButton> getButtons(){
        return buttons;
    }
    protected JTextArea getTextarea(){
        return text;
    }
    public CalculatorView(){

        super("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 300);

        JPanel main = new JPanel();
        main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
        JPanel tpanel = new JPanel();
        tpanel.setLayout(new BorderLayout());
        JPanel bpanel = new JPanel();
        bpanel.setLayout(new GridLayout(5, 4));
        buttons = new ArrayList<>();
        buttons.add(new JButton("7"));
        buttons.add(new JButton("8"));
        buttons.add(new JButton("9"));
        buttons.add(new JButton("/"));
        buttons.add(new JButton("4"));
        buttons.add(new JButton("5"));
        buttons.add(new JButton("6"));
        buttons.add(new JButton("*"));
        buttons.add(new JButton("1"));
        buttons.add(new JButton("2"));
        buttons.add(new JButton("3"));
        buttons.add(new JButton("-"));
        buttons.add(new JButton("0"));
        buttons.add(new JButton("."));
        buttons.add(new JButton("="));
        buttons.add(new JButton("+"));
        buttons.add(new JButton("Next"));
        buttons.add(new JButton("Backspace"));
        buttons.add(new JButton("Clear"));

        text.setLineWrap(true);
        text.setEnabled(false);
        text.setDisabledTextColor(Color.BLACK);
        text.setFont(new Font("Arial", Font.PLAIN, 25));

        tpanel.add(text, BorderLayout.CENTER);
        for (JButton b: buttons){
            bpanel.add(b);
        }

        tpanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        main.add(tpanel);
        main.add(bpanel);

        this.getContentPane().add(main);
        this.setVisible(true);
    }
}
