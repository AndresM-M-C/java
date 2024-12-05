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
import java.util.Scanner;

public class matricez{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] materias = {"CALCDIF", "QUIMICA", "FUNDPRO", "FUNDINV", "MATEDIS", "DESASUS"};
        int[][] calificaciones = new int[6][5];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Ingrese la calificación de " + materias[i] + " para U" + (j + 1) + ": ");
                calificaciones[i][j] = scanner.nextInt();
            }
        }
        System.out.printf("%-10s%-5s%-5s%-5s%-5s%-5s\n", "Materia", "U1", "U2", "U3", "U4", "U5");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%-10s", materias[i]);
            for (int j = 0; j < 5; j++) {
                System.out.printf("%-5d", calificaciones[i][j]);
            }
            System.out.println();
        }
        scanner.close();
    }
}