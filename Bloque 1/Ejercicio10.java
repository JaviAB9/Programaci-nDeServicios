/*
Desarrolla un programa que monitorice constantemente un directorio en busca
de nuevos archivos. Cuando se detecte un archivo nuevo en el directorio, se imprime
por consola (si no, se imprime "nada nuevo")
*/

public class Ejercicio10 {
    public static void main(String[] args) {
        
        try {
            //Directorio a monitorear
            String directorio = "C:\\";

            //Guardar el listado inicial y quedarse con cuántos archivos hay
            int lineasAntes = guardarListado(directorio, "listaficheros.txt");
            System.out.println("Vigilando " + directorio + " se para con Ctrl+C o con el botón de detener");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static int guardarListado(String directorio, String fichero)
}
