package Retos;
import java.util.Scanner;
// Se importa la clase Scanner
public class Reto2 {
    public static void main(String[] args) {
        // Declarar variables 
        String nEnfermera, nBebe, nPadre;
        int mesesBebe;
        double pesoBebe, dosisVacuna=0;
        // Se instancia la clase Scanner
        Scanner entrada = new Scanner(System.in);
        // Se solicitan datos
        System.out.println("Por favor ingrese el nombre de la enfermera");
        // Capturamos el dato solicitado
        nEnfermera = entrada.nextLine();
        // Se solicitan datos
        System.out.println("Por favor ingrese el nombre del padre");
        // Capturamos el dato solicitado
        nPadre = entrada.nextLine();
        // Se solicitan datos
        System.out.println("Por favor ingrese el nombre del bebe");
        // Capturamos el dato solicitado
        nBebe = entrada.nextLine();
        // Se solicitan datos
        System.out.println("Por favor ingrese el peso del bebe");
        // Capturamos el dato solicitado
        pesoBebe = entrada.nextDouble();
        // Se solicitan datos
        System.out.println("Por favor ingrese los meses que tiene el bebe");
        // Capturamos el dato solicitado
        mesesBebe = entrada.nextInt();
        // Se calcula la cantidad de dosis que se le tiene que suministrar al bebe
        dosisVacuna= ((pesoBebe + 10)/(mesesBebe*10))*8;
        // Se imprimen resultados
        System.out.println("La enfermera " + nEnfermera + " atendió al bebe " + nBebe + " con " + mesesBebe + " meses, con un peso de " + pesoBebe + " kg, cuyo padre es " + nPadre + ". Finalmente al bebe se le suministro una dosis de " + dosisVacuna + " de la vacuna." );
        // Se limpia el buffer
        entrada.close();
    }
}
