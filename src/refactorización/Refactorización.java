
package refactorización;

import java.util.Scanner;

public class Refactorización {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int numero;
        
        System.out.println("Introduce un número entero: ");
        numero=teclado.nextInt();
        
        System.out.println("El cuadrado de el número es: " + Cuadrado_Numero(numero));
        
        
    }

    private static int Cuadrado_Numero(int numero) {
        return numero*2;
    }
    
}
