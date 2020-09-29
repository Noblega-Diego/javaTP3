/**
 * Solicite al usuario el ingreso de una cadena de números separadas por guiones medio, por
 * ejemplo:
 * 45-9-8-6-45-23-21-74-96-32-45-25
 * Posteriormente aplique el método SPLIT de los String de Java para convertir la cadena en
 * un arreglo, y calcular la suma total de los elementos y el valor promedio calculado.
 */
package javatp3;
import  java.util.Scanner;
public class ejercicio08 {
    public static void main(String[] args) {
        int[] numeros = ingresoDeNumeros();
        ejercicio07.mostrarArray(numeros);
        System.out.println( "suma:" +       sumatoria(numeros) + "\n" +
                            "promedio:" +   promedioAritmetico(numeros));
    }
    /**
     * ingresa numeros separadospor un guion '-'
     * @return
     */
    public static int[] ingresoDeNumeros(){
        String[] numerosStringArray;
        String stringNumeros;
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese los numeros unidos con \"-\"");     
        stringNumeros = scanner.nextLine();                             
        numerosStringArray = stringNumeros.split("-");                  //separamos los numeros y obtendremos un array de String
        int[] numerosArray = new int[numerosStringArray.length];        //creamos un array pero de int el cual contendra los numeros
        for(int i =0; i < numerosStringArray.length; i++){              //recorremos el array
            numerosArray[i] =  Integer.parseInt(numerosStringArray[i]); //pasamos el numero(String) a int
        }
        return numerosArray;
    }
    /**
     * Retorna el promedio de los enteros de un array
     * @param arreglo
     * @return
     */
    public static double promedioAritmetico(int[] arreglo){
        return sumatoria(arreglo)/arreglo.length;                       //retorna promedio
    }
    /**
     * sumatoria
     * @param arreglo
     * @return
     */
    public static int sumatoria(int[] arreglo){
        int resultSuma = 0;                                     //variable para la suma de todos los numeros del array
        for(int i = 0; i < arreglo.length; i++){                //recorre el array
            resultSuma += arreglo[i];                           //suma de los numeros enteros
        }
        return resultSuma;
    }
}
