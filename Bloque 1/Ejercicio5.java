import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.channels.Pipe.SourceChannel;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        try {
            //Ejemplo solo valido para CMD de windows
            String comando = "ping medac.es";

            //Lanzar CMD y crear un proceso
            ProcessBuilder cmd = new ProcessBuilder("CMD", "/c", comando);
            Process proceso = cmd.start();

            //Capturar la salida del proceso
            BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            String linea;

            //Leer y mostrar los resultado del comando linea a linea
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }

            //Esperar a que el proceso termine y mostrar codigo de un proceso
            int exitCode = proceso.waitFor();
            System.out.println("Comando terminado con código de salida");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
