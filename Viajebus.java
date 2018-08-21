import java.io.*;
import java.util.Scanner;
import java.lang.Math;
public class Viajebus{
       public static void main( String args[] ){
       Scanner in = new Scanner(System.in);
 
       double n,x,y,v,z;
       
       /*       
       n= Capacidad del bus en Numero de Personas
       x= Numero de personas que van a viajar
       v= Viajes que debe hacer el conductor
       y= Monto total a pagar por los turistas
       z= Monto total a pagar por el conductor a la empresa
       */
       
       System.out.println( "Bienvenido. Este programa le ayudara a calcular los costos" );
       System.out.println( "del alquiler de un bus para viajar como turista" );
       System.out.println( "Codigo Por: Vivian Nathaly Ramirez" );
       System.out.println( "Ingrese la capacidad del bus en numero de personas:" );
       n = in.nextDouble();
       System.out.println( "Ingrese el numero de personas que van a viajar" );
       System.out.println( "Recuerde que el costo por cada persona es de $10000" );
       x = in.nextDouble();
       v = Math.ceil(x/n);
       y = 10000*n; 
       z = 2000*v;
       System.out.println( "El costo total del alquiler para "+x+" personas es: $"+y );
       System.out.println( "El conductor debe realizar "+v+" viajes" );
       System.out.println( "La capacidad del bus es "+n+" personas" );
       System.out.println( "El conductor debe pagar a la empresa del colectivo $"+z);
       }
}