
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 52553
 */
import javax.swing.JOptionPane;

public class ValorMayoryMenor {
    public static void main(String[] args) {
        short A, B, C;
        
        A = (short) Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor de A"));
        B = (short) Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor de B"));
        C = (short) Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor de C"));
        
        if (A >= B && A >= C) {
            System.out.println(A + " es el mayor");
        } else if (B >= A && B >= C) {
            System.out.println(B + " es el mayor");
        } else {
            System.out.println(C + " es el mayor");
        }
        
        if (A <= B && A <= C) {
            System.out.println(A + " es el menor");
        } else if (B <= A && B <= C) {
            System.out.println(B + " es el menor");
        } else {
            System.out.println(C + " es el menor");
        }
    }
}

    
        
        
    
