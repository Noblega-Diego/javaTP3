/*
 * Crea un array o arreglo unidimensional donde tú le indiques el tamaño por teclado y crear
 * una función que rellene el array o arreglo con los múltiplos de un numero pedido por
 * teclado. Por ejemplo, si defino un array de tamaño 5 y elijo un 3 en la función, el array
 * contendrá 3, 6, 9, 12, 15. Muéstralos por pantalla usando otra función distinta.
 */
package javatp3;

/**
 *
 * @author diego
 */
public class ejercicio03 {
    public static void main(String[] args) {
        int espacio;
        int multiplo;
        espacio = ejercicio02.mensajeLectura("ingrese la cantidad de multiplos a entregar:");//se usa el metodo de lectura creado en el anterior ejercicio
        if(espacio > 0){
            multiplo = ejercicio02.mensajeLectura("ingrese el numero:");
            int[] multiplos = new int[espacio];
            multiplosEnArray(multiplos, multiplo);
            mostrarArray(multiplos);
        }
        
    }
    /**
     * añade multiplos del numero entregado al array
     * @param arreglo al cual se le añadiran
     * @param numero numero del cual se obtendran sus multiplos
     */
    public static void multiplosEnArray(int[] arreglo,int numero) {
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = (i+1) * numero;//se multiplica el numero por el espacio mas 1;
        }
    }
    /**
     * muestra los multiplos almacenados
     * @param arreglo arreglo a mostrar
     */
    public static void mostrarArray(int[] arreglo){
        for(int lugar = 0; lugar < arreglo.length; lugar++){
            System.out.println(""+arreglo[0]+" * "+(lugar + 1)+" = "+arreglo[lugar]);
        }
    }

}
