/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_11_captura_clientes;

import java.util.Scanner;

/**
 *
 * @author jofer
 */
public class EVA3_11_CAPTURA_CLIENTES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] clientes = new String[5];
        double[] credito = new double [5];
        capturadeclientes(clientes, credito);
        System.out.println("clientes");
        imprimir(clientes);
                System.out.println("Credito");

        imprimir(credito);
        System.out.println("todo");
        imprimir(clientes, credito);
    }
    public static void capturadeclientes(String[] clientes, double credito[]){
        Scanner input = new Scanner (System.in);
        for(int i =0; i < clientes.length; i ++){    
            System.out.println("Nombre del cliente");
            clientes[i] = input.nextLine();
            
            System.out.println("Credito");
            credito[i] = input.nextDouble();
            input.nextLine();
        }
    }
    public static void imprimir(String[] arreglo){
        for(int i =0; i < arreglo.length; i ++){
            System.out.print("["+ arreglo[i] + "]");
        }
        System.out.println("");
    }
    
   public static void imprimir(double[] credito){
        for(int i =0; i < credito.length; i ++){
            System.out.print("["+ credito[i] + "]");
        }
        System.out.println("");
    }
   public static void imprimir(String[] arreglo, double[] credito){
        for(int i =0; i < credito.length; i ++){
            System.out.print("["+ arreglo[i] + "]");

            System.out.print("["+ credito[i] + "]");
        }
        System.out.println("");
    }
    
}
//sobrecarga es dar diferente funcionalidad al mismo identificador/ simbolo 
//metodos : no puede haber identificadores duplicados en java  
//firma