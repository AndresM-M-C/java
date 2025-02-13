package ProgramasPrimero;
import javax.swing.JOptionPane;
public class Numeromayor_Menor_Igual {
    public void NumeroMyMen() {
        short A = (short) Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el valor de A"));
        short B = (short) Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el valor de B"));
        short C = (short) Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el valor de C"));

        short mayor = A;
        if (B > mayor) mayor = B;
        if (C > mayor) mayor = C;

        short menor = A;
        if (B < menor) menor = B;
        if (C < menor) menor = C;

        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);

        if (A == B && B == C) {
            System.out.println("A, B y C son iguales: " + A);
        } else {
            if (A == B) {
                System.out.println("A y B son iguales: " + A);
            }
            if (A == C) {
                System.out.println("A y C son iguales: " + A);
            }
            if (B == C) {
                System.out.println("B y C son iguales: " + B);
            }
        }
        System.out.println("Valores ingresados:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
    }
    }
