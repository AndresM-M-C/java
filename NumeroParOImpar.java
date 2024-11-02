
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
public class NumeroParOImpar {
    
    public static void main(String[] args) {
        short N;
        
        String input = JOptionPane.showInputDialog("Ingrese un número:");
    
        N=(short) Integer.parseInt(input);

        if (N % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El número " + N + " es par.");
        } else {
            JOptionPane.showMessageDialog(null, "El número " + N + " es impar.");
        }
    }
}



