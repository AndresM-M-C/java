import java.util.Scanner;
public class ValidarCorreo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un correo electrónico: ");
        String correo = scanner.nextLine();
        if (correo.matches("[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}")) {
            System.out.println("El correo es válido.");
        } else {
            System.out.println("El correo no es válido.");
        }
    }
}
