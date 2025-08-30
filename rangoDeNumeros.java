import javax.swing.JOptionPane;

public class rangoDeNumeros {
    public static void main(String[] args) {
        int cnt1=0, cnt2=0, cnt3=0, rango = 0;

        rango = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el rango de numeros a trabajar: "));
        for (int i = 1; i <= rango; i++) {

            if (i > 80) {
                cnt1++;
            }else{
                if(i>=50 && i<75){
                    cnt2++;
                }else{
                    if(i<30){
                        cnt3++;
                    }
                }
            }
        }

        JOptionPane.showMessageDialog(null, "En el rango de numeros ingresado se registran los siguientes datos: \n"
        + " Hay: " + cnt1 + " numeros mayores a 80 \n"
        + " " + cnt2 + " numeros entre 50 y 75 \n"
        + " " + " y " + cnt3 + " numeros menores a 30");
    }

}
