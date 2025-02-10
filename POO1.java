import javax.swing.JOptionPane;
public class POO1 {
    //Atributos 
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Metodos
    
    public void leerNnumeros(){
        numero1= Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        numero1= Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro numero"));     
    }
    public void sumar(){
        suma=numero1+numero2;
    }
    public void restar(){
        resta=numero1-numero2;
    }
    public void multiplicar(){
        multiplicacion=numero1*numero2;
    }
    public void dividir(){
        division=numero1/numero2;
    }
    
    public void Resultados(){
        System.out.println("La suma es:" + suma);
        System.out.println("La resta es:" + resta);
        System.out.println("La multiplicacion es:" + multiplicacion);
        System.out.println("La division es:" + division);


    }
}
