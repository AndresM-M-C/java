import javax.swing.JOptionPane;

public class suma_de_numeros {

    public static void main(String[] args) {

        double n1, n2;
        double suma;

        while (true) {
            n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer operando"));
            n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo operando"));

            if (n1 == 0 || n2 == 0) {
                JOptionPane.showMessageDialog(null, "Operando inválido. No se permite el valor 0.");
                System.exit(0);
            }

            suma = n1 + n2;

            JOptionPane.showMessageDialog(null, "El resultado de la suma de los valores ingresados es: " + suma);

            System.exit(0);
        }
    }
}