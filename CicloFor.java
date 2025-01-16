
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
public class CicloFor {
    public static void main(String[] AndresM) {
        float estatura, imc;
        int peso;
        byte resp;

        for(resp = 1; resp == 1;) {
            peso = Integer.parseInt(JOptionPane.showInputDialog("Captura tu peso en kilogramos"));
            estatura = Float.parseFloat(JOptionPane.showInputDialog("Captura tu estatura en metros"));
            imc = peso / (estatura * estatura);

            
            if(imc < 18.49) {
                JOptionPane.showMessageDialog(null, "Peso bajo");
            } else if(imc >= 18.50 && imc <= 24.99) {
                JOptionPane.showMessageDialog(null, "Peso normal");
            } else if(imc >= 25 && imc <= 29.99) {
                JOptionPane.showMessageDialog(null, "Sobrepeso");
            } else if(imc >= 30 && imc <= 34.99) {
                JOptionPane.showMessageDialog(null, "Obesidad Leve");
            } else if(imc >= 35 && imc <= 39.99) {
                JOptionPane.showMessageDialog(null, "Obesidad Media");
            } else {
                JOptionPane.showMessageDialog(null, "Obesidad Mórbida");
            }

            resp = Byte.parseByte(JOptionPane.showInputDialog("Capture 1 si desea realizar otro cálculo"));
        }
    }
}

