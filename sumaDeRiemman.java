
public class sumaDeRiemman {

    public static void main(String[] args) {
        int suma = 0;
        int cnt = 0;
        int num = 300;
        for (int i = 1; i <= num; i++) {

            if (i%2 !=0) {

                cnt++;
            }
            suma += i;
        }
        System.out.println("la suma de los numeros del 1 al 300 es de: " + suma);
        System.out.println("Y en este rango de numeros hay un total de: " + cnt + " numeros impares");
    }
}
