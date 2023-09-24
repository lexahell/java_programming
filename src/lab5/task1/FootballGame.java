package lab5.task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("AC Milan vs Real Madrid");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JPanel panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(300, 150));
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        JButton button1 = new JButton("AC MILAN");
        JButton button2 = new JButton("Real Madrid");

        final int[] firstTeamGoals = {0};
        final int[] secondTeamGoals = {0};
        JLabel score = new JLabel("Result: " + firstTeamGoals[0] + " X " + secondTeamGoals[0], JLabel.CENTER);
        final String[] lastScorer = {"N/A"};
        JLabel lastScore = new JLabel("Last Scorer: " + lastScorer[0], JLabel.CENTER);

        final String[] currentResult = {"DRAW"};
        Label finalResult = new Label("Winner: " + currentResult[0]);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstTeamGoals[0]++;
                score.setText("Result: " + firstTeamGoals[0] + " X " + secondTeamGoals[0]);
                lastScorer[0] = "AC Milan";
                lastScore.setText("Last Scorer: " + lastScorer[0]);

                if (firstTeamGoals[0] > secondTeamGoals[0]) {
                    currentResult[0] = "AC Milan";
                } else if (firstTeamGoals[0] < secondTeamGoals[0]) {
                    currentResult[0] = "Real Madrid";
                } else {
                    currentResult[0] = "DRAW";
                }
                finalResult.setText("Winner: " + currentResult[0]);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondTeamGoals[0]++;
                score.setText("Result: " + firstTeamGoals[0] + " X " + secondTeamGoals[0]);
                lastScorer[0] = "Real Madrid";
                lastScore.setText("Last Scorer: " + lastScorer[0]);


                if (firstTeamGoals[0] > secondTeamGoals[0]) {
                    currentResult[0] = "AC Milan";
                } else if (firstTeamGoals[0] < secondTeamGoals[0]) {
                    currentResult[0] = "Real Madrid";
                } else {
                    currentResult[0] = "DRAW";
                }
                finalResult.setText("Winner: " + currentResult[0]);
            }
        });

        panel2.add(button1);
        panel2.add(button2);
        panel2.add(score);
        panel2.add(lastScore);
        panel2.add(finalResult);
        frame.getContentPane().add(panel2);
        frame.pack();
        frame.setVisible(true);
    }
}
