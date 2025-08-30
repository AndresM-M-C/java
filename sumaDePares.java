
public class sumaDePares {
    
    public static void main(String[] args) {
        int suma=0;
        
        for (int i = 2; i <= 100; i+=2) {
            
            suma+=i;
        }
        
        System.out.println("la suma de los numeros pares del 1 al 100 es de: " + suma);
    }
}
