package Retos;
import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) {
        String nEnfermera, nBebe, nPadre;
        int mesesBebe;
        double pesoBebe, dosisVacuna=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese el nombre de la enfermera");
        nEnfermera = entrada.nextLine();
        System.out.println("Por favor ingrese el nombre del padre");
        nPadre = entrada.nextLine();
        System.out.println("Por favor ingrese el nombre del bebe");
        nBebe = entrada.nextLine();
        System.out.println("Por favor ingrese el peso del bebe");
        pesoBebe = entrada.nextDouble();
        System.out.println("Por favor ingrese los meses que tiene el bebe");
        mesesBebe = entrada.nextInt();
        dosisVacuna= ((pesoBebe + 10)/(mesesBebe*10))*8;
        System.out.println("La enfermera " + nEnfermera + " atendió al bebe " + nBebe + " con " + mesesBebe + " meses, con un peso de " + pesoBebe + " kg, cuyo padre es " + nPadre + ". Finalmente al bebe se le suministro una dosis de " + dosisVacuna + " de la vacuna." );
        entrada.close();
    }
}
