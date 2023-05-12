package Retos;

import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        int eleccion, maquina;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor elija que eleccion va a sacar usted: \n1. piedra \n2. papel \n3.tijera \nElija: ");
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
        entrada.close();
    }
    
}
