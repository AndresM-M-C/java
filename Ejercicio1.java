
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
public class Ejercicio1 {
    public static void main(String[] args) {
        short anioN;
        short edad;
                anioN = (short) Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el año de nacimiento"));
                edad = (short) (2024 - anioN);
        
        JOptionPane.showMessageDialog(null, "Tienes " + edad + " años.");
    }
    
}
