/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awt;

/**
 *
 * @author Abhinav Saini
 */
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author ravij
 */
public class AWTcheckbox {

    public AWTcheckbox() {
    // creating the frame  
        Frame f = new Frame ("CheckBox Example");    
// creating the label  
        final Label label = new Label();            
// setting the alignment, size of label       
   label.setAlignment(Label.CENTER);    
        label.setSize(400,100);    
// creating the checkboxes  
        Checkbox checkbox1 = new Checkbox("C++");    
        checkbox1.setBounds(100, 100,  50, 50);    
        Checkbox checkbox2 = new Checkbox("Java");    
        checkbox2.setBounds(100, 150,  50, 50);    
// adding the checkbox to frame  
f.add(checkbox1);  
f.add(checkbox2);   
f.add(label);    
  
// adding event to the checkboxes  
        checkbox1.addItemListener(new ItemListener() {    
             public void itemStateChanged(ItemEvent e) {                 
                label.setText("C++ Checkbox: "     
                + (e.getStateChange()==1?"checked":"unchecked"));    
             }    
          });    
        checkbox2.addItemListener(new ItemListener() {    
             public void itemStateChanged(ItemEvent e) {                 
                label.setText("Java Checkbox: "     
                + (e.getStateChange()==1?"checked":"unchecked"));    
             }    
          });    
// setting size, layout and visibility of frame  
        f.setSize(400,400);    
        f.setLayout(null);    
        f.setVisible(true);    
     }    
    public static void main(String[] args) {
        new AWTcheckbox();
    }
    }
