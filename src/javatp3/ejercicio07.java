/**
 * Escriba una aplicación que solicite y cargue en un arreglo 10 dígitos enteros, luego cree
 * dos nuevos arreglos y asigne al primero los números ingresados por el usuario de forma
 * ascendente y en el segundo de forma descendente. Muestre los 2 arreglos por pantalla.
 */


package javatp3;

public class ejercicio07 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] arrayAscen;
        int[] arrayDescen;
        llenarElArray(array);
        arrayAscen = arrayAscendiente(array);
        arrayDescen = arrayDescendiente(array);
        mostrarArray(arrayAscen);
        mostrarArray(arrayDescen);
    }

    public static void llenarElArray(int[] intArray){
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = ejercicio02.mensajeLectura("N°"+ (i+1) +":");
        }
    }
    public static void mostrarArray(int[] intArray){
        for(int i = 0; i < intArray.length; i++){
            if(i == intArray.length -1){
                System.out.println(intArray[i]);
            }else{
                System.out.print(intArray[i]+", ");
            }
            
        }
    }
    public static int[] arrayAscendiente(int[] intArray){
        int contenedor;
        int[] arrayAscendiente = intArray.clone();
        
        for(int i = 0; i < arrayAscendiente.length; i++){
            for(int j = i+1; j< arrayAscendiente.length; j++){
                
                if(arrayAscendiente[i] > arrayAscendiente[j]){
                    contenedor = arrayAscendiente[i];
                    arrayAscendiente[i] = arrayAscendiente[j];
                    arrayAscendiente[j] =contenedor;
                }
            }
        }
        return arrayAscendiente;
    } 
    public static int[] arrayDescendiente(int[] intArray){
        int contenedor;
        int[] arrayDescendiente = intArray.clone();
        
        for(int i = 0; i < arrayDescendiente.length; i++){
            for(int j = i+1; j< arrayDescendiente.length; j++){
                
                if(arrayDescendiente[i] < arrayDescendiente[j]){
                    contenedor = arrayDescendiente[i];
                    arrayDescendiente[i] = arrayDescendiente[j];
                    arrayDescendiente[j] =contenedor;
                }
            }
        }
        return arrayDescendiente;
    } 
}
