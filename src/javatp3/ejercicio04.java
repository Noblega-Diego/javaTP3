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
     * retorna el mayor numero de un array
     * @param decimales array de decimales
     * @return el mayor numero encontrado
     */
    public static float mayorDelArreglo(float[] decimales) {
        float mayor = decimales[0];
        for(int i = 0; i< decimales.length; i++ ){//iteramos el array
            if(mayor < decimales[i]){//si el numero almacenado como mayor es menor al siguiente se almacena este
                mayor = decimales[i];//se almacena el numero siguiente si resulta ser mayor
            }
        }
        return mayor;//retorna el mayor numero encontrado
    }
    /**
     * dado dos numero retorna la diferencia de estos
     * @param numA,numB numeros a entregar para saber su diferencia
     * @return diferencia
     */
    public static float diferencia(float numA, float numB) {
        double dif;
        if(numA > numB){//dependidendo del cual es mayor
            dif = numA-numB;
        }else{
            dif = numB-numA;
        }
        //una diferencia no pude ser negativa asi que elevamos el numero a la 2 para luego sacar raiz de este y asi obtener el valor absoluto
        return (float)Math.sqrt(dif*dif);
    }

    /**
     * retorna el menor numero de un array
     * @param decimales array de decimales
     * @return el menor numero encontrado
     */
    public static float menorDelArreglo(float[] decimales) {
        float menor = decimales[0];
        for(int i = 0; i < decimales.length; i++){
            if(decimales[i] < menor){// si el numero actual es menor al numero anterior
                menor = decimales[i];//se almacena el numero actual 
            }
        }
        return menor;
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
