package Retos;

import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        // Declarar variables
        int eleccion, maquina;
        // Instanciamos la clase Scanner
        Scanner entrada = new Scanner (System.in);
        // Solicitamos al usuario que desea elegir 1. piedra 2. papel 3.tijera 
        System.out.println("Por favor elija que eleccion va a sacar usted: \n1. piedra \n2. papel \n3.tijera \nElija: ");
        // Capturamos el valor digitado
        eleccion = entrada.nextInt();
        // Capturamos en la variable maquina, un numero aleatorio del 1 al 3 que va a salir con el método random y se le define la longitud de números en el random con *3+1
        maquina = (int) (Math.random()*3+1);
        // Creamos una condicional switch
        switch (eleccion) {
            // Evaluamos en el caso 1
            case 1:
            // Creamos una condición dentro del caso para que evalué las 3 posibles elecciones que puede realizar la maquina y dependiendo de eso le decimos al usuario si empato gano o perdió
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
            // Evaluamos en el caso 2
                case 2:
            // Creamos una condición dentro del caso para que evalué las 3 posibles elecciones que puede realizar la maquina y dependiendo de eso le decimos al usuario si empato gano o perdió
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
            // Evaluamos en el caso 3  
                case 3:
            // Creamos una condición dentro del caso para que evalué las 3 posibles elecciones que puede realizar la maquina y dependiendo de eso le decimos al usuario si empato gano o perdió
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
        // En caso de que no se cumpla ningún caso se le va a indicar al usuario que no eligió ni 1 ni 2 ni 3
            default: System.out.println("Usted no eligió 1, 2 o 3");
                break;
        }
        // Limpiamos buffer
        entrada.close();
    }
    
}
