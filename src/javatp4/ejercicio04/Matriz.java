package javatp4.ejercicio04;

import utiles.Utiles;

public class Matriz {
    private int[][] matriz;
    private boolean llenado;

    public Matriz(int tamano){
        this.matriz = new int[tamano][tamano];
        llenado = false;
    }

    public void rellenarMatrizConsole(){
        int longColuma = this.matriz.length;
        int longFila = this.matriz[0].length;
        int [][] matrizcopia = new int[longFila][longColuma];
        try {
            for(int i = 0; i < longColuma; i++){
                for(int j = 0; j < longFila; j++){

                    matrizcopia[i][j] = Utiles.leerIntMostrar("matriz["+i+"]"+"[" +j +"]: ");
                }
            }
            this.matriz = matrizcopia;
            this.llenado = true;
        } catch (Exception e) {
            System.out.println("ERROR: No se ha podido llenar la mariz con los nuevos valores");
        }
    }

    public int sumarFila(int fila) {
        int suma = 0;
        for(int i = 0; i<this.matriz[0].length; i++){
            suma += this.matriz[fila][i];
        }
        return suma;
    }

    public int sumarColumna(int columna) {
        int suma = 0;
        for(int i = 0; i<this.matriz.length; i++){
            suma += this.matriz[i][columna];
        }
        return suma;
    }

    public int sumaDiagonalPrincipal() {
        int suma = 0;
        for(int i = 0; i < this.matriz.length; i++){
            suma += this.matriz[i][i];
        }
        return suma;
    }

    public int sumaDiagonalIversa() {
        int suma = 0;
        int j = this.matriz.length-1;
        for(int i = 0; i < this.matriz.length; i++){
            suma += this.matriz[i][j];
            j--;
        }
        return suma;
    }

    public double mediaDeMatriz(){
        double suma = 0.0;
        int filas = this.matriz.length;
        int columnas = this.matriz[0].length;
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                suma += this.matriz[i][j];
            }
        }
        return suma/(filas*columnas);
    }
    
    public void mostrarMatriz(int esapcios) {
        for(int i = 0; i<this.matriz.length; i++){
            for(int j = 0; j<this.matriz[0].length; j++){
                String numString = String.valueOf(this.matriz[i][j]);
                System.out.print(Utiles.rellenarEspaciosSimple(numString,esapcios));
            }
            System.out.print("\n");
        }
    }

    public boolean getLlenado(){
        return this.llenado;
    }

    public int getfilas(){
        return this.matriz.length;
    }
    
    public int getColumnas(){
        return this.matriz[0].length;
    }
}
