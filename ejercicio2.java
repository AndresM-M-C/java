/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 52553
 */
public class ejercicio2 {
 String color;
 String marca;
 int km;
 
 public static void main (String[]args){
     ejercicio2 coche1= new ejercicio2(); 
     
     coche1.color="Blanco";
     coche1.marca="Audi";
     coche1.km=0;
     
     System.out.println("El color del coche es:" + coche1.color);
     System.out.println("La marca del coche es:" + coche1.marca);
     System.out.println("El kilometraje del coche es:" + coche1.km);
 
 //  Nuevo objeto
 ejercicio2 coche2=new ejercicio2();
 
 coche2.color="Amaraillo";
 coche2.marca="Lamborgini";
 coche2.km=100;
 
      System.out.println("El color del coche es:" + coche2.color);
      System.out.println("La marca del coche es:" + coche2.marca);
      System.out.println("El kilometraje del coche es:" + coche2.km + "km");
 }
}
