/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awt;

/**
 *
 * @author Abhinav Saini
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingExample1 {
    SwingExample1() {
        JFrame frame = new JFrame("Swing Example");
        JLabel label = new JLabel("Enter text:");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Show Text");

        JLabel resultLabel = new JLabel("");
       
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultLabel.setText("You entered: " + textField.getText());
            }
        });

        frame.setLayout(new FlowLayout());
        
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(resultLabel);

        frame.setSize(300, 200);       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setVisible(true);           
    }

    public static void main(String[] args) {
        new SwingExample1(); 
    }
}

