import java.util.Scanner;
public class ConversorMoneda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad en dólares: ");
        double dolares = scanner.nextDouble();
        double tasaConversion = 19.84; // Ejemplo: tasa de conversión a pesos mexicanos
        System.out.println("Equivalente en pesos: " + (dolares * tasaConversion));
    }
}