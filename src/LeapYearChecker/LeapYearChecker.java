package LeapYearChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearChecker extends JFrame {
    private JPanel LeapChecker;
    private JButton checkYearButton;
    private JTextField yearTextField;

    public static void main(String[] args) {
        LeapYearChecker app = new LeapYearChecker();
        app.setTitle("Lear Year Checker");
        app.setContentPane((app.LeapChecker));
        app.setSize(300, 150);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public LeapYearChecker(){

        checkYearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = yearTextField.getText();
                try {
                    int year = Integer.parseInt(input);

                    if (isLeapYear(year)){
                        JOptionPane.showMessageDialog(null, "Leap Year");
                    } else {
                        JOptionPane.showMessageDialog(null, "Not A Leap Year");
                    }

                } catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Enter A Valid Year");
                }
            }
        });
    }

    private boolean isLeapYear (int year){
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

}