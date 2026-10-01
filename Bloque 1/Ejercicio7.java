/*
Repite el ejercicio 4 y cambia la forma de cerrar el programa... con lo ultimo
que hemos dado, podrás cerrarlo de otra forma?
*/

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        try {
            
            System.out.println(" MENU DE INICIO ");
            System.out.println("1. Calculadora ");
            System.out.println("2. Bloc de notas ");
            System.out.println("3. Paint ");
            System.out.print("Elige una opcion: ");

            int opcion = sc.nextInt();

            ProcessBuilder programa = null;
            String nombreProceso = "";

            switch (opcion) {
                case 1:
                    programa = new ProcessBuilder("calc");
                    nombreProceso = "CalculatorApp.exe";
                    break;
                case 2:
                    programa = new ProcessBuilder("notepad");
                    nombreProceso = "notepad.exe";
                    break;
                case 3:
                    programa = new ProcessBuilder("mspaint");
                    nombreProceso = "mspaint.exe";
                    break;
                
                default:
                    System.out.println("Opción incorrecta");
                    return ;
            }

            programa.start();

            System.out.println("Programa ejecutado");
            System.out.println("¿Quieres cerrarlo? (si/no) ");

            String respuesta = sc.next();

            if (respuesta.equalsIgnoreCase("si")) {
                
                ProcessBuilder cerrar = new ProcessBuilder("taskkill", "/F", "/IM", nombreProceso);
                cerrar.start();

                System.out.println("Programa cerrado");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
