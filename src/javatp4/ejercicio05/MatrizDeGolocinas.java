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
public class MatrizDeGolocinas {
    private String[][] matrizGolocinas;

    public MatrizDeGolocinas(){
        String[][] golocinas= {{"KitKat","32","10"},{"Chicles","2","50"},
                            {"Caramelos de Menta","2","50"},{"Huevo Kinder","2","50"},{"Chetos","30","10"},
                            {"Twix","26","10"},{"M&M'S","35","10"},
                            {"Papas Lays","40","20"},{"Milkybar","30","10"},
                            {"Alfajor Tofi","20","15"},{"Lata Coca","50","20"},
                            {"Chitos","45","10"}};
        this.matrizGolocinas = golocinas;
    }

    public int sacarGolocina(int posicion){
        int cantidad;                                                           //varible para cantidad de golocinas
        int precio;
        cantidad = Integer.parseInt(this.matrizGolocinas[posicion][2]);         //casteamos cantidad de golocinas
        precio = Integer.parseInt(this.matrizGolocinas[posicion][1]);
        if(posicion >= 0 && posicion < cantidad){                                                       //si hay golocinas
            cantidad --;                                                            //se resta
            this.matrizGolocinas[posicion][2] = String.valueOf(cantidad);           //se guarda la cantidad
            return precio;                                                          //retornamos el precio
        }else{                                                                   //si no 
            return -1;                                                           //retornamos -1 indicando que no hay productos
        }
    }

    public boolean depositarGolocina(int posicion, int cantidad){
        if(cantidad >= 0){
            int cantidadGolocina;                                                           //varible para cantidad de golocinas
            cantidadGolocina = Integer.parseInt(this.matrizGolocinas[posicion][2]);         //casteamos cantidad de golocinas
            cantidadGolocina += cantidad;                                                   //le sumamos
            this.matrizGolocinas[posicion][2] = String.valueOf(cantidadGolocina);           //guardamos la cantidad
            return true;
        }else{
            return false;
        }
    }

    public String[][] getMatrizGolocinas() {
        return matrizGolocinas;
    }
    
    
}
