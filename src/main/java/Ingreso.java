import java.util.Scanner;

public class Ingreso {
    public static void main(String[] args) {
        Scanner leer = new Scanner((System.in));
        System.out.println("Ingrese un número:");
        int numero = leer.nextInt();

        System.out.println(numero);
        if(numero > 8){
            System.out.println("Hola");
        }else{
            System.out.println("Hi");
        }
    }
}