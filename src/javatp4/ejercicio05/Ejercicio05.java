/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatp4.ejercicio05;


/**
 *
 * @author diego
 */
public class Ejercicio05 {
    
    public static void main(String[] args) {
        String password = "AdminXYZ”";                                                              //contraseña para acceder a ciertas funcionalidades
        MatrizDeGolocinas golocinas = new MatrizDeGolocinas();                                      //Matriz que contiene las golocinas
        FuncionesPrincipales funcionesPrincipales = new FuncionesPrincipales(golocinas, password);  //Las funciones basicas del prorama tales como suma comprovacion de contraseña etc
        Menu menuOpciones = new Menu(funcionesPrincipales);                                         //el objeto menu es el ecargado de la interfaz
        menuOpciones.mostrarMenu();                                                                 //muestra interfaz de menu
        menuOpciones.mostrarSuma();                                                                 //muestra la suma
    }
}
