/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_sobrecargademetodos;

import java.util.Scanner;

/**
 *
 * @author jofer
 */
public class EVA3_13_SOBRECARGADEMETODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("elige we");
        int valor ;
      do{
          imprimirmenu();
          valor = input.nextInt();
        switch (valor){
            case 1:
                calcularArea(1 , 1);// debo cambiarlos
                break;
            case 2:
                calcularArea(1,1,1);
                break;
               
            case 3:
                calcularArea(1,1,1,1);
                break;
                
                        }
      }while(valor !=4);
    }
      public static void imprimirmenu(){
        
        System.out.println("Hola esta calculadora calcula");
        System.out.println("elige lo que quieres");
        System.out.println("1. area del circulo ");
        System.out.println("2. area del rectangulo");
        System.out.println("3. area del trapecio");
        System.out.println("4 terminar");
    }
    public static double calcularArea(double valor, double resultado){
        //circulo
        Scanner input = new Scanner (System.in);
         System.out.println("dame tu radio");
         valor = input.nextDouble();
         resultado = (3.1415 * valor * valor);
         System.out.println("tu area es: " + resultado);
         return  resultado;
         
    }
  
    public static double calcularArea(double valor,double valor2, double resultado){
        //rectangulo
        Scanner input = new Scanner (System.in);
         System.out.println("dame tu base ");
         valor = input.nextDouble();
         System.out.println("dame tu altura");
         valor2 = input.nextDouble();
         resultado = (valor * valor2) +1 -1;
         System.out.println("tu area es: " + resultado);
         return  resultado;
    }
    public static double calcularArea(double valor,double valor2, double valor3, double resultado){
        //rectangulo
        Scanner input = new Scanner (System.in);
         System.out.println("dame tu base ");
         valor = input.nextDouble();
         System.out.println("dame tu altura");
         valor2 = input.nextDouble();
         System.out.println("dame tu base menor");
         valor3 = input.nextDouble();
         resultado = ((valor + valor3)* valor2)/ 2;
         System.out.println("tu area es: " + resultado);
         return  resultado;
    }
}
