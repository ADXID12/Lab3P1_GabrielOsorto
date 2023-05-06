/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_gabrielosorto;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Gabriel Osorto
 */
public class Lab3P1_GabrielOsorto {
    
    
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           boolean opcion = true;//iniciazion del boolean
        while (opcion) { //inicio while
            System.out.println("       -----Menu-----");
            System.out.println("1. Serie Euclidiana");
            System.out.println("2. Pokebola");
            System.out.println("3. ¡OK Boomer!");
            System.out.println("4. Salir");
            System.out.println("    ---Ingrese su opcion---");
            int respuesta = sc.nextInt();
            switch (respuesta) {//inicio switch
                case 1 -> {
                    System.out.println("-------Serie Euclidiana-------");
                    System.out.println("Ingrese limite:");
                    int limite= sc.nextInt();
                    double x=0;
                    double y=0;
                    double ecu1=0;
                    double pot=0;
                    double resp=0;
                    for (int i = 0; i < limite; i++) {//inicio for
                        System.out.println("Ingrese x:");
                        x=sc.nextInt();
                        System.out.println("ingrese y:");
                        y=sc.nextInt();
                        ecu1= (x-y);
                        pot= Math.pow(ecu1, 2);
                        resp+=pot;
                    }//fin for   
                        System.out.println(Math.sqrt(resp)); 
                    
                    
                    break;
                }//fin case 1
                case 2 -> {
                    System.out.println("-------Pokebola :D-------");
                    System.out.println("ingrese un numero para el tamaño de la figura:");
                    int num= sc.nextInt();
                    for (int i=1; i<= num; i++){
                        for (int j=1; j<= (num*2)-1; j++){
                            if ((i==1||i==num)||(j==1 || j==(num*2)-1)){
                                System.out.print("*");
                            } else { System.out.print(" ");
                           
                                
                            }//fin primer else if
                            
                            
                            
                        }//fin segundo for
                        System.out.println("");
                        
                    }//fin primer for
                    break;
                }//fin case 2
                case 3 -> {
                    System.out.println("-------¡OK Boomer!-------");
                    System.out.println("ingrese su edad: ");
                    int edad=sc.nextInt();
                    while (edad <= 0) { //while validacion
                        System.out.println("Ingrese un numero positivo:");
                        edad = sc.nextInt();
                    } //Final while validacion
                    if ((edad<=2025)&&(edad>=2013)){
                                System.out.println("¡Felicidades, usted es de la Generacion Gen Alpha!");
                            } else if ((edad<=2012)&&(edad>=1990)){
                                System.out.println("¡Felicidades, usted es de la Generacion Gen Z");               
                            } else if ((edad<=1994)&&(edad>=1980)){
                                System.out.println("¡Felicidades, usted es de la Generacion Milenials");
                            } else if ((edad<=1985)&&(edad>=1975)){
                                System.out.println("¡Felicidades, usted es de la Generacion Xennials");
                            } else if ((edad<=1979)&&(edad>=1960)){
                                System.out.println("¡Felicidades, usted es de la Generacion X");
                            } else if ((edad<=1964)&&(edad>=1946)){
                                System.out.println("¡Felicidades, usted es de la Generacion Baby Boomer Gen");
                            } else 
                                System.out.println("O usted no ha nacido, o usted ya se murio ( o ya casi se muere como Maradona)");
                   break;
                }//fin case 3
                case 4 -> {
                    opcion=false;
                   break;
                    
                }//fin case 4

                default -> System.out.println("Opcion no valida");
        // TODO code application logic here
            }//fin switch
        }//fin while
    }
}//FIN DE EL UNIVERSO QUE CONOCEMOS Y DE TODA POSIBLE EXISTENCIA Y FORMA DE VIDA DENTRO DE ESTE CODIGO EL CUAL MORIRA CUANDO DECIDAS FINALIZAR LA EJECUCION.

    

