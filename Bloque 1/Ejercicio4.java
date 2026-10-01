/*
Simula un menú de inicio, que pregunte al usuario que programa desea lanzar, mostrándole
una lista de 2 o 3 opciones. En función de la que el usuario elija, el programa lanzará
un software u otro. Una vez lanzado, preguntará por consola si desea cerrarlo. Cuando el
usuario escriba 'si' en consola, Java cerrará el proceso ejecutado.
*/

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        try {
            
            System.out.println(" MENU DE INICIO ");
            System.out.println("1. Calculadora ");
            System.out.println("2. Bloc de notas ");
            System.out.println("3. Paint ");
            System.out.println("Elige una opcion: ");

            int opcion = sc.nextInt();

            ProcessBuilder programa = null;

            switch (opcion) {
                case 1:
                    programa = new ProcessBuilder("calc");
                    break;
                case 2:
                    programa = new ProcessBuilder("notepad");
                    break;
                case 3:
                    programa = new ProcessBuilder("mspaint");
                    break;
                
                default:
                    System.out.println("Opción incorrecta");
                    return ;
            }

            Process proceso = programa.start();

            System.out.println("Programa ejecutado");
            System.out.println("¿Quieres cerrarlo? (si/no) ");

            String respuesta = sc.next();

            if (respuesta.equalsIgnoreCase("si")) {
                proceso.destroy();
                System.out.println("Programa cerrado");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
