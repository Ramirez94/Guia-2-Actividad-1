import java.io.*;
import java.util.Scanner;
import java.lang.Math;
public class Impuesto{
       public static void main( String args[] ){
       Scanner in = new Scanner(System.in);
 
       double x,y,z;
       int caso;
       
       /*       
       caso = Tipo de caso
       x= Precio bruto
       y= Impuesto
       z= Precio Neto
       */
       
       System.out.println( "Bienvenido. Este programa le ayudara a calcular EL impuesto de su vehiculo junto con el valor neto" );
       System.out.println( "Por favor intruduzca el digito correspondiente al tipo de Vehiculo");
       System.out.println( "1. Camioneta");
       System.out.println( "2. Automovil");
       caso = in.nextInt();
       switch (caso){
                   case 1:
                          System.out.println( "Su vehiculo es: Camioneta" );
                          System.out.println( "Por favor, Ingrese el valor bruto de su vehiculo:" );
                          x = in.nextDouble();
                          if (x<80){
			  y=0;
			  z=x+y;
                          System.out.println( "El impuesto de su vehiculo es: $"+y );
			  System.out.println( "El Precio Neto (Precio Bruto+impuestos) de su vehiculo es: $"+z );
			  } else {
			  y=x/2;
			  z=x+y;
                          System.out.println( "El impuesto de su vehiculo es: $"+y );
			  System.out.println( "El Precio Neto (Precio Bruto+impuestos) de su vehiculo es: $"+z );
			  }
                          break;
       		   case 2:
                          System.out.println( "Su vehiculo es: Automovil" );
                          System.out.println( "Por favor, Ingrese el valor bruto de su vehiculo:" );
                          x = in.nextDouble();
                          if (x<20){
			  y=5;
			  z=x+y;
                          System.out.println( "El impuesto de su vehiculo es: $"+y );
			  System.out.println( "El Precio Neto (Precio Bruto+impuestos) de su vehiculo es: $"+z );
			  } else if (x>=20&&x<=40){
			  y=x/5;
			  z=x+y;
                          System.out.println( "El impuesto de su vehiculo es: $"+y );
			  System.out.println( "El Precio Neto (Precio Bruto+impuestos) de su vehiculo es: $"+z );
			  } else {
                          y=9;
			  z=x+y;
                          System.out.println( "El impuesto de su vehiculo es: $"+y );
			  System.out.println( "El Precio Neto (Precio Bruto+impuestos) de su vehiculo es: $"+z );
			  }
                          break;
       }
      }
}