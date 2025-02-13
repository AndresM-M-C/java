/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 52553
 */
import java.util.Scanner;
public class matriz {
    public static void main(String[]args){
        int matriz[][]= new int [3][3];
        Scanner sc= new Scanner(System.in);
        for (int i=0;i<3;i++){
            for(int j=0; j<3;j++){
               System.out.println("Introduce un numero");
               int num=sc.nextInt();
               matriz[i][j]=num;
            }
        }
        System.out.println("Imprimir numeros de la matriz");
        for(int i=0;i<3;i++)
        {
            System.out.println("\n");
            for(int j=0;j<3;j++){
                System.out.print(matriz[i][j] + "\t");
            }
        }
    }
}
