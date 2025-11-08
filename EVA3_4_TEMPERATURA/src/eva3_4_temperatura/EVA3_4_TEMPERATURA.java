/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_temperatura;

import java.util.Scanner;

/**
 *
 * @author jofer
 */
public class EVA3_4_TEMPERATURA {
    //aqui es donde se ejecuta mi codigo en bucle osea el menu5
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       System.out.println("elige we");
        int valor;
      do{
          imprimirmenu();
          valor = input.nextInt();
        switch (valor){
            case 1:
                System.out.println("far a celcius");
                faracelcius();
                break;
            case 2:
                System.out.println("kelvin a cel");
                kelvinacelcius();
                break;
               
            case 3:
                System.out.println("celcius a far");
                celciusafahr();
                break;
                
                        }
      }while(valor !=4);
    }
     public static void imprimirmenu(){
        
        System.out.println("Hola esta calculadora calcula");
        System.out.println("elige lo que quieres");
        System.out.println("1. far a celcius ");
        System.out.println("2. kelvin a celcius");
        System.out.println("3. celcius a fahr");
        System.out.println("4 terminar");
    }
     
     //primera operacion de farenheit a celcius
     public static void faracelcius(){
         Scanner input = new Scanner (System.in);
        double far, resu;
        System.out.println("grados farenheit ");
        far = input.nextInt();
        resu = convertircelcius(far);
        System.out.println(far + "farenheit = " + resu + "C");
        
    }//la operacion que vamos a hacer de far a celcius
    public static double convertircelcius(double far){ // far a centi
        double resu =(far-32 )/1.8;
        return resu;
    }
    
    //segunda operacion de kelvin a celcius
    public static void kelvinacelcius(){
          //sigue de kelvin a centigrados 
        Scanner input = new Scanner (System.in);
        System.out.println("dime tus grados kelvin ");
        double kel, resul;
        kel = input.nextDouble();
        resul = convertirkelvin(kel);
        System.out.println( kel +" kelvin =" + resul + "C" );
    }//operacion de kel a cel
   public static double convertirkelvin (double kel){
        double resul = kel - 273.15;
        return resul;
    }
   
   //tercera operacion de celcius a fahr
   public static void celciusafahr(){
         //sigue de kelvin a faherenheit 
                 Scanner input = new Scanner (System.in);
    System.out.println("dime tus grados centigrados ");
        double result,cel;
        cel = input.nextDouble();
        result= convertirfar(cel);
        System.out.println(cel+ "celcius = " + result + "Far");
    }//operacion de celcius a far
   public static double convertirfar(double cel){
       double resu = 9* (cel/5) + 32;
       return resu;
   }
}
