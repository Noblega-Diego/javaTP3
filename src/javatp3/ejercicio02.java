/*
 * Crea un array o arreglo unidimensional con un tamaño de 5, asignale los valores
 * numéricos manualmente (los que tú quieras) y muestralos por pantalla. Solicite los
 * números mediante un bucle.
 */
package javatp3;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class ejercicio02 {
    public static void main(String[] args) {
        System.out.println("ingrese unos numeros para luego mostrarlos");//mensaje principal
        int [] numerosArray = new int[5];                                //creacion del array
        ingresoDeNumeros(numerosArray);                                  //ingreso de numeros
        mostrarArray(numerosArray);                                      //mostrar valores del array
    }
    /**
     * rellena un array, pidiendole al usuario los numeros.
     * @param arreglo arreglo a rellenar
     */
    public static void ingresoDeNumeros(int[] arreglo){
        for(int lugar = 0; lugar < arreglo.length; lugar++){//se recorre el array
            arreglo[lugar] = mensajeLectura("espacio "+ lugar + ":");//se le almacena el dato ingresado por el usuario
        }
    }
    /**
     * muestra los datos almacenados
     * @param arreglo arreglo a mostrar
     */
    public static void mostrarArray(int[] arreglo){
        for(int lugar = 0; lugar < arreglo.length; lugar++){
            System.out.println(arreglo[lugar]);
        }
    }
    /**
     * muestra un mensaje para luego leer la entrada;
     * @param mensaje mensaje que se mostra par luego ingresar el valor
     * @return valor entregado
     */
    public static int mensajeLectura(String mensaje){
        System.out.print(mensaje);//mostrar mensaje de ingreso de datos
        Scanner scanner = new Scanner(System.in);//lectura del valor ingresado
        return scanner.nextInt();
    }
}
