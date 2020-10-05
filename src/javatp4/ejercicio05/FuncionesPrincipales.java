package javatp4.ejercicio05;

public class FuncionesPrincipales {
    private String password;
    private int suma;
    private MatrizDeGolocinas golocinas;

    public FuncionesPrincipales(MatrizDeGolocinas golocinas, String password){
        this.golocinas = golocinas;
        this.password = password;
        this.suma = 0;
    }
    public boolean comprobarContrasena(String contrasena){
        if(contrasena.equals(this.password)){
            return true;
        }else{
            return false;
        }
    }
    public boolean ingresarProductos(int producto, int cantidad){
        if(this.golocinas.depositarGolocina(producto, cantidad)){
            return true;
        }else{
            return false;
        }
    }

    public boolean retirarProducto(int producto) {
        int precio =  golocinas.sacarGolocina(producto);
        if(precio != -1){
            suma += precio;
            return true;
        }else{
            return false;
        }
    }

    public int getSuma(){
        return this.suma;
    }
    public String[][] getGolocinasArray(){
        String[][] golocinasArray;
        golocinasArray = this.golocinas.getMatrizGolocinas().clone();
        return golocinasArray;
    }
}
