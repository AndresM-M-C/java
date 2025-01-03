import java.util.Random;
public class GeneradorContrasenas {
    public static void main(String[] args) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*";
        Random random = new Random();
        StringBuilder contrasena = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            contrasena.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }
        System.out.println("Contraseña generada: " + contrasena);
    }
}