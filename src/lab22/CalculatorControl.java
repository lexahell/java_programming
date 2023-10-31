package lab22;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CalculatorControl {
    JTextArea text;
    ArrayList<JButton> buttons;
    public CalculatorControl(CalculatorView view, CalculatorModel model){
        text = view.getTextarea();
        buttons = view.getButtons();

        for(JButton i: buttons){
            if(i.getText().equals("=")){
                i.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        text.setText(model.calculate(text.getText()));
                    }
                });
            } else{
                i.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (i.getText().equals("Backspace")){
                            text.setText(text.getText().substring(0, text.getText().length()-1));
                        }else if(i.getText().equals("Clear")){
                            text.setText("");
                        }else{
                            text.append(i.getText().equals("Next")?" ":i.getText());
                        }
                    }
                });
            }
        }
    }
}

