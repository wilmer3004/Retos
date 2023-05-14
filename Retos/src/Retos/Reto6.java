package Retos;

import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) {
        // Declaramos variables
        int n;
        double precio, totalCompra = 0;
        // Instanciamos la clase Scanner
        Scanner entrada = new Scanner(System.in);
        // Solicitamos la cantidad de productos que va a ingresar el usuario
        System.out.println("Por favor registre la cantidad de productos que va a comprar");
        // Capturamos la cantidad de productos
        n = entrada.nextInt();
        // Creamos un bucle que se ejecute siempre y cuando la cantidad de productos sea mayor a i que esta inicializada en 1 con una iteración de i + 1
        for (int i = 1; i <= n; i++) {
            // Solicitamos el precio del producto según el numero que lleve la iteración i
            System.out.println("Por favor ingrese el precio del producto #" + i +": ");
            // Capturamos el precio de cada producto
            precio = entrada.nextInt();
            // Calculamos el total de la compra hasta que la condición no se cumpla
            totalCompra = totalCompra + precio; 
        }
        // Mostramos el valor total de la compra final, cuando no se cumpla mas la condición del bucle
        System.out.println("Su compra fue de: " + totalCompra);
        // Limpiamos buffer
        entrada.close();
        }
    }
    
