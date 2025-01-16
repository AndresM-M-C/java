
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
public class apoyoDeportes {

    public static void main(String[] args) {
        double montoTotal = 189000;
        double monto1 = 9000;
        double monto2 = 15000;
        float monto3 = 50000;
        float monto4 = 15000;
        float monto5 = 50000;
        float monto6 = 25000;
        float monto7 = 12000;
        float monto8 = 13000;
        double porcentaje;

        porcentaje = (double) (monto1 * 100) / (montoTotal);
        JOptionPane.showMessageDialog(null, "Basquetbol_____ $" + monto1 + " lo que equivale al " + porcentaje + "% del apoyo total");

        porcentaje = (double) (monto2 * 100) / (montoTotal);
        JOptionPane.showMessageDialog(null, "Voleibol_____ $" + monto2 + " lo que equivale al " + porcentaje + "% del apoyo total");

        porcentaje = (double) (monto3 * 100) / (montoTotal);
        JOptionPane.showMessageDialog(null, "Artes_____ $" + monto3 + " lo que equivale al " + porcentaje + "% del apoyo total");

        porcentaje = (double) (monto4 * 100) / (montoTotal);
        JOptionPane.showMessageDialog(null, "Futbol_____ $" + monto4 + " lo que equivale al " + porcentaje + "% del apoyo total");

        porcentaje = (double) (monto5 * 100) / (montoTotal);
        JOptionPane.showMessageDialog(null, "Taekwondo_____ $" + monto5 + " lo que equivale al " + porcentaje + "% del apoyo total");

        porcentaje = (double) (monto6 * 100) / (montoTotal);
        JOptionPane.showMessageDialog(null, "Ajedrez_____ $" + monto6 + " lo que equivale al " + porcentaje + "% del apoyo total");

        porcentaje = (double) (monto7 * 100) / (montoTotal);
        JOptionPane.showMessageDialog(null, "Música_____ $" + monto7 + " lo que equivale al " + porcentaje + "% del apoyo total");

        porcentaje = (double) (monto8 * 100) / (montoTotal);
        JOptionPane.showMessageDialog(null, "Atletismo_____ $" + monto8 + " lo que equivale al " + porcentaje + "% del apoyo total");
    }
}
