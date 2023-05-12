package Retos;

import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int eleccion, suerte, respuesta, contador = 1;
        double dApostado, dAcumulado=0;
        System.out.println("Quiere jugar a nuestro juego de apuestas \n1. si \n2. no\nElija:");
        respuesta = entrada.nextInt();
        System.out.println("Por favor ingrese con cuanto dinero cuenta");
        dAcumulado = entrada.nextDouble();
        while (respuesta == 1 && dAcumulado>0.0) {
            System.out.println("Usted actualmente cuenta con: "+ dAcumulado);
            System.out.println("Ingrese el valor de la cantidad de dinero que va apostar según el valor que usted tiene acumulado ");
            dApostado = entrada.nextInt();
            while (dApostado >0 && respuesta ==1) {
                System.out.println("Por favor elija que lado de la moneda quiere elegir \n 1. cara \n 2. sello \nElija:");
                eleccion = entrada.nextInt();
                suerte = (int) (Math.random()*2+1);
                System.out.println("La maquina a elegido " + suerte + " por lo tanto");
                switch (eleccion) {
                    case 1:
                    if (suerte == 1) {
                        System.out.println("Felicidades usted gano");
                        dAcumulado = dAcumulado + dApostado;

                    }
                    else if (suerte == 2){
                        System.out.println("Lo sentimos usted perdió");
                        dAcumulado = dAcumulado - dApostado;
                    }
                        break;
                    case 2:
                    if (suerte == 2) {
                        System.out.println("Felicidades usted gano");
                        dAcumulado = dAcumulado + dApostado; 
                    }
                    else if (suerte == 1){
                        System.out.println("Lo sentimos usted perdió");
                        dAcumulado = dAcumulado - dApostado;
                    }
                        break;
                
                    default: System.out.println("Usted no eligió 1 o 2");
                        break;
                }
                respuesta=2;
            }
            System.out.println("La cantidad de veces que usted ha jugado hasta el momento son de: " + contador);
                System.out.println("El dinero que usted ha acumulado hasta el momento es de: " + dAcumulado);
                System.out.println("Quiere seguir jugando \n1. si \n2. no\nElija:");
                respuesta= entrada.nextInt();
                contador =+1;
        }
        System.out.println("la cantidad de veces que usted jugo en total fue de: " + contador);
        System.out.println("El dinero que usted acumulo jugando, finalmente fue de: " + dAcumulado);
        entrada.close();
    }
    
}
