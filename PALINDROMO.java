import java.util.Scanner;
public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra o frase: ");
        String texto = scanner.nextLine().replaceAll("\\s+", "").toLowerCase();
        String invertido = new StringBuilder(texto).reverse().toString();
        System.out.println(texto.equals(invertido) ? "Es un palíndromo." : "No es un palíndromo.");
    }
}