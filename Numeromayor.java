
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
public class Numeromayor {
    public static void main(String[] args) {    
        short A,B;
        A=(short) Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el valor de A"));     
        B=(short) Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el valor de B"));
    if (A==B){
        System.out.println("A y B son iguales");
        System.out.println("Introduza nuevos valores, estos deben ser diferentes");
        return;
    }
    if (A>B){
       System.out.println(A+"o(el valor ingresado en A)" +"Es el mayor");
    }else{
        System.out.println(B+"o( el valor ingresado en B)" +"Es el mayor"); 
        
    }     
    }
}                
      
    
