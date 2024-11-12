
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
public class AreayVolumendeCilindro {
 public static void main (String[] args) {
         short R,H;
         short Area, Volumen;
         R=(short) Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor del Radio (R)"));
         H=(short) Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor de la altura (H)"));   
         Volumen = (short) (Math.PI * Math.pow(R, 2)*H);
         Area= (short)(2*Math.PI *R*H);         
    System.out.println("El area es de: " + Area + "y" + "el Volumen es de: "+ Volumen);    
}
}
