import java.util.Scanner;
public class InvertirCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();
        String invertida = new StringBuilder(cadena).reverse().toString();
        System.out.println("Cadena invertida: " + invertida);
    }
}