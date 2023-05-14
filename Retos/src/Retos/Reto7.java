package Retos;

import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args) {
        // Declarar variables
        int eleccion, suerte, respuesta, contador = 1;
        double dApostado, dAcumulado=0;
        // Instanciamos la clase Scanner
        Scanner entrada = new Scanner(System.in);
        // Solicitamos si el usuario desea jugar al juego de apuestas
        System.out.println("Quiere jugar a nuestro juego de apuestas \n1. si \n2. no\nElija:");
        // Capturamos la respuesta del usuario
        respuesta = entrada.nextInt();
        // Solicitamos al usuario con cuanto dinero cuenta antes de apostar apostar 
        System.out.println("Por favor ingrese con cuanto dinero cuenta");
        // Capturamos con el dinero que cuenta
        dAcumulado = entrada.nextDouble();
        // Creamos un ciclo while que se ejecute siempre y cuando el usuario quiera volver a jugar y el dinero acumulado sea mayor a 0.0
        while (respuesta == 1 && dAcumulado>0.0) {
            // Indicamos con cuanto dinero cuenta cada vez que pierda o gane dinero
            System.out.println("Usted actualmente cuenta con: "+ dAcumulado);  
            System.out.println("Ingrese el valor de la cantidad de dinero que va apostar según el valor que usted tiene acumulado ");
            // Capturamos la cantidad de dinero que aposto el usuario
            dApostado = entrada.nextInt();
            // Creamos un bucle para que se ejecute el proceso del juego de la moneda siempre y cuando se quiera seguir jugando y el dinero apostado sea mayor a 0
            while (dApostado >0 && respuesta ==1) {
                  // Solicitamos el lado de la cara que desea el usuario eligiendo el numero o la posición del lado de la cara
                System.out.println("Por favor elija que lado de la moneda quiere elegir \n 1. cara \n 2. sello \nElija:");
                // Capturamos el dato
                eleccion = entrada.nextInt();
               // Capturamos en la variable suerte, un numero aleatorio del 1 al 2 que va a salir con el método random y se le define la longitud de números en el random con *2+1
                suerte = (int) (Math.random()*2+1);
                // Imprimimos un mensaje que va a indicar que numero eligió la maquina es decir el random
                System.out.println("La moneda esta girando... y finalmente a caído en " + suerte + " por lo tanto");
                // Realizamos una condición switch para evaluar los distintos casos
                switch (eleccion) {
                    case 1:
                    // Realizamos una condición que va a evaluar en el caso de que se cumpla la condición se gane o si se cumple la otra pierda
                    if (suerte == 1) {
                        System.out.println("Felicidades usted gano");
                        // Si gana se le va a sumar el dinero apostado a el dAcumulado que tenia el usuario
                        dAcumulado = dAcumulado + dApostado;

                    }
                    else if (suerte == 2){
                        System.out.println("Lo sentimos usted perdió");
                        // Si pierde se resta al dAcumulado el dinero apostado
                        dAcumulado = dAcumulado - dApostado;
                    }
                        break;
                    case 2:
                    // Realizamos una condición que va a evaluar en el caso de que se cumpla la condición se gane o si se cumple la otra pierda
                    if (suerte == 2) {
                        System.out.println("Felicidades usted gano");
                        dAcumulado = dAcumulado + dApostado; 
                    }
                    else if (suerte == 1){
                        System.out.println("Lo sentimos usted perdió");
                        dAcumulado = dAcumulado - dApostado;
                    }
                        break;
                     // En caso de que no se cumpla ningún caso se le va a indicar al usuario que no eligió ni uno ni dos
                    default: System.out.println("Usted no eligió 1 o 2");
                        break;
                }
                //Se le asigna a respuesta 2 para que se salga de este ciclo
                respuesta=2;
            }
            // Se le indica al usuario cuantas veces lleva jugadas hasta el momento
            System.out.println("La cantidad de veces que usted ha jugado hasta el momento son de: " + contador);
            // Se le indica la cantidad de dinero que tiene acumulado el usuario
                System.out.println("El dinero que usted ha acumulado hasta el momento es de: " + dAcumulado);
                // Se le pregunta al usuario si desea volver a jugar
                System.out.println("Quiere seguir jugando \n1. si \n2. no\nElija:");
                // Capturamos la respuesta
                respuesta= entrada.nextInt();
                contador =+1;
        }
        //  Mostramos la cantidad de veces jugadas por el usuario con la variable contador
        System.out.println("la cantidad de veces que usted jugo en total fue de: " + contador);
        // Mostramos el dinero acumulado toral del usuario después de haber terminado de jugar
        System.out.println("El dinero que usted acumulo jugando, finalmente fue de: " + dAcumulado);
        // Limpiamos buffer
        entrada.close();
    }
    
}
