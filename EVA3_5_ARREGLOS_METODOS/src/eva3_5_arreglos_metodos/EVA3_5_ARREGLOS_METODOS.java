/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_5_arreglos_metodos;

/**
 *
 * @author jofer
 */
public class EVA3_5_ARREGLOS_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] miarreglo;
        miarreglo = crearArreglo(500,100000);
        imprimirarrgelo(miarreglo);
        
    }
    //CREAR UN ARREGLO Y LO DEVUELVA LLENO DE VALORES ALEATORIOS
    public static int[] crearArreglo(int tama, int aleatorio){
        int resu[] = new int [tama];
        for(int i=0; i <resu.length;i++){
            resu[i] =(int) (Math.random() * aleatorio);
        }
        return resu;
    }
    //IMPRIMIR EL ARREGLO
    public static void imprimirarrgelo(int[] arreglo){
        for(int i = 0; i<arreglo.length; i++){
            System.out.print("[ "+arreglo[i]+" ]");
        }
        System.out.println("");
    }
}
