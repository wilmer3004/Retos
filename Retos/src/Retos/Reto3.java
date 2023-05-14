package Retos;

import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        // Declarar variables
        int eleccion, suerte;
        // Instanciamos la clase Scanner
        Scanner entrada = new Scanner (System.in);
        // Solicitamos el lado de la cara que desea el usuario eligiendo el numero o la posición del lado de la cara
        System.out.println("Por favor elija que lado de la moneda que desee \n 1. cara \n 2. sello \nElija:");
        // Capturamos el dato
        eleccion = entrada.nextInt();
        // Capturamos en la variable suerte, un numero aleatorio del 1 al 2 que va a salir con el método random y se le define la longitud de números en el random con *2+1
        suerte = (int) (Math.random()*2+1);
        // Imprimimos un mensaje que va a indicar que numero eligió la maquina es decir el random
        System.out.println("La moneda esta girando y finalmente a caído en " + suerte + " por lo tanto");
        // Realizamos una condición switch para evaluar los distintos casos
        switch (eleccion) {
            case 1:
            // Realizamos una condición que va a evaluar en el caso de que se cumpla la condición se gane o si se cumple la otra pierda
            if (suerte == 1) {
                System.out.println("Felicidades usted gano");
            }
            else if (suerte == 2){
                System.out.println("Lo sentimos usted perdió");
            }
                break;
            case 2:
            // Realizamos una condición que va a evaluar en el caso de que se cumpla la condición se gane o si se cumple la otra pierda
            if (suerte == 2) {
                System.out.println("Felicidades usted gano");
            }
            else if (suerte == 1){
                System.out.println("Lo sentimos usted perdió");
            }
                break;
            // En caso de que no se cumpla ningún caso se le va a indicar al usuario que no eligió ni uno ni dos
            default: System.out.println("Usted no eligió 1 o 2");
                break;
        }
        // Limpiamos buffer
        entrada.close();
    }
   
}
