/*
Desarrolla un programa capaz de guardar la lista de procesos en ejecución en tu ordenador
en un '.txt'. Para ello, en lugar de utilizar el CMD, utiliza PowerShell
*/

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio8 {
    public static void main(String[] args) {
        
        try {
            //Ejecutar PowerShell para obtener la lista de procesos
            ProcessBuilder pb = new ProcessBuilder("powershell.exe", "/c", "Get-Procces");
            Process p = pb.start();

            //Leer la salida del proceso
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String linea;

            //Crear el archivo de texto
            String ruta = "ProcesosEnEjecucion.txt";
            FileWriter writer = new FileWriter(ruta, false);

            while ((linea = reader.readLine()) != null) {
                //Guardar cada linea en el archivo de texto
                System.out.println(linea);
                writer.write(linea + "\n");
            }

            //Cerrar el archivo después de haber terminado de escribir
            reader.close();
            writer.close();

            //Esperar a que el proceso termine
            p.waitFor();
            System.out.println("Lista de procesos guardada");

        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("Otro error");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en ficheros/directorio");
        }
    }
}
