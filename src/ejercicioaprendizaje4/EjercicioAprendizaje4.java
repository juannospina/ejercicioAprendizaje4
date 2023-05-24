/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejercicioaprendizaje4;

import java.util.Scanner;

public class EjercicioAprendizaje4 {
    public static void main(String[] args) {
        int grados;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa una cantidad en grados centigrados: ");
        grados = entrada.nextInt();
        
        System.out.println("Su equivalencia en grados Fahrenhet es de: "+(32+(9*grados/5)));
    }
    
}
