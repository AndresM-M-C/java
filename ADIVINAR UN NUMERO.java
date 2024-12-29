import java.util.Scanner;
import java.util.Random;
public class AdivinaNumero {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int intento;
        do {
            System.out.print("Adivina el número (1-100): ");
            intento = scanner.nextInt();
            if (intento < numeroSecreto) {
                System.out.println("Muy bajo!");
            } else if (intento > numeroSecreto) {
                System.out.println("Muy alto!");
            }
        } while (intento != numeroSecreto);
        System.out.println("¡Correcto! El número era " + numeroSecreto);
    }
}
