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
public class videoarreglos {
     public static void main(String[]AndresM){
        int longitud=0;
        Scanner entrada=new Scanner(System.in);
        System.out.print("ingrese la longitud del vector ");
        longitud= entrada.nextInt();
        int numeros[]= new int[longitud];
        for(int i=0; i<numeros.length; i++){
            System.out.print("Por favor dame el valor #" + (i + 1 + "\t"));
            numeros[i]=entrada.nextInt();
        }
        for(int i=0; i<numeros.length; i++){
        System.out.print("[" + numeros[i] + "]");
        }

      }
    }    
