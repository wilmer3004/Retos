package Retos;

import java.util.Scanner;

public class Reto8 {

    public static void main(String[] args) {
        int eleccion, maquina, respuesta ;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Quiere jugar a piedra papel o tijera \n1. si \n 2. no\nElija:");
        respuesta = entrada.nextInt();
        do {
            System.out.println("Por favor elija alguno de los siguientes datos: \n1. piedra \n2. papel \n3.tijera \nElija: ");
        eleccion = entrada.nextInt();
        maquina = (int) (Math.random()*3+1);

        switch (eleccion) {
            case 1:
            if (maquina == 1) {
                System.out.println("La maquina eligió piedra por lo tanto usted empato");
            }
            else if (maquina == 2){
                System.out.println("La maquina eligió papel por lo tanto lo sentimos usted perdió");
            }
            else if (maquina == 3){
                System.out.println("La maquina eligió tijera por lo tanto felicidades usted gano");
            }
                break;
                case 2:
            if (maquina == 1) {
                System.out.println("La maquina eligió piedra por lo tanto felicidades usted gano");
            }
            else if (maquina == 2){
                System.out.println("La maquina eligió papel por lo tanto usted empato");
            }
            else if (maquina == 3){
                System.out.println("La maquina eligió tijera por lo tanto lo sentimos usted perdió");
            }
                break;
                case 3:
            if (maquina == 1) {
                System.out.println("La maquina eligió piedra por lo tanto lo sentimos usted perdió");
            }
            else if (maquina == 2){
                System.out.println("La maquina eligió papel por lo tanto felicidades usted gano");
            }
            else if (maquina == 3){
                System.out.println("La maquina eligió tijera por lo tanto usted empato");
            }
                break;
        
            default: System.out.println("Usted no eligió 1, 2 o 3");
                break;
            }
            System.out.println("Quiere seguir jugando \n1. si \n2. no \nElija: " );
            respuesta = entrada.nextInt();
            }while (respuesta == 1);
            System.out.println("El juego finalizo");

            
        
        
        entrada.close();
    }
}
 