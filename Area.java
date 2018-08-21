import java.io.*;
import java.util.Scanner;
public class Area{
       public static void main( String args[] ){
       Scanner medida = new Scanner(System.in);
 
       double r,RES;
      
       System.out.println( "Bienvenido. Este programa le ayudara a calcular el area comprendida" );
       System.out.println( "Entre un circulo de radio R y un cuadrado circunscrito" );
       System.out.println( "Codigo Por: Vivian Nathaly Ramirez" );
       System.out.println( "Ingrese el Radio (R) del circulo:" );
       System.out.println( "\n" );
       r = medida.nextDouble();
       RES = (Math.PI*Math.pow(r,2))-((2*r)/Math.pow(2,0.5)*(2*r)/Math.pow(2,0.5)); 
       System.out.println( "El Area comprendida entre el circulo y el cuadrado es: "+RES );
              
       }
}