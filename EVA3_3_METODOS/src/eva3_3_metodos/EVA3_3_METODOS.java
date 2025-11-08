/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_metodos;

import java.util.Scanner;

/**
 *
 * @author jofer
 */
public class EVA3_3_METODOS {

   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("elige we");
        int valor;
       
      do{
          imprimirmenu();
          //manejo de opciones
                     valor = input.nextInt();

        switch (valor){
            case 1:
                break;
            case 2:
                System.out.println("potencia");
                realizarpotecia();
                break;
               
            case 3:
                System.out.println("suma ahora aca va");
                realizarsuma();
                break;
                
                        }
      }while(valor !=4);
       
      
    }
    //imprimir menu
    public static void imprimirmenu(){
        System.out.println("Hola chavos compren");
        System.out.println("elige lo que quieres");
        System.out.println("1. calculadora");
        System.out.println("2. potencia");
        System.out.println("3. suma");
        System.out.println("pollo");
        System.out.println("4 terminar");
        
    }//hacer la suma
    public static void realizarsuma(){
        Scanner input = new Scanner (System.in);
        int val1,val2;
        System.out.println("valor 1");
        val1=input.nextInt();
        System.out.println("valor 2");
        val2 = input.nextInt();
        int resultado = sumar(val1, val2);
        System.out.println("tu suma es " + resultado);
        
    }//suma
    public static int sumar(int num1, int num2){
        return num1 + num2;
    }
    public static void realizarpotecia(){
        Scanner input = new Scanner (System.in);
        int val1,val2;
        System.out.println("valor 1");
        val1=input.nextInt();
        System.out.println("valor 2");
        val2 = input.nextInt();
        int resultado = potencia(val1, val2);
        System.out.println("tu potencia es" + resultado);
    }
    public static int potencia (int base, int num2){
        
        Scanner input = new Scanner(System.in);
    int numero, potencia;
    
    System.out.println("¿Qué número?");
    numero = input.nextInt();
    System.out.println("¿A qué potencia?");
    potencia = input.nextInt();
    
    int resultado = 1;
    
    for(int i = 1; i <= potencia; i++){
        resultado *= numero; 
    }
    
    return resultado;
}
}
