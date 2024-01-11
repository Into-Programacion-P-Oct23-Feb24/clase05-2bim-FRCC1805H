/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete01;

public class Ejemplo06 {

    public static void main(String[] args) {
        
        int valor1 = 10; // 3 // 6
        int valor2 = 0; // 5 // 1
        
        System.out.printf("%d\n", obtenerSuma(valor1, valor2));
    }

    public static int obtenerSuma(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            if (a == 0) {
                return b;
            } else {
                return 1 + obtenerSuma(a, b - 1);
                //1 + obtenerSuma(3,4)
            }
        }
    }

}
