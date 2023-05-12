package Retos;

import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        double precio, totalCompra = 0;
        System.out.println("Por favor registre la cantidad de productos que va a comprar");
        n = entrada.nextInt();
        n= n+ 1;
        for (int i = 1; i < n; i++) {
            System.out.println("Por favor ingrese el precio del producto #" + i +": ");
            precio = entrada.nextInt();
            totalCompra = totalCompra + precio; 
        }
        System.out.println("Su compra fue de: " + totalCompra);
            
        entrada.close();
        }
    }
    
