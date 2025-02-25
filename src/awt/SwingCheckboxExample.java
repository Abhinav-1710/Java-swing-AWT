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
import java.awt.event.ItemEvent;

public class SwingCheckboxExample {
    SwingCheckboxExample() {
  
        JFrame frame = new JFrame("Swing Checkbox Example");
        JCheckBox checkBox = new JCheckBox("Accept Terms and Conditions");
        JLabel label = new JLabel("Checkbox is not selected.");
        
        checkBox.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                label.setText("Checkbox is selected.");
            } else {
                label.setText("Checkbox is not selected.");
            }
        });
        frame.setLayout(new FlowLayout());
        frame.add(checkBox);
        frame.add(label);

        frame.setSize(300, 150);           
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setVisible(true);            
    }

    public static void main(String[] args) {
        new SwingCheckboxExample(); 
    }
}

