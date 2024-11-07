
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
public class ConversionDeNotas {
    public static void main(String[] args) {
       
        char nuevaNota;
        short nota =0; 
        nota=(short) Integer.parseInt(JOptionPane.showInputDialog("Introduzca la nota que obtuviste (rango de 1 a 20)"));
     
        if (nota >= 19 && nota <= 20) {
            nuevaNota = 'A';
            System.out.println("Fin de Archivo"); 
        } else if (nota >= 16 && nota <= 18) {
            nuevaNota = 'B';
        } else if (nota >= 13 && nota <= 15) {
            nuevaNota = 'C';
        } else if (nota >= 10 && nota <= 12) {
            nuevaNota = 'D';
        } else if (nota >= 1 && nota <= 9) {
            nuevaNota = 'E';
        } else {
            nuevaNota = 'X';
        }

        System.out.println("La calificación convertida es: " + nuevaNota);
        return;
    }
}


