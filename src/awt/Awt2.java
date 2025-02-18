/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awt;

/**
 *
 * @author Abhinav Saini
 */
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

/**
 *
 * @author ravij
 */
public class Awt2 {

    public Awt2() {
        // creating a Frame  
        Frame f1= new Frame();
         // creating a Label  
        Label l1= new Label("Employe ID:");
        // creating a Button  
        Button b1= new Button("Submit");
            // creating a TextField  
        TextField txt=new TextField();
        // setting position of above components in the frame 
        l1.setBounds(20, 70, 80, 30);
        txt.setBounds(20, 90, 80, 30);
        b1.setBounds(100, 100, 80, 30);
         // adding components into frame
         f1.add(l1);
         f1.add(txt);
         f1.add(b1);
         
         //Setting Frame Size 300X400
         f1.setSize(400, 300);
         f1.setTitle("My Title");
         f1.setLayout(null);
         f1.setVisible(true);
    }
    public static void main(String[] args) {
        new Awt2();
        
    }
    
}

