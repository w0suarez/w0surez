package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame {
    private JPanel Menu;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JButton btnOrder;
    private JRadioButton    rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;


    public static void main(String[] args) {
        FoodOrderingSystem app = new FoodOrderingSystem();
        app.setTitle("Food Ordering System");
        app.setContentPane((app.Menu));
        app.setSize(400, 400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public FoodOrderingSystem(){
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateOrder();
            }
        });
    }

    private void calculateOrder() {
        double totalPrice = 0;

        if (cPizza.isSelected()) totalPrice += 100;
        if (cBurger.isSelected()) totalPrice += 80;
        if (cFries.isSelected()) totalPrice += 65;
        if (cSoftDrinks.isSelected()) totalPrice += 55;
        if (cTea.isSelected()) totalPrice += 50;
        if (cSundae.isSelected()) totalPrice += 40;

        double discount = 0.0;

        if (rb5.isSelected()){
            discount = 0.5;
        } else if (rb10.isSelected()){
            discount = 0.10;
        } else if (rb15.isSelected()){
            discount = 0.15;
        }

        double discountAdded = totalPrice * discount;
        double finalPrice = totalPrice - discountAdded;

        String strPrice = String.format("%.2f", finalPrice);

        JOptionPane.showMessageDialog(this, "The Total Price is Php " + finalPrice);

    }

}