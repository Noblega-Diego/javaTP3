/**
 * Escriba una aplicación para almacenar aleatoriamente 20 números enteros positivos pares
 * del 1 al 100, de los cuales se desea saber:
 * a) su promedio aritmético
 * b) cuántos de los números son iguales al promedio aritmético
 * c) cuántos de los números son mayores que el promedio aritmético
 * d) cuántos de los números son menores que el promedio aritmético 
 */
package javatp3;
import java.util.Random;
/**
 *
 * @author diego
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        
    }

    public static void aleatoriosEnArray(int[] arreglo) {
        Random random = new Random();
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = random.nextInt(100);//se almacena un numero random
        }
    }
}
