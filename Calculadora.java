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
public class Calculadora {
    public static void main(String[]args){
        double num1, num2;
        byte opcion, resp;
        double resultado;
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un valor numerico cualquiera"));
        num2= Double.parseDouble(JOptionPane.showInputDialog("Ingresa un segn¿undo valor"));
        opcion = Byte.parseByte(JOptionPane.showInputDialog("Selecciona una de las siguientes:\n 1.Suma\n 2.Multiplicación \n"
        + "3.Resta \n 4.Division"));
        switch(opcion){
            case 1: //SUMA
                resultado= num1 + num2;
                JOptionPane.showMessageDialog(null, "LA SUMA DE LOS DOS NUMEROS ES DE" + resultado);
                break;
            case 2: //MULTIPLICACION
                resultado= num1*num2;
                JOptionPane.showMessageDialog(null, "LA MULTIPLICACIÓN DE LOS NUMEROS INGRESADOS ES DE:" + resultado);
                break;
            case 3: // RESTA
                resultado= num1-num2;
                JOptionPane.showMessageDialog(null, "LA RESTA DE LOS NUMEROS INGRESADOS ES DE:" + resultado);
                break;
            case 4: //DIVISION
                resultado= num1/num2;
                JOptionPane.showMessageDialog(null, "LA DIVISION DE LOS NUMEROS INGRESADOS ES DE:" + resultado);
                break;
        }
    }
}
                     

