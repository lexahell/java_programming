package lab15;



import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class Task15 {
    private static StringBuilder num = new StringBuilder();
    private static StringBuilder result = new StringBuilder();
    private static int state = 0;

    private static JTextArea text = new JTextArea(3,30);

    private static void updateText(){
        text.setText(num.toString() + '\n' + result);
    }
    private void calcExpr(){
        try {
            if (state == 2){
                char oper = result.charAt(result.length()-1);
                if (oper == '+'){
                    result = new StringBuilder(Double.toString(Double.parseDouble(result.toString().substring(0, result.length()-1)) + Double.parseDouble(num.toString())));
                }else if (oper == '-'){
                    result = new StringBuilder(Double.toString(Double.parseDouble(result.toString().substring(0, result.length()-1)) - Double.parseDouble(num.toString())));
                }else if (oper == '*'){
                    result = new StringBuilder(Double.toString(Double.parseDouble(result.toString().substring(0, result.length()-1)) * Double.parseDouble(num.toString())));
                }else if (oper == '/'){
                    result = new StringBuilder(Double.toString(Double.parseDouble(result.toString().substring(0, result.length()-1)) / Double.parseDouble(num.toString())));
                }
                state = 1;
                num.delete(0, num.length());
            }else{
                result = new StringBuilder(Double.toString(Double.parseDouble(num.toString())));
                num.delete(0, num.length());
            }
        }catch (Exception e){
            num.delete(0, num.length());
            result = new StringBuilder("Error");
            state = 0;
        }
        updateText();
    }
    private class CalculatorButtonAction extends JButton{
        private void update(){
            String oper = this.getText();
            if (oper.equals("-")||oper.equals("+")||oper.equals("/")||oper.equals("*")){
                if (state == 2){
                    result.replace(result.length()-1, result.length(), oper);
                }else if (state == 1){
                    if (!num.isEmpty()){
                        result = new StringBuilder(num.toString());
                        num.delete(0, num.length());
                        result.append(oper);
                        state = 2;
                    }else if (!result.isEmpty()){
                        result.append(oper);
                        state = 2;
                    }
                }
            }else{
                num.append(oper);
                state = (state == 0)? 1 : state;
            }
            updateText();
        }
        public CalculatorButtonAction(String s){
            super(s);
            this.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    update();
                }
            });
        }
    }
    private static void calculator(){
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400,400));
        panel.setLayout(new VerticalLayout());
        JTextField num1 = new JTextField(15);
        JTextField num2 = new JTextField(15);
        JButton ac1 = new JButton("Сложить");
        JButton ac2 = new JButton("Умножить");
        JButton ac3 = new JButton("Разделить");
        panel.add(num1);
        panel.add(num2);
        panel.add(ac1);
        panel.add(ac2);
        panel.add(ac3);
        ac1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double sum = Double.parseDouble(num1.getText().trim()) + Double.parseDouble(num2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат = "+sum, "Result",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Введено не число", "Error",JOptionPane.ERROR_MESSAGE);
                }

            }
        });

        ac2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double sum = Double.parseDouble(num1.getText().trim()) * Double.parseDouble(num2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат = "+sum, "Result",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Введено не число", "Error",JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        ac3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double sum = Double.parseDouble(num1.getText().trim()) / Double.parseDouble(num2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат = "+sum, "Result",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Введено не число", "Error",JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
    static private void selectionbox(){
        JFrame frame = new JFrame("Selection Box");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400,400));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        String[] cntrs = {"---", "Australia", "China", "England", "Russia"};
        JComboBox<String> countries = new JComboBox<>(cntrs);
        JTextArea info = new JTextArea(0,30);
        info.setLineWrap(true);
        info.setEnabled(false);
        info.setDisabledTextColor(Color.BLACK);
        countries.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cntr = countries.getSelectedIndex();
                switch (cntr){
                    case 0:
                        info.setText("");
                        break;
                    case 1:
                        info.setText("Австра́лия (англ. Australia, МФА: [əˈstreɪljə], от лат. austrālis — «южный»), официальная форма — Австрали́йский Сою́з," +
                                " или Содру́жество Австра́лии (англ. Commonwealth of Australia, МФА: [ˈkɒm.ənˌwɛlθ əv əˈstreɪljə]) — государство в Южном полушарии," +
                                " занимающее одноимённый материк, остров Тасмания и несколько других островов Индийского и Тихого океанов; является шестым государством" +
                                " по площади в мире. К северу от Австралийского Союза расположены Восточный Тимор, Индонезия и Папуа — Новая Гвинея, к северо-востоку — Вануату," +
                                " Новая Каледония и Соломоновы Острова, к юго-востоку — Новая Зеландия. От главного острова Папуа — Новой Гвинеи материковая часть Австралийского Союза" +
                                " отделена Торресовым проливом минимальной шириной около 150 км, а расстояние от австралийского острова Боигу до Папуа — Новой Гвинеи составляет около 5 километров" +
                                ". Население на 30 июня 2022 года оценивалось в 25 978 935 человек, большинство из которых проживает в городах на восточном побережье.");
                        break;
                    case 2:
                        info.setText("Кита́й (кит. трад. 中國, упр. 中国, пиньинь Zhōngguó, палл. Чжунго), официальное название" +
                                " — Кита́йская Наро́дная Респу́блика (сокр. КНР), (кит. трад. 中華人民共和國, упр. 中华人民共和国, пиньинь" +
                                " Zhōnghuá Rénmín Gònghéguó, палл. Чжунхуа Жэньминь Гунхэго) — государство в Восточной Азии. Занимает " +
                                "4-е место в мире по территории среди государств (9 598 962 км2), уступая России, Канаде и США, а по" +
                                " численности населения — 1 411 750 000 жителей (без Тайваня, Гонконга и Макао) — второе после Индии" +
                                ". Уровень урбанизации равен 65 %. Большинство населения — этнические китайцы, самоназвание — хань.");
                        break;
                    case 3:
                        info.setText("А́нглия (англ. England [ˈɪŋɡlənd]) — страна, являющаяся крупнейшей административно-политической частью" +
                                " Соединённого Королевства Великобритании и Северной Ирландии. Население Англии составляет 84 % от общего числа" +
                                " населения Великобритании. Столица — Лондон, крупнейший город Великобритании.");
                        break;
                    case 4:
                        info.setText("Росси́я, или Росси́йская Федера́ция (сокр. РФ), — государство в Восточной Европе и Северной Азии." +
                                " Россия — крупнейшее государство в мире, её территория в международно признанных границах составляет" +
                                " 17 098 246 км².Перейти к разделу «#Географическое положение» Население страны в составляет 146 447 424 чел. (2023; 9-е место в мире).");
                        break;
                }
            }
        });
        panel.add(countries);
        panel.add(info);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
    private static void textinteractor(){
        JFrame frame = new JFrame("Text interactor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        JPanel main = new JPanel();
        main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
        JPanel bpanel = new JPanel();
        bpanel.setLayout(new FlowLayout());
        JPanel tpanel = new JPanel();
        tpanel.setLayout(new BorderLayout());

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");

        JTextArea text = new JTextArea(5,30);
        text.setLineWrap(true);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("Файл");

        JMenu newMenu = new JMenu("Правка");
        fileMenu.add(newMenu);

        JMenuItem txtFileItem = new JMenuItem("Копировать");
        newMenu.add(txtFileItem);

        JMenuItem imgFileItem = new JMenuItem("Вырезать");
        newMenu.add(imgFileItem);

        JMenuItem folderItem = new JMenuItem("Вставить");
        newMenu.add(folderItem);

        JMenuItem openItem = new JMenuItem("Сохранить");
        fileMenu.add(openItem);

        fileMenu.addSeparator();

        JMenuItem closeItem = new JMenuItem("Выйти");
        fileMenu.add(closeItem);

        menuBar.add(fileMenu);

        bpanel.add(b1);
        bpanel.add(b2);
        tpanel.add(text, BorderLayout.CENTER);

        main.add(bpanel);
        main.add(tpanel);

        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(main);
        frame.setVisible(true);
    }
    private void syscalculator(){
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);

        JPanel main = new JPanel();
        main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
        JPanel tpanel = new JPanel();
        tpanel.setLayout(new BorderLayout());
        JPanel bpanel = new JPanel();
        bpanel.setLayout(new GridLayout(4,4,20,20));

        JButton b7 = new CalculatorButtonAction("7");
        JButton b8 = new CalculatorButtonAction("8");
        JButton b9 = new CalculatorButtonAction("9");
        JButton bslash = new CalculatorButtonAction("/");
        JButton b4 = new CalculatorButtonAction("4");
        JButton b5 = new CalculatorButtonAction("5");
        JButton b6 = new CalculatorButtonAction("6");
        JButton bstar = new CalculatorButtonAction("*");
        JButton b1 = new CalculatorButtonAction("1");
        JButton b2 = new CalculatorButtonAction("2");
        JButton b3 = new CalculatorButtonAction("3");
        JButton bminus = new CalculatorButtonAction("-");
        JButton b0 = new CalculatorButtonAction("0");
        JButton bdot = new CalculatorButtonAction(".");
        JButton bequals = new JButton("=");
        JButton bplus = new CalculatorButtonAction("+");

        bequals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcExpr();
            }
        });

        text.setLineWrap(true);
        text.setEnabled(false);
        text.setDisabledTextColor(Color.BLACK);

        tpanel.add(text, BorderLayout.CENTER);

        bpanel.add(b7);
        bpanel.add(b8);
        bpanel.add(b9);
        bpanel.add(bslash);
        bpanel.add(b4);
        bpanel.add(b5);
        bpanel.add(b6);
        bpanel.add(bstar);
        bpanel.add(b1);
        bpanel.add(b2);
        bpanel.add(b3);
        bpanel.add(bminus);
        bpanel.add(b0);
        bpanel.add(bdot);
        bpanel.add(bequals);
        bpanel.add(bplus);

        tpanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        main.add(tpanel);
        main.add(bpanel);

        frame.getContentPane().add(main);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        calculator();
        selectionbox();
        textinteractor();
        Task15 task15 = new Task15();
        task15.syscalculator();
    }
}
