/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_paso_referencia;

/**
 *
 * @author jofer
 */
public class EVA3_10_PASO_REFERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] arreglo1, arreglo2; //se crean 2 arreglos
        arreglo1 = new int[10]; //se define el tama de los arreglos
        arreglo2 = new int [20]; // lo mismo de arriba
        llenararreglo(arreglo1);
        imprimirarrgelo(arreglo1);
        llenararreglo(arreglo2);
        imprimirarrgelo(arreglo2);
    }
    
    public static void llenararreglo(int[] arreglo){ //aqui vamos a crear un llenador
        for(int i =0; i < arreglo.length; i ++){
            arreglo [i]= (int)(Math.random()*100);
        }
    }
    public static void imprimirarrgelo(int[] arreglo){
        for(int i =0; i < arreglo.length; i ++){
            System.out.print("["+ arreglo[i] + "]");
        }
        System.out.println("");
    }
}
