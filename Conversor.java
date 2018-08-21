import java.io.*;
import java.util.Scanner;
public class Conversor{
       public static void main( String args[] ){
       Scanner medida = new Scanner(System.in);
 
       double P,C,L,Y,RES;
       int caso;
      
       System.out.println( "Bienvenido. Este programa le ayudara a Convertir varias Unidades a Pulgadas" );
       System.out.println( "Codigo Por: Vivian Nathaly Ramirez" );
       System.out.println( "Ingrese el numero de la conversion que desea: " );
       System.out.println( "1.- Pies (P) a pulgadas (IN)" );
       System.out.println( "2.- Centimetros (C) a pulgadas (IN)" );
       System.out.println( "3.- Leguas (L) a pulgadas (IN)" );
       System.out.println( "4.- Yardas (Y) a pulgadas (IN)" );
       System.out.println( "\n" );
       caso = medida.nextInt();
 
       switch (caso){
                   case 1:
                          System.out.println( "Pies (P) a pulgadas (IN)" );
                          System.out.println( "Ingrese los Pies a convertir:" );
                          P = medida.nextDouble();
                          RES = P * 12;
                          System.out.println( "El resultado es: "+RES+" IN" );
                          break;
                   case 2:
                          System.out.println( "Centimetros (C) a pulgadas (IN)" );
                          System.out.println( "Ingrese los Centimetros a convertir:" );
                          C = medida.nextDouble();
                          RES = C / 2.54;
                          System.out.println( "El resultado es: "+RES+" C" );
                          break;
                   case 3:
                          System.out.println( "Leguas (L) a pulgadas (IN)" );
                          System.out.println( "Ingrese las Leguas a convertir:" );
                          L = medida.nextDouble();
                          RES = L * 190080.02;
                          System.out.println( "El resultado es: "+RES+" L" );
                          break;
                   case 4:
                          System.out.println( "Yardas (Y) a pulgadas (IN)" );
                          System.out.println( "Ingrese las Yardas a convertir:" );
                          Y = medida.nextDouble();
                          RES = Y * 36;
                          System.out.println( "El resultado es: "+RES+" Y" );
                          break;
                  }
       }
}