/*
    Crea un programa que pida por pantalla 2 valores numéricos enteros X e Y. Cree un
    primer array de tamaño [X,Y] de tipo entero y almacene en cada posición un valor
    entero que deberá ser ingresado por el usuario. A continuación cree un segundo
    array de tamaño [Y,X] y almacene en cada posición un valor entero que deberá ser
    ingresado por el usuario. Finalmente cree un tercer array de tamaño [X,Y] que será
    el resultante de multiplicar cada una de las posiciones de las filas del array uno por
    cada una de las posiciones de las columnas del array 2.
    Muestre por pantalla cada uno de los arrays con sus valores
*/
package javatp4;
import utiles.Utiles;
public class ejercicio02 {
    public static void main(String[] args) {
        Integer x = 0;
        Integer y = 0;
        boolean introducirDatos;
        try {
            x = Utiles.leerIntMostrar("x:");    //lee x
            y = Utiles.leerIntMostrar("y:");    //lee y
            if(x > 0 && y > 0){
                introducirDatos = true;
            }else{
                System.out.println("ERROR: alguno de los espacios ingresados es incorrecto");
                introducirDatos = false;
            }
        } catch (Exception valorIngresado) {
            System.out.println("ERROR: El tipo de dato ingresado es incorrecto");
            introducirDatos = false;
        }
        
        if(introducirDatos){
            int[][] arrayUno =  new int[x][y];
            int[][] arrayDos =  new int[y][x];
            if(IngresoDeLosArrays(arrayUno, arrayDos)){ //
                int[][] arrayTres = multiplicacionDeArray(arrayUno, arrayDos);
                System.out.println("Array 1:");
                mostrarArray(arrayUno);
                System.out.println("Array 2:");
                mostrarArray(arrayDos);
                System.out.println("Array 3:");
                mostrarArray(arrayTres);
            }
        }
    }
    private static boolean IngresoDeLosArrays(int[][] arrayUno, int[][] arrayDos) {
        System.out.println("Primer Array");
            
            if(ingresarDatosEnArray(arrayUno)){
                if(ingresarDatosEnArray(arrayDos)){
                    return true;
                }else{
                    System.out.println("ERROR: El tipo de dato ingresado es incorrecto");
                    return false;
                }
            }else{
                System.out.println("ERROR: El tipo de dato ingresado es incorrecto");
                return false;
            }
    }
    
    public static boolean ingresarDatosEnArray(int[][] array){
        int longColuma = array.length;
        int longFila = array[0].length;
        for(int i = 0; i < longColuma; i++){
            for(int j = 0; j < longFila; j++){
                try {
                    array[i][j] = Utiles.leerIntMostrar("array["+i+"]"+"[" +j +"]: ");
                } catch (Exception e) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] multiplicacionDeArray(int[][] a,int[][] b){
        int[][] array = new int[a.length][a[0].length];                 //creacion del 3 Array
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                array[i][j] = a[i][j] * b[j][i];                        //
            }
        }
        return array;
    }

    public static void mostrarArray(int[][] array){
        int filas= array.length;
        int columnas = array[0].length;
        for(int i = 0; i <filas; i++){
            for(int j = 0; j< columnas; j++){
                String num = String.valueOf(array[i][j]); 
                System.out.print(Utiles.rellenarEspaciosSimple(num, 5));
            }
            System.out.print("\n");
        }
    }
}
