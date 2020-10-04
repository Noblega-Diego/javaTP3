/*Codifique un programa que solicite un valor entero X mayor o igual a 4 y menor o
    igual a 10. Cree un arreglo de tamaño [X,X] de tipo int, nos piden hacer un menú
    con estas opciones:
    a) Rellenar TODA la matriz de números, debes pedírselo al usuario.
    b) Suma de una fila que se pedirá al usuario (validar que elija una correcta)
    c) Suma de una columna que se pedirá al usuario (controlar que elija una
    correcta)
    d) Sumar la diagonal principal
    e) Sumar la diagonal inversa
    f) La media de todos los valores de la matriz
    IMPORTANTE: hasta que no se haga la primera opción a, el resto de opciones no se
    deberán de ejecutar, simplemente mostrar un mensaje que diga que debes
    rellenar la matriz. Mostrar por pantalla el resultado de la ejecución de cada una de
    las opciones del menú.
*/

package javatp4.ejercicio04;

import java.util.Scanner;

import utiles.Utiles;

public class Ejercicio04 {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el tamaño de la matriz");
        System.out.print("x:");
        try {
            x = scanner.nextInt();
            if(x > 1){
                Matriz matriz = new Matriz(x);
                Utiles.clear();
                MenuDeOpciones(matriz);
            }else{
                System.out.println("ERROR:valor ingresado incorrecto");
            }
        } catch (Exception e) {
            System.out.println("ERROR:valor ingresado incorrecto");
        }
        
    }

    private static void MenuDeOpciones(Matriz matriz) {
        Scanner scanner = new Scanner(System.in);
        String opcion;
        System.out.println( "(a)-rellenar Matriz\n" +
                            "(b)-suma De fila\n" +
                            "(c)-suma De columna\n" +
                            "(d)-suma de diagonal principal\n" +
                            "(e)-sumar de diagonal inversa\n" +
                            "(f)-la media de la matriz\n" +
                            "(g)-mostrar la matriz\n" +
                            "(exit)- salir");
        System.out.print("ingrese la opcion:");
        opcion = scanner.nextLine();
        switch(opcion){
            case "a":
                matriz.rellenarMatrizConsole();
                if(opcionContinuar()){
                    MenuDeOpciones(matriz);
                }
            break;
            case "b":
                opcionSumarFila(matriz);
                if(opcionContinuar()){
                    MenuDeOpciones(matriz);
                }
            break;
            case "c":
                opcionSumarColumna(matriz);
                if(opcionContinuar()){
                    MenuDeOpciones(matriz);
                }
            break;
            case "d":
                opcionSumaDiagonal(matriz);
                if(opcionContinuar()){
                    MenuDeOpciones(matriz);
                }
            break;
            case "e":
                opcionSumainversa(matriz);
                if(opcionContinuar()){
                    MenuDeOpciones(matriz);
                }
            break;
            case "f":
                opcionMediaDeLaMatriz(matriz);
                if(opcionContinuar()){
                    MenuDeOpciones(matriz);
                }
            break;
            case "g":
                opcionMostrarMatriz(matriz);
                if(opcionContinuar()){
                    MenuDeOpciones(matriz);
                }
            break;
            case "exit":
            break;
            default:
            MenuDeOpciones(matriz);
        }
    }

    private static boolean opcionContinuar(){
        Scanner scanner = new Scanner(System.in);
        String opcion;
        System.out.println("(y)volver al menu");
        opcion = scanner.nextLine();
        if(opcion.equals("y")){
            return true;
        }else{
            return false;
        }
        
    }

    private static void opcionSumarFila(Matriz matriz){
        if(matriz.getLlenado()){                                                        //verifica si la matriz a sido llenada
            int fila, suma;       
            System.out.println("***** Suma de fila *****");                                              
            try {
                fila = Utiles.leerIntMostrar("ingrese la fila:");                       //lee la fila ingresada
                if(fila>=0 && fila < matriz.getfilas()){                                //si esta comprendido para el array
                    suma = matriz.sumarFila(fila);                                      //se suma la fila
                    System.out.println("resultado: "+ suma);                            //se imrime el resltado
                }else{
                    System.out.println("fila incorrecta");
                }
            }catch (Exception e) {                                                      //si el tipo de dato ingresado es incorrecto
                System.out.println("ERROR: tipo de dato ingresado incorrecto");
            }
        }else{                                                                          //de caso contrario retorna al menu
            System.out.println("Por favor llene el array");
        }                                                                       
    }

    private static void opcionSumarColumna(Matriz matriz){
        if(matriz.getLlenado()){                                                        //verifica si la matriz a sido llenada
            int columna, suma;       
            System.out.println("***** Suma de columna *****");                                              
            try {
                columna = Utiles.leerIntMostrar("ingrese la columna:");                 //lee la columna ingresada
                if(columna>=0 && columna < matriz.getfilas()){                          //si esta comprendido para el array
                    suma = matriz.sumarColumna(columna);                                //se suma la columna
                    System.out.println("resultado: "+ suma);                            //se imrime el resltado
                }else{
                    System.out.println("columna incorrecta");
                }
            }catch (Exception e) {                                                      //si el tipo de dato ingresado es incorrecto
                System.out.println("ERROR: tipo de dato ingresado incorrecto");
            }
        }else{                                                                          //de caso contrario retorna al menu
            System.out.println("Por favor llene el array");
        }   
    }

    private static void opcionSumaDiagonal(Matriz matriz){
        if(matriz.getLlenado()){
            System.out.println("***** Suma de diagonal *****");
            int suma =matriz.sumaDiagonalPrincipal();
            System.out.println("suma Diagonal:" +suma);
        }else{
            System.out.println("por favor llene la matriz");
        }
    }

    private static void opcionSumainversa(Matriz matriz){
        if(matriz.getLlenado()){
            System.out.println("***** Suma de diagonal inversa *****");
            int suma = matriz.sumaDiagonalIversa();
            System.out.println("suma Diagonal inversa:" +suma);
        }else{
            System.out.println("por favor llene la matriz");
        }
    }

    private static void opcionMediaDeLaMatriz(Matriz matriz){
        if(matriz.getLlenado()){
            System.out.println("***** media de la matriz *****");
            double media = matriz.mediaDeMatriz();
            System.out.println("media:" + media);
        }else{
            System.out.println("por favor llene la matriz");
        }
    }
    
    private static void opcionMostrarMatriz(Matriz matriz){
        if(matriz.getLlenado()){
            System.out.println("***** mostrar matriz *****");
            matriz.mostrarMatriz(10);
        }else{
            System.out.println("por favor llene la matriz");
        }
    }
}
