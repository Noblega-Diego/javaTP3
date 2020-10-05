package javatp4.ejercicio05;

import java.util.Scanner;

public class Menu {
    private FuncionesPrincipales funcionesPrincipales;
    
    public Menu(FuncionesPrincipales funciones){
        this.funcionesPrincipales = funciones;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        String opcion;
        System.out.println("*******************************");
        System.out.print("(a)-Pedir golosina"   +   "\n"+
                        "(b)-Mostrar golosinas" +   "\n"+
                        "(c)-Rellenar golosinas"+   "\n"+
                        "(d)-Apagar maquina"    +   "\n");
        System.out.print("ingrese la opcion:");
        opcion = scanner.nextLine();
        switch (opcion) {
            case "a":
                opcionComprarGolocina();
                mostrarMenu();
                break;
            case "b":
                imprimirGolocinas();
                mostrarMenu();
                break;
            case "c":
                opcionIngresarProducto();
                mostrarMenu();
            break;
            case "d":
            break;
            default:
                mostrarMenu();
        }
    }
    public void mostrarSuma(){
        System.out.println("****************************");
        System.out.println("ingresos totales:" + this.funcionesPrincipales.getSuma());
    }
            
    private void opcionIngresarProducto(){
        Scanner scanner = new Scanner(System.in);
        String passwordIngresado;
        System.out.print("ingrese la contraseña:");
        passwordIngresado = scanner.nextLine();
        if(this.funcionesPrincipales.comprobarContrasena(passwordIngresado)){
            System.out.print("ingrese producto:");
            int producto = scanner.nextInt();
            System.out.print("ingrese cantidad:");
            int cantidad = scanner.nextInt();
            boolean estado = funcionesPrincipales.ingresarProductos(producto, cantidad);
            if(!estado){
                System.out.println("INCORRECTO: el espacio es incorrecto");
            }
        }else{
            System.out.println("INCORRECTO: la contraseña es incorrecta");
        }
    }
    
    private void opcionComprarGolocina(){
        Scanner scanner = new Scanner(System.in);
        int posicion;
        System.out.print("ingrese la posicion:");
        posicion = scanner.nextInt();
        boolean estado = funcionesPrincipales.retirarProducto(posicion);
        if(!estado){
            System.out.println("no se pudo completar la operacion");
        }
    }
    
    private void imprimirGolocinas() {
        String[][] matrizGolocinas;
        matrizGolocinas = this.funcionesPrincipales.getGolocinasArray();
        System.out.println(rellenarEspacios("golocinas", 18)+" | "+rellenarEspacios("precio", 8)+ " | "+rellenarEspacios("cantidad", 8));
        System.out.println("----------------------------------------");
        for(int i = 0;i < matrizGolocinas.length; i++){
            System.out.print(rellenarEspacios(matrizGolocinas[i][0], 18));
            for(int j = 1;j < matrizGolocinas[0].length; j++){
                System.out.print(" | "+ rellenarEspacios(matrizGolocinas[i][j], 8));
            }
            System.out.print("\n");
        }
    }
    
    private String rellenarEspacios(String string, int espaciosTotal) {
        String nuevoString = string;
        if(string.length() < espaciosTotal){
            for(int i = string.length(); i<espaciosTotal; i++){     //inicio con el espacio del array hata el espacio que tendria que tener
                nuevoString += " ";                                 //añade espacio
            }
        }
        return nuevoString;                                         //retorna string con los espacios
    }
}
