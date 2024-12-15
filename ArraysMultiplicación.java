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

public class ArraysMultiplicación{
    public static void main(String[] AndresM) {
        short mult[][] = new short[3][3];
        byte tabla1[][] = new byte[3][3];
        byte tabla2[][] = new byte[3][3];

        for (byte i = 0; i < tabla1.length; i++) {
            for (byte j = 0; j < tabla1[i].length; j++) {
                tabla1[i][j] = Byte.parseByte(JOptionPane.showInputDialog(
                        null, "Ingresa un número para la posición [" + i + "][" + j + "] de la Tabla 1"));
            }
        }

        for (byte i = 0; i < tabla2.length; i++) {
            for (byte j = 0; j < tabla2[i].length; j++) {
                tabla2[i][j] = Byte.parseByte(JOptionPane.showInputDialog(
                        null, "Ingresa un número para la posición [" + i + "][" + j + "] de la Tabla 2"));
            }
        }
        byte n=2;
        for (byte i = 0; i < mult.length; i++) {
            for (byte j = 0; j < mult[i].length; j++) {
                mult[i][j] = (short) (tabla1[i][j] * tabla2[n - i][n - j]);
            }
        }
        System.out.println("\n  TABLA 1              TABLA 2                 RESULTADO");
        System.out.println("-------------------------------------------------------------");

        for (byte i = 0; i < 3; i++) {
            System.out.print("| ");
            for (byte j = 0; j < 3; j++) {
                System.out.printf("%4d ", tabla1[i][j]);
            }
            System.out.print(" |    ");

            System.out.print("| ");
            for (byte j = 0; j < 3; j++) {
                System.out.printf("%4d ", tabla2[i][j]);
            }
            System.out.print(" |    ");

            System.out.print("| ");
            for (byte j = 0; j < 3; j++) {
                System.out.printf("%4d ", mult[i][j]);
            }
            System.out.println(" |");
        }
        System.out.println("-------------------------------------------------------------");
    }
}