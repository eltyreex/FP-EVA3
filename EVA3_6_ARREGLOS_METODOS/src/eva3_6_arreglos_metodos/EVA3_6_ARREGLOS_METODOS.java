/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_arreglos_metodos;

/**
 *
 * @author jofer
 */
public class EVA3_6_ARREGLOS_METODOS {
static String[] menu = {"productos", "ventas", "clientes", "salir"};
static String[] productos = {"tacos", "tanalles", "licuados", "gatos"};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        imprimirarrgelo(menu);
        imprimirarrgelo(productos);
    }
    public static void imprimirarrgelo(String[] arreglo){
        for(int i = 0; i<arreglo.length; i++){
            System.out.println("[ "+arreglo[i]+" ]");
        }
        System.out.println("");
    }
}
