/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_parametros;

/**
 *
 * @author jofer
 */
public class EVA3_7_PARAMETROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nume=5;
        System.out.println("original"+nume);
        incrementar(nume);//se manda una copia del valor almacenado en nume
        System.out.println("despues del valor" +nume);
    }
    //INCREMENTEA UN ENTERO EN 1
    public static void incrementar(int valor){
        valor = valor +1;
    }
}
