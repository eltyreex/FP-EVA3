/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_metodo;

/**
 *
 * @author jofer
 */
public class EVA3_1_METODO {
    
    public static void main(String[] args) {
        System.out.println("Hola");
        //INVOCAR METODO
        //LLAMAR A PROCEDIMIENTO O FUNCION
        //1. Si queremos recuperar el valor
        long resu = calcularCuadrado(585955515);
        System.out.println("El cuadrado de 585955515 es "+ resu);
        //2. si queremos invocarlo sin guardarlo 
        System.out.println("el no se q es " + calcularCuadrado(585955515));
        //3. no me interese el resultado 
        calcularCuadrado(585955515);
    }
    //MODIFICADORES
    //MODIFICADOR DE ACCESO: PUBLIC, PRIVATE, PROTECTED, DEFAULT
    //static --> se necesita para usar nuestros metodos en el main
    //public static
                   //Valor de retorno
                                      //NOMBRE DEL METODO (DE PREFENCIA UN VERBO)
                                                                                  //Lista de parametros (0 a N cantidad de palabras)
    public static long calcularCuadrado(long num){// declaracion o encabzado
        //{} --> IMPLEMENTACION DEL METODO (CUERPO DE METODO)
        long cuadrado = num* num;
        return cuadrado; // se regresa el resultado es como el break 
        //ya no se puede poner mas codigo aqui
        //System.out.println(""); nunca va a poder llegar 
    }
}
