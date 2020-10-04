/**
 * Dado 2 array de enteros, el primero de tamaño 5 y el segundo de tamaño 10, pedir los
 * valores numéricos enteros para cargar cada uno de los arreglos, cree un tercer arreglo de
 * tamaño 10 que contenga en casa posición la suma de la multiplicación de cada elemento
 * del array uno por cada elemento del array 2
 * ARRAY3 = (posición 0 del arreglo 1 * posición 0 del arreglo 2) + (posición 0 del arreglo 1
 * posición 1 del arreglo 2) + (posición 0 del arreglo 1 * posición 2 del arreglo 2) +
 * ………….+ (posición 4 del arreglo 1 * posición 9 del arreglo 2)
 * Use 2 estructuras iterativas anidadas para realizar el cálculo y asignación de los valores
 * en el 3 array.
 */
package javatp3;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class ejercicio10 {
    public static void main(String[] args) {
        int[] numeros1 = new int[5];
        int[] numeros2 = new int[5];
        int[] numeros3 = new int[5];
        System.out.println("ingrese los numeros para el primer Array");
        ingresoDeNumeros(numeros1);
        System.out.println("ingrese los numeros para el segundo Array");
        ingresoDeNumeros(numeros2);
        sumaDeMultiplicaciones(numeros1, numeros2, numeros3);
        System.out.println(arrayToString(numeros3, 0));
    }
    /**
     * llena el array con numeros entregados por el usuario
     * @param arrayInt
     */
    public static void ingresoDeNumeros(int[] arrayInt) {
        Scanner scanner = new Scanner(System.in);
        try {
            for(int i= 0; i<arrayInt.length; i++){
                System.out.print("N°"+(i+1)+":");
                arrayInt[i] = scanner.nextInt();
            }
        } catch (Exception e) {
            System.out.println("incorrecto: Tipo de dato ingresado invalido");  //en caso de presentarse un error
        }
    }
    /**
     * 
     * @param array1 se multiplica los objetos de este por
     * @param array2 los de este
     * @param array3    al cual se le llenaran con la suma de las multiplicaciones
     */
    public static void sumaDeMultiplicaciones(int[] array1, int[] array2, int[] array3){
        for(int i = 0;i < array1.length;i++){
            int suma = 0;
            for(int j = 0; j < array2.length; j++){
                suma += (array1[i]*array2[j]);
            }
            array3[i] = suma;
        }
    }
    /**
     * /pasa el array a un String
     * @param array
     * @param inicio
     * @return 
     */
    public static String arrayToString(int[] array, int inicio) {
        if(inicio == array.length-1){
            return "" + array[inicio];
        }else{
            return array[inicio] +","+ arrayToString(array, inicio+1);
        }
    }
}
