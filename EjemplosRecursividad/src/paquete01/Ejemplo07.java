/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete01;

public class Ejemplo07 {

    public static void main(String[] args) {
        
        System.out.printf("%d\n", obtenerPotencia(2, 6));
    }

    public static int obtenerPotencia(int base, int exponente) {
        
        if (exponente == 1) {
            return base;
        } else{
            
            return base * obtenerPotencia(base, exponente - 1);
        }
    }

}
