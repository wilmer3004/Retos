package Retos;

import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        int eleccion, suerte;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor elija que lado de la moneda que desee \n 1. cara \n 2. sello \nElija:");
        eleccion = entrada.nextInt();
        suerte = (int) (Math.random()*2+1);
        System.out.println("La maquina a elegido " + suerte + " por lo tanto");
        switch (eleccion) {
            case 1:
            if (suerte == 1) {
                System.out.println("Felicidades usted gano");
            }
            else if (suerte == 2){
                System.out.println("Lo sentimos usted perdió");
            }
                break;
            case 2:
            if (suerte == 2) {
                System.out.println("Felicidades usted gano");
            }
            else if (suerte == 1){
                System.out.println("Lo sentimos usted perdió");
            }
                break;
        
            default: System.out.println("Usted no eligió 1 o 2");
                break;
        }
        entrada.close();
    }
   
}
