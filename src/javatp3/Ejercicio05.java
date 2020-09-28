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
    /**
     * Rellena el array con numeros enteros
     * @param arreglo
     */
    public static void aleatoriosEnArray(int[] arreglo) {
        Random random = new Random();                           //instanciamos a la clase Random
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = random.nextInt(100);                   //se almacena un numero random
        }
    }
    /**
     * Retorna el promedio de los enteros de un array
     * @param arreglo
     * @return
     */
    public static int promedioAritmetico(int[] arreglo){
        int resultSuma = 0;                                     //variable para la suma de todos los numeros del array
        for(int i = 0; i < arreglo.length; i++){                //recorre el array
            resultSuma += arreglo[i];                           //suma de los numeros enteros
        }
        return resultSuma/arreglo.length;                       //retorna promedio
    }
    /**
     * retorna la cantiddad de numeros iguales a num encontraos en el array
     * @param num
     * @param arreglo
     * @return
     */
    public static int cantNumIgualesA(int num, int[] arreglo) {
        int cantNumIguales = 0;                                 //cantidad de numeros iguales
        for(int i = 0; i < arreglo.length; i++){                //recorre el array
            cantNumIguales += (arreglo[i] == num)? 1:0;         //si se encentra un numero igual se suma uno
        }                                                       
        return cantNumIguales;                                  //retorna la cantidad de numeros iguales encontrados
    }
    /**
     * retorna la cantidad de numeros mayores a num encontrados en el array
     * @param num
     * @param arreglo
     * @return
     */
    public static int cantMayorA(int num, int[] arreglo) {      
        int cantMayores = 0;                                    //cantidad de numeros mayores
        for(int i = 0; i < arreglo.length; i++){
            cantMayores += (arreglo[i] > num)? 1:0;             //si se encentra un numero mayor se suma uno
        }
        return cantMayores;                                     //retorna la cantidad
    }
    /**
     * retorna la cantidad de numeros encontrados menores a num en el array
     * @param num
     * @param arreglo
     * @return
     */
    public static int cantMenoresA(int num, int[] arreglo) {
        int cantMenores = 0;
        for(int i = 0; i < arreglo.length; i++){
            cantMenores += (arreglo[i] < num)? 1:0;             //si hay uno menor se procede a sumar
        }
        return cantMenores;
    }
}
