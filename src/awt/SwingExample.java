import javax.swing.*;
import java.awt.*;

public class SwingExample {
    SwingExample() {
        JFrame frame = new JFrame("Swing RadioButton Example");
        JLabel label = new JLabel("Select an option:");
        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");

        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);

        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(radioButton1);
        frame.add(radioButton2);

        frame.setSize(300, 200);          
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setVisible(true);          
    }

    public static void main(String[] args) {
        new SwingExample(); 
    }
}
