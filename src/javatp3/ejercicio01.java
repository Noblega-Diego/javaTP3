/*
 * ¿Qué sucede si tratamos de acceder un elemento fuera del tamaño del array?
 */
package javatp3;

/**
 *
 * @author diego
 */
public class ejercicio01 {
    public static void main(final String[] args) {
        final int[] arreglo = new int[4];
        System.out.println(arreglo[5]);
        //se produce un exepcion del siguiente tipo: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
        //esto nos indica que el espacio al que hace referencia es ilegal para el array
    }
}
