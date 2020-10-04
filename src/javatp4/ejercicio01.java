/**Crea un programa que pida por pantalla cuatro países y a continuación tres
    ciudades de cada uno de estos países. Los nombres de ciudades deben
    almacenarse en un array multidimensional cuyo primer índice sea el número
    asignado a cada país y el segundo índice el número asignado a cada ciudad. Es decir
    el array deberá tener un tamaño de 4x4 
*/
package javatp4;

import java.util.Scanner;
import utiles.Utiles;
/**
 * 
 * @author diego
 */
public class ejercicio01 {
    public static void main(String[] args) {
        String[][] paiseCiudades = new String[4][4];                //se crea una matriz de 4*4
        ingresoArrayPaisesCiudades(paiseCiudades);                  //se ingresan los datos en la matriz
        printArrayPaisesCiudades(paiseCiudades);                    //se imprimen los datos
    }

    public static void ingresoArrayPaisesCiudades(String[][] paisYCiudades) {
        for(int i = 0; i <paisYCiudades.length; i++){                       //recorre elementos de la columna
            paisYCiudades[i][0] = escrituraLectura("ingrese el pais:");     //ingresar el pais
            for(int j = 1; j < paisYCiudades[0].length; j++){               //recorro la fila
                paisYCiudades[i][j] = escrituraLectura("ciudad:");          //lleno con la ciudad el espacio de la fila
            }
        }
    }
    
    public static void printArrayPaisesCiudades(String[][] array){
        for(int i =0; i <array.length; i++){
            System.out.print("pais:" + Utiles.rellenarEspacios(array[i][0], 12) + "\tciudades: ");
            for(int j = 1; j < array[0].length; j++){
                
                System.out.print(Utiles.rellenarEspacios(array[i][j], 12) + " ");
            }
            System.out.print("\n");
        }
    }
    
    public static String escrituraLectura(String mensaje){
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);                        //Se muestra el mensaje
        return scanner.nextLine();                          //se lee lo introducido por el usuario
    }

}
