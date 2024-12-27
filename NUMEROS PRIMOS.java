import java.util.Scanner;
public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int num = scanner.nextInt();
        boolean esPrimo = num > 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                esPrimo = false;
                break;
            }
        }
        System.out.println(num + (esPrimo ? " es primo." : " no es primo."));
    }
}
