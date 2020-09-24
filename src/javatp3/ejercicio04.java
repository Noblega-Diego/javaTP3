/**
 * Escriba una aplicación que:
 * a) lea 20 números decimales ingresados por teclado por el usuario y los coloque en un
 * arreglo unidimensional. 
 * b) determine y muestre el mayor de los números en el arreglo
 * c) determine y muestre el menor de los números del arreglo calcule y muestre el rango
 * (diferencia entre el mayor y el menor) de los elementos en el arreglo
 * 
*/

package javatp3;
import java.util.Scanner;
/**
 *
 * @author diego
 */
public class ejercicio04 {
    public static void main(String[] args) {
        float [] decimales = new float[20];
        System.out.println("ingrese los numeros decimales");
        ingresoDeNumeros(decimales);

    }
    /**
     * rellena un array, pidiendole al usuario los numeros.
     * @param arreglo arreglo a rellenar
     */
    public static void ingresoDeNumeros(float[] arreglo){
        for(int lugar = 0; lugar < arreglo.length; lugar++){//se recorre el array
            arreglo[lugar] = mensajeYLectura("N°"+ (lugar+1) + ":");//se le almacena el dato ingresado por el usuario
        }
    }
    /**
     * muestra el mensaje para la lectura del float ingresado
     * @param mensaje mensaje que se mostrara
     * @return float
     */
    public static float mensajeYLectura(String mensaje){
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextFloat();
    }

    
}
