package utiles;

import java.io.IOException;
import java.util.Scanner;
public class Utiles {
    public static String rellenarEspacios(String string, int espaciosTotal) {
        String nuevoString;
        if(string.length() < espaciosTotal){
            nuevoString = string;
            for(int i = string.length(); i<espaciosTotal; i++){
                nuevoString += " ";
            }
        }else{
            nuevoString = "";
            for(int i = 0; i<(espaciosTotal-3); i++){
                nuevoString += string.charAt(i);
            }
            nuevoString += "...";
        }
        return nuevoString;
    }
    
    public static String rellenarEspaciosSimple(String string, int espaciosTotal) {
        String nuevoString = string;
        if(string.length() < espaciosTotal){
            for(int i = string.length(); i<espaciosTotal; i++){     //inicio con el espacio del array hata el espacio que tendria que tener
                nuevoString += " ";                                 //añade espacio
            }
        }
        return nuevoString;                                         //retorna string con los espacios
    }

    public static int leerIntMostrar(String mostrar) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.print(mostrar);
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            throw e;
        }
    }

    public static boolean ingresarIntEnArray(int[][] array){
        int longColuma = array.length;
        int longFila = array[0].length;
        for(int i = 0; i < longColuma; i++){
            for(int j = 0; j < longFila; j++){
                try {
                    array[i][j] = leerIntMostrar("array["+i+"]"+"[" +j +"]: ");
                    
                } catch (Exception e) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void mostrarArrayInt(int[][] array, int espacio){
        int filas= array.length;
        int columnas = array[0].length;
        for(int i = 0; i <filas; i++){
            for(int j = 0; j< columnas; j++){
                String num = String.valueOf(array[i][j]); 
                System.out.print(rellenarEspaciosSimple(num, espacio));
            }
            System.out.print("\n");
        }
    }
    public static void clear(){
        //Borrar consola en java
        try {
            if (System.getProperty("os.name").contains("Windows")) //Determina si el sistema es Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();//Borrar consola Windows
            else
                Runtime.getRuntime().exec("clear"); //Borrar consola en Linux
        } catch (IOException | InterruptedException ex) {}
    }
}
