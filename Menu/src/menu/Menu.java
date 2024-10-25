/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     
        
        Scanner scanner = new Scanner(System.in);
        
        int op = 0;
        while (op != 4){
           
        System.out.println("****MENU****");
        System.out.println("1) CADENA"
                        +"\n2) NOTAS"
                        +"\n3) CLASES"
                        +"\n4) SALIR"+"\n");
        System.out.print("Favor ingrese una opcion: ");
            op = scanner.nextInt();
                
         if(op == 1){
             
               System.out.println("****CADENA****");
               System.out.println("Ingrese una cadena de texto: ");
               String cadena = scanner.next();
               
               int longitud = cadena.length();
               int maxRe=0;
               char caracterRepetido=' ';
               char caracter=0;
               
               while (caracter<256){
                   int contador=0;
                   int contadorChar=0;
                   
                   while (contadorChar<longitud){
                       if (cadena.charAt(contadorChar) == caracter){
                           contador++;
                       }
                       contadorChar++;
                   }
                   
                   if (contador>maxRe){
                       maxRe=contador;
                       caracterRepetido=caracter;
                   }
                   
                   caracter++;
                   
               }
               System.out.println("El caracter mas repetido es: "+caracterRepetido);
               System.out.println("Se repite: "+maxRe+" veces ");
         }else if(op == 2){
             System.out.println("****NOTAS**** ");
             System.out.print("Ingresar la cantidad de notas: ");
             int cantidadNotas = scanner.nextInt();
             int contador=0;
             double sumarNota=0;
             double promedio=0;
             double notaMayor=0;
             double notaMenor=100;
             
             while (contador++<cantidadNotas){
                 System.out.print("Nota "+contador+" : ");
                 double nota = scanner.nextDouble();
                 sumarNota+=nota;
                 
                    while(nota>notaMayor){
                        notaMayor=nota;
                    }
                        while(nota<notaMenor){
                            notaMenor=nota;
                        }
                            while(nota<=1 || nota>=101){
                                System.out.println("Nota "+contador+" : ");
                                nota = scanner.nextDouble();
                            }
                       
             }
             
             promedio=sumarNota/cantidadNotas;
             System.out.println("Promedio: "+promedio
                               +"\nNota menor: "+notaMenor
                               +"\nNota mayor: "+notaMayor+"\n");
         }
            }
               
                }
                    }
    
       

 

