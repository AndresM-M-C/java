import java.util.Scanner;
import java.util.Random;
public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] opciones = {"Piedra", "Papel", "Tijera"};
        System.out.print("Elige: Piedra, Papel o Tijera: ");
        String jugador = scanner.nextLine();
        String computadora = opciones[random.nextInt(opciones.length)];
        System.out.println("Computadora eligió: " + computadora);
        if (jugador.equalsIgnoreCase(computadora)) {
            System.out.println("¡Empate!");
        } else if ((jugador.equalsIgnoreCase("Piedra") && computadora.equals("Tijera")) ||
                   (jugador.equalsIgnoreCase("Papel") && computadora.equals("Piedra")) ||
                   (jugador.equalsIgnoreCase("Tijera") && computadora.equals("Papel"))) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("Perdiste...");
        }
    }
}
