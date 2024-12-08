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

public class ARREGLOS {
    public static void main(String[] AnsresM) {
        String materias[] = {"CALCDIF", "MATEDIS", "FUNDPRO", "FUNDINV", "QUIMICA", "DESSUST"};
        String encabezado[] = {"MATERIA", "U1", "U2", "U3", "U4", "U5", "PROMEDIO"};
        byte calificaciones[][] = new byte[6][5];
        int promedios[] = new int[6];
        int promedioTotal = 0;
        byte x, y;

        for (x = 0; x < 6; x++) {
            for (y = 0; y < 5; y++) {
                calificaciones[x][y] = Byte.parseByte(JOptionPane.showInputDialog("Ingresa las calificaciones de: " 
                        + materias[x] + " Unidad " + (y + 1)));
            }
        }

        for (x = 0; x < 6; x++) {
            int suma = 0;
            for (y = 0; y < 5; y++) {
                suma += calificaciones[x][y];
            }
            promedios[x] = suma / 5; 
            promedioTotal += promedios[x];
        }
        promedioTotal /= 6;

        for (int i = 0; i < encabezado.length; i++) {
            System.out.print(encabezado[i] + "\t");
        }
        System.out.println();

        for (x = 0; x < 6; x++) {
            System.out.print(materias[x] + "\t");
            for (y = 0; y < 5; y++) {
                System.out.print(calificaciones[x][y] + "\t");
            }
            System.out.print(promedios[x]);
            System.out.println();
        }

        System.out.println("\nPROMEDIO TOTAL: " + promedioTotal);
    }
}
