package Retos;

import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        String mesNacimiento;
        int diaNacimiento;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese el mes en que usted nació: ");
        mesNacimiento = entrada.nextLine();
        System.out.println("Por favor ingrese el dia en que usted nació: ");
        diaNacimiento = entrada.nextInt();
        switch (mesNacimiento.toLowerCase()) {
            case "enero":
                if (diaNacimiento <= 20 && diaNacimiento>0) {
                    System.out.println("Su signo es capricornio");
                    System.out.println("Las características de el son :\nMetódicos, prácticos y decididos, los Capricornio no se detienen cuando tienen un objetivo en mente.  ");
                }
                else if (diaNacimiento > 20 && diaNacimiento<=31){
                    System.out.println("Su signo es Acuario");
                    System.out.println("Las características de el son :\nNo se deje engañar. Este signo de aire no es de los que se atan a ideales arbitrarios.");
                }
                break;
            case "febrero":
                if (diaNacimiento <= 19 && diaNacimiento>0) {
                    System.out.println("Su signo es Acuario");
                    System.out.println("Las características de el son :\nNo se deje engañar. Este signo de aire no es de los que se atan a ideales arbitrarios.");
                }
                else if (diaNacimiento >= 20 && diaNacimiento<=29){
                    System.out.println("Su signo es Picis");
                    System.out.println("Las características de el son :\nPiscis tiende a ver el mundo a través de lentes de sol color de rosa, pero su alma romántica se basa en un profundo sentido de la intuición, la sensibilidad y la empatía que le ayudan a conectar con la gente a un nivel más profundo");
                }
                break;
            case "marzo":
                if (diaNacimiento <= 20 && diaNacimiento>0) {
                    System.out.println("Su signo es Picis");
                    System.out.println("Las características de el son :\nPiscis tiende a ver el mundo a través de lentes de sol color de rosa, pero su alma romántica se basa en un profundo sentido de la intuición, la sensibilidad y la empatía que le ayudan a conectar con la gente a un nivel más profundo");
                }
                else if (diaNacimiento > 20 && diaNacimiento<=31){
                    System.out.println("Su signo es Aries");
                    System.out.println("Las características de el son :\nAries siempre esté dispuesto a lanzarse de cabeza a un desafío. Esta actitud positiva significa que ellos no dejan que los contratiempos de la vida los paren durante mucho tiempo.");
                }
                break;
            case "abril":
                if (diaNacimiento <= 20 && diaNacimiento>0) {
                    System.out.println("Su signo es Aries");
                    System.out.println("Las características de el son :\nAries siempre esté dispuesto a lanzarse de cabeza a un desafío. Esta actitud positiva significa que ellos no dejan que los contratiempos de la vida los paren durante mucho tiempo.");
                }
                else if (diaNacimiento > 20 && diaNacimiento<=30){
                    System.out.println("Su signo es Tauro");
                    System.out.println("Las características de el son :\nComo signo de tierra, el toro de la esfera zodiacal es conocido por mantener los pies muy bien puestos en el suelo, son personas prácticas y responsables.");
                }
                break;
            case "mayo":
                if (diaNacimiento <= 20 && diaNacimiento>0) {
                    System.out.println("Su signo es Tauro");
                    System.out.println("Las características de el son :\nComo signo de tierra, el toro de la esfera zodiacal es conocido por mantener los pies muy bien puestos en el suelo, son personas prácticas y responsables.");
                }
                else if (diaNacimiento > 20 && diaNacimiento<=31){
                    System.out.println("Su signo es Geminis");
                    System.out.println("Las características de el son :\nLas gemelas del zodiaco tienen una refrescante dualidad que les hace atraer a la gente como un imán.Son inquisitivas, pero adaptables, juguetonas, pero sensibles");
                }
                break;   
            case "junio":
                if (diaNacimiento <= 20 && diaNacimiento>0) {
                    System.out.println("Su signo es Geminis");
                    System.out.println("Las características de el son :\nLas gemelas del zodiaco tienen una refrescante dualidad que les hace atraer a la gente como un imán. Inquisitivas, pero adaptables, juguetonas, pero sensibles");
                }
                else if (diaNacimiento > 20 && diaNacimiento<=30){
                    System.out.println("Su signo es Cancer");
                    System.out.println("Las características de el son :\nCon un mundo emocional dictado por la pasión, la calidez y un espíritu afectuoso, un Cáncer es más leal que nadie.");
                }
                break; 
            case "julio":
                if (diaNacimiento <= 22 && diaNacimiento>0) {
                    System.out.println("Su signo es Cancer");
                    System.out.println("Las características de el son :\nCon un mundo emocional dictado por la pasión, la calidez y un espíritu afectuoso, un Cáncer es más leal que nadie.");
                }
                else if (diaNacimiento > 22 && diaNacimiento<=31){
                    System.out.println("Su signo es Leo");
                    System.out.println("Las características de el son :\nExtrovertidos, alegres y teatrales, ¡nadie podría acusar a Leo de sufrir por falta de confianza! Ellos saben lo que quieren en la vida y no tienen reparos en conseguirlo. ");
                }
                break;  
            case "agosto":
                if (diaNacimiento <= 23 && diaNacimiento>0) {
                    System.out.println("Su signo es Leo");
                    System.out.println("Las características de el son :\nExtrovertidos, alegres y teatrales, ¡nadie podría acusar a Leo de sufrir por falta de confianza! Ellos saben lo que quieren en la vida y no tienen reparos en conseguirlo. ");
                }
                else if (diaNacimiento > 23 && diaNacimiento<=31){
                    System.out.println("Su signo es Virgo");
                    System.out.println("Las características de el son :\nSi quieres que algo se haga, llama a cualquiera. Pero si quieres algo bien hecho, llama a un Virgo. Metódicos, meticulosos y detallistas hasta el extremo.");
                }
                break;  
            case "septiembre":
                if (diaNacimiento <= 22 && diaNacimiento>0) {
                    System.out.println("Su signo es Virgo");
                    System.out.println("Las características de el son :\nSi quieres que algo se haga, llama a cualquiera. Pero si quieres algo bien hecho, llama a un Virgo. Metódicos, meticulosos y detallistas hasta el extremo.");
                }
                else if (diaNacimiento > 22 && diaNacimiento<=30){
                    System.out.println("Su signo es Libra");
                    System.out.println("Las características de el son :\nLa armonía y la paz ocupan un lugar destacado en la carta de presentación de tu signo del zodiaco, y con razón. Simbolizado por la balanza, son conocidos por el sentido de la equidad y la justicia.");
                }
                break;   
            case "octubre":
                if (diaNacimiento <= 23 && diaNacimiento>0) {
                    System.out.println("Su signo es Libra");
                    System.out.println("Las características de el son :\nLa armonía y la paz ocupan un lugar destacado en la carta de presentación de tu signo del zodiaco, y con razón. Simbolizado por la balanza, son conocidos por el sentido de la equidad y la justicia");
                }
                else if (diaNacimiento > 23 && diaNacimiento<=31){
                    System.out.println("Su signo es Escorpio");
                    System.out.println("Las características de el son :\nEntre los signos más incomprendidos del zodiaco. Muchos los ven como agresivos y conflictivos, pero en realidad tienen pasión por defender las causas perdidas.");
                }
                break;  
            case "noviembre":
                if (diaNacimiento <= 23 && diaNacimiento>0) {
                    System.out.println("Su signo es Escorpio");
                    System.out.println("Las características de el son :\nEntre los signos más incomprendidos del zodiaco. Muchos los ven como agresivos y conflictivos, pero en realidad tienen pasión por defender las causas perdidas.");
                }
                else if (diaNacimiento > 23 && diaNacimiento<=30){
                    System.out.println("Su signo es Sagitario");
                    System.out.println("Las características de el son :\nComo signo de fuego, tu búsqueda del conocimiento está destinada a llevarte a grandes lugares.");
                }
                break;
            case "diciembre":
                if (diaNacimiento <= 22 && diaNacimiento>0) {
                    System.out.println("Su signo es Sagitario");
                    System.out.println("Las características de el son :\nComo signo de fuego, tu búsqueda del conocimiento está destinada a llevarte a grandes lugares.");
                }
                else if (diaNacimiento > 22 && diaNacimiento<=31){
                    System.out.println("Su signo es Capricornio");
                    System.out.println("Las características de el son :\nMetódicos, prácticos y decididos, los Capricornio no se detienen cuando tienen un objetivo en mente.");
                }
                break;   
                
                
        
            default:System.out.println("Usted ingreso un dato no valido");
                break;
        }
        entrada.close();
    }
}
