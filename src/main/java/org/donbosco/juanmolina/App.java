package org.donbosco.juanmolina;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

     String intro = "Calcula tu Índice de Masa Corporal (IMC).";

     System.out.println(intro);

     Scanner input = new Scanner(System.in);

     int height = 0;
     int weight = 0;
     

     System.out.print("¿Cuanto mides? [En centrímetros]: ");

     while (!input.hasNextInt()){

     System.out.print("El valor es incorrecto, ingreseló de nuevo: ");
    
     input.next();

     }

     height = input.nextInt();

     System.out.print("¿Cuanto pesas? [En kilos]: ");

     while (!input.hasNextInt()){

     System.out.print("El valor es incorrecto, ingreseló de nuevo: ");
    
     input.next();

     }

    weight = input.nextInt();

    }
}
