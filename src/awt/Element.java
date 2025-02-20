package awt;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abhinav Saini
 */
import java.util.ArrayList; 
//using swing

public class Element {
    public static void main(String[] args) {
       
        ArrayList<String> colors = new ArrayList<>();
        
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        System.out.println("Colors: " + colors);

        String firstElement = colors.get(0);
        System.out.println("First element: " + firstElement);

        String thirdElement = colors.get(2);
        System.out.println("Third element: " + thirdElement);
    }
}

