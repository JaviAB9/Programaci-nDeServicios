/*
Crea un programa que permita al usuario introducir el nombre de un proceso (por ejemplo, "notepad.exe")
y luego verifique si ese proceso esta en ejecución en el sistema. Debe mostrar un mensaje indicando si
el proceso esta en ejecución o no
*/

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre del proceso: ");
        String nombre = sc.nextLine();

        boolean encontrado = false;

        for (ProcessHandle proceso : ProcessHandle.allProcesses().toList()) {
            
            String comando = proceso.info().command().orElse("");

            if (comando.toLowerCase().endsWith(nombre.toLowerCase())) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("El proceso " + nombre + " esta en ejecución");
        } else {
            System.out.println("El proceso " + nombre + " no está en ejecución");
        }
        sc.close();
    }
}
