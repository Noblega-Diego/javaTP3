/*
    Codifique un programa que solicite un valor entero X mayor o igual a 3 y menor o
    igual a 10. Cree un arreglo de tamaño [X,X] de tipo int. Posteriormente solicite los 
    valores necesarios para cargar cada una de las celdas de la matriz. Muestre por
    pantalla la matriz resultante.
    Al finalizar la carga sume cada una de las columnas del array y asigne los resultados
    en una nueva matriz de una dimensión, finalmente sume los valores de esta última
    matriz y muestre el resultado por pantalla.
    Ejemplo: X=5

    3   5   8   88  7 
    45  34  67  87  54
    34  43  23  44  55
    6   0   45  4   66
    56  44  32  12  54 

    144 126 175 235 236

    Total: 916
 */
package javatp4;

import java.util.InputMismatchException;
import java.util.Scanner;

import utiles.Utiles;

public class ejercicio03 {
    
    public static void main(String[] args) {
        int x;
        System.out.println("ingrese un numero x mayor o igual a 3 y menor o igual a 10");
        try {
            x = leerIntMostrar("X:");
            if(x>=3 && x <=10){
                double[][] matriz = new double[x][x];
                ingresarMatriz(matriz);
                mostrarMatriz(matriz);
                double[] sumasColumnas= sumaDeColumnas(matriz);
                System.out.print("\n");
                mostrarArray(sumasColumnas);
                System.out.println("Total:"+sumatoria(sumasColumnas));
                
            }else{
                System.out.println("INCORRECTO:el numero ingresado es invalido");
            }
        } catch (InputMismatchException e) {
            System.out.println("ERROR:tipo de dato ingresado es incorrecto");
        }
        
    }

    public static void ingresarMatriz(double[][] matriz) throws InputMismatchException{
        int longColuma = matriz.length;
        int longFila = matriz[0].length;
        for(int i = 0; i < longColuma; i++){
            for(int j = 0; j < longFila; j++){
                try {
                    matriz[i][j] = leerDoubleMostrar("matriz["+i+"]"+"[" +j +"]: ");
                } catch (InputMismatchException e) {
                    throw e;
                }
            }
        }
    }
    /**
     * suma los elementos de la columna y los retorna con un array
     * @param matriz    
     * @return  array con la suma de las columnas
     */
    public static double[] sumaDeColumnas(double[][] matriz) {
        int x = matriz.length;                                              //longitud
        double[] array = new double[x];                                     //array de na dimencion
        for(int i = 0; i< x; i++){                                          //recorremos cada columna
            for(int j = 0; j < x; j++){                                     //los elementos de la columna
                array[i] += matriz[j][i];                                   //le sumamos los elementos de la columna
            }
        }
        return array;                                                       //retorno el array de una dimencion
    }
    /**
     * muestra el mensaje y procede a leer
     * @param mensaje   mensaje qe se mostrara
     * @return          double de la lectura
     * @throws Exception    retorna una exception si el valor ingresado es incorrecto
     */
    public static double leerDoubleMostrar(String mensaje) throws InputMismatchException{
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);                                          //imprime el mensaje
        try {
            return scanner.nextDouble();                                    //lectura
        } catch (InputMismatchException e) {
            throw e;                                                        //excepcion
        }
    }
    
    public static int leerIntMostrar(String mensaje) throws InputMismatchException{
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);                                          //imprime el mensaje
        try {
            return scanner.nextInt();                                    //lectura
        } catch (InputMismatchException e) {
            throw e;                                                        //excepcion
        }
    }
    
    public static int sumatoria(double [] array) {
        int suma = 0;
        for(int i = 0; i < array.length; i++){
            suma += array[i];
        }
        return suma;
    }

    public static void mostrarMatriz(double [][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for(int i = 0; i<filas; i++){
            for(int j = 0; j<columnas; j++){
                String numString = String.valueOf(matriz[i][j]);
                System.out.print(Utiles.rellenarEspaciosSimple(numString, 10));
            }
            System.out.print("\n");
        }
    }

    public static void mostrarArray(double [] array) {
        for(int i = 0; i< array.length; i++){
            String numArray= String.valueOf(array[i]);                          //casteamos el double a String
            System.out.print(Utiles.rellenarEspaciosSimple(numArray, 10));      //rellenams con los espacios correspondientes y mostramos
        }
        System.out.print("\n");                             
    }
}
