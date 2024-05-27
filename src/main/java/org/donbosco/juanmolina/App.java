package org.donbosco.juanmolina;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

     String intro = "Bienvenidos a la Calculadora de tu Índice de Masa Corporal (IMC).";
     
     System.out.println(intro);
     System.out.println("(>O.o)>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<(o.O<)");
     Scanner input = new Scanner(System.in);

     float height = 0.0f; 
     float weight = 0.0f; 
    
     System.out.print("¿Cuanto mides? [En metros]: ");
     

     while (!input.hasNextFloat()){
     System.out.println("El valor es incorrecto, ingreseló de nuevo: ");
     input.next(); input.nextLine();
     }
     height = input.nextFloat(); input.nextLine();
     System.out.println("(>O.o)>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<(o.O<)");
     System.out.print("¿Cuanto pesas? [En kilos]: ");
     
     while (!input.hasNextFloat()){
     System.out.println("El valor es incorrecto, ingreseló de nuevo: ");
     input.next(); input.nextLine();
     }
     weight = input.nextFloat(); input.nextLine();

     float result = (weight/(height*height));

     System.out.println("(>O.o)>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<(o.O<)");
     System.out.println("El resultado de tu IMC es: "+result  );
     
     System.out.println("(>O.o)>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~<(o.O<)");
       if (result < 16) {
       System.out.println("Tienes Delgadez severa");
    }
       else if (result >= 16 && result <= 17 ) {
       System.out.println("Tienes Delgadez moderada");
    }
       else if (result >= 16 && result <= 17 ) {
       System.out.println("Tienes Delgadez moderada");
       }
       else if (result >= 17 && result <= 18.5 ) {
       System.out.println("Tienes Delgadez leve");
    }
       else if (result >= 18.5 && result <= 25 ) {
       System.out.println("Tienes Peso normal");
    }
       else if (result >= 25 && result <= 30 ) {
       System.out.println("Tienes Sobrepeso");
     }
       else if (result >= 30 && result <= 35 ) {
       System.out.println("Tienes Obesidad leve");
     }
       else if (result >= 35 && result <= 40 ) {
       System.out.println("Tienes Obesidad moderada");
     }
       else if (result >= 40 ) {
       System.out.println("tienes Obesidad mórbida");
     }
       

     input.close();
    }
}
