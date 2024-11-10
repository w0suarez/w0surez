package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame{
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JTextField tfNumber2;
    private JButton btnCompute;
    private JPanel SCalculator;
    private JLabel lbResult;


    public static void main(String[] args) {
        SimpleCalculator app = new SimpleCalculator();
        app.setTitle("Simple Calculator");
        app.setContentPane((app.SCalculator));
        app.setSize(700, 220);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public SimpleCalculator(){
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateResult();

            }
        });
    }

    private void calculateResult() {
        int num1 = Integer.parseInt(tfNumber1.getText());
        int num2 = Integer.parseInt(tfNumber2.getText());
        String operation = (String) cbOperations.getSelectedItem();
        int result = 0;

        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    lbResult.setText("Cannot divide by zero");
                    return;
                }
                result = num1 / num2;
                break;
        }

        lbResult.setText(String.valueOf(result));

    }


}