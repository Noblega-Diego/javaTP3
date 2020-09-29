/**
 * Realice una búsqueda secuencial en un arreglo unidimensional de tamaño 50 generado
    aleatoriamente mediante la función java random.
    Realice una búsqueda secuencial de la siguiente forma:
    - se lee el valor que se desea buscar,
    - se compara la primera posición;
    - si son iguales,
    - fin de la búsqueda.
    - De lo contrario, compararlo con la segunda posición, y así sucesivamente.
    - Si se llega al final del arreglo y no se encontró el valor, debe indicarlo con un mensaje
    apropiado.
    - Si se encuentra, se debe especificar la posición que ese valor ocupa en el arreglo por
    primera vez.
 */
package javatp3;

import java.util.Random;
import java.util.Scanner;
public class ejercicio06 {
    public static void main(String[] args) {
        int numABuscar,posicionNum;
        int[] IntArray = new int[50];
        Scanner scanner = new Scanner(System.in);
        numABuscar = scanner.nextInt();
        aleatoriosEnArray(IntArray);
        posicionNum = busquedaEnArray(numABuscar, IntArray);
        if(posicionNum != -1){
            System.out.println("posicion:" + posicionNum);  
        }else{
            System.out.println("incorrecto: numero no encontrado");
        }
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
     * busqueda en array
     * @param num
     * @param arreglo
     * @return el espacio en cual se encontro
     * @return -1: en caso de no haber encontrado ninguno
     */
    public static int busquedaEnArray(int num,int[] arreglo) {
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] == num)   return i;
        }
        return -1;
    }

}
