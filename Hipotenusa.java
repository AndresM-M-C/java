
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 52553
 */
public class Hipotenusa {
     public static void main (String[] args) {
        int catA = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el valor del cateto A (catA)"));
        int catB = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el valor del cateto B (catB)"));
        
         double Hip;
         
     Hip =(double)(Math.sqrt(catA + catB));
    System.out.println("La Hipotenusa es de:"+ Hip);
     }
}