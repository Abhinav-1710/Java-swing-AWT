/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package awt;

/**
 *
 * @author Abhinav Saini
 */
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Awt1 {

    public Awt1() {
        Frame frame= new Frame("Hellow First GUI");
        TextField txtfld= new TextField("Somthing is here");
        txtfld.setBounds(20, 120, 150, 30);
        txtfld.setBackground(Color.DARK_GRAY);
        Label l1= new Label("First label");
        l1.setBounds(50, 80, 80, 20);
        l1.setBackground(Color.yellow);
        Button b1=new Button("Click me !");
        b1.setBackground(Color.red);
        b1.setBounds(50, 40, 80, 20);
        frame.add(txtfld);
        frame.add(b1);
        frame.add(l1);
        frame.setSize(200, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        
        frame.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e){
        frame.dispose();
        }
        });
    }
    
    public static void main(String[] args) {
        new Awt1();
    }
}

