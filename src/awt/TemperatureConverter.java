package awt;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abhinav Saini
 */
//using swing
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverter {

    public static void main(String[] args) {
     
        JFrame frame = new JFrame("Celsius to Fahrenheit Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JLabel celsiusLabel = new JLabel("Enter Celsius:");
        JTextField celsiusTextField = new JTextField(10);
        JButton convertButton = new JButton("Convert");
        JLabel resultLabel = new JLabel("Fahrenheit: ");

        frame.setLayout(new FlowLayout());
        frame.add(celsiusLabel);
        frame.add(celsiusTextField);
        frame.add(convertButton);
        frame.add(resultLabel);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    
                    double celsius = Double.parseDouble(celsiusTextField.getText());
                    double fahrenheit = (celsius * 9/5) + 32;
                    resultLabel.setText("Fahrenheit: " + fahrenheit);
                } catch (NumberFormatException ex) {                  
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number!");
                }
            }
        });
        frame.setVisible(true);
    }
}

