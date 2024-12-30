import java.util.Arrays;
public class OrdenarArreglo {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 8, 1, 3};
        Arrays.sort(numeros);
        System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));
    }
}