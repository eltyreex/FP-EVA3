/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_metodos;

/**
 *
 * @author jofer
 */
public class EVA3_2_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        repetirMensaje("Hola",5); //no regresa ningun valor
      
    
    }//declaracion del metodo
 public static void repetirMensaje(String mensaje, int repeticiones)   {//encabezado del metodo
     for(int i=1; i <= repeticiones; i++){
         System.out.println(mensaje);
     }
 }
}
