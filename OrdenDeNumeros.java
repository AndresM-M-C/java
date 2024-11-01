
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
public class OrdenDeNumeros {
    public static void main(String[] args) {
        short A = 0, B = 0, Temporal = 0;

        String valorA = JOptionPane.showInputDialog("Introduce el valor de A:");
        A = (short)Integer.parseInt(valorA); 

        String valorB = JOptionPane.showInputDialog("Introduce el valor de B:");
        B = (short)Integer.parseInt(valorB);

        if (A < B) {
            Temporal = B;
            B = A;
            A = Temporal;
        }

        JOptionPane.showMessageDialog(null, "Orden = " + A + ", " + B);
    }
}
