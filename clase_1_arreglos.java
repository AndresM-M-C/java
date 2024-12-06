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
public class clase_1_arreglos {
    public static void main (String [] AndrésM){
        String materias[]={"CALCDIF", "MATEDIS", "FUNDPRO", "FUNDINV", "QUIMICA", "DESSUST"};
        String encabezado[]={"MATERIA", "U1", "U2", "U3", "U4", "U5"};
        byte calificaciones[][]=new byte[6][5];
        byte x,y;
        //ingresar las calificaciones para las materias
        for(x=0; x<=5;x++){ //filas
            for(y=0;y<5;y++){//columnas
               calificaciones[x][y]=Byte.parseByte(JOptionPane.showInputDialog("Ingresa las calificaciones de:" 
                       + materias[x] + " Unidad" + (y+1))); 
            }
        }
               //impresion de calificaiones 
               for(x=0;x<=5;x++){
               System.out.print(encabezado[x] + "\t");
               }
               System.out.println();
               for(x=0;x<=5;x++){ //filas
                   System.out.print(materias[x] + "\t");
                   for(y=0;y<5;y++){//columnas
                       System.out.print(calificaciones[x][y] + "\t");
                   }
                   System.out.println();
                }
   }
}
    