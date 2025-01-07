import java.util.Scanner;
public class BinarioADecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número binario: ");
        String binario = scanner.nextLine();
        int decimal = Integer.parseInt(binario, 2);
        System.out.println("El número decimal es: " + decimal);
    }
}
