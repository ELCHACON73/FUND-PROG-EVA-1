/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_6_entradas_salidas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_6_ENTRADAS_SALIDAS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      String marca;
        String modelo;
        int anio;
        Scanner captura =new Scanner (System.in);
        //Hay un paquete System, dentro un paquete out, y dentro
        //de out, la instrucciÃ³n println
        System.out.println("Introduce la marca del auto:");
        marca = captura.nextLine();
        System.out.println("Introduce el modelo del auto:");
        modelo = captura.nextLine();
        System.out.println("Introduce el año del auto:");
        anio = captura.nextInt();
        System.out.println("La marca del vehiculo es: " + marca);
        System.out.println("El modelo del vehiculo es:" + modelo);
        System.out.println("El año del vehiculo es:" + anio);
   }
   
}
