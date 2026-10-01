/*
Desarrolla un programa que te devuelva (solo) la IP de tu ordenador.

Lanzar CMD con comando ipconfig
Java recibe todo, filtra y muestra por consola solo la linea de la IPv4
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        try {
            
            ProcessBuilder proceso = new ProcessBuilder("cmd", "/c", "ipconfig");
            Process p = proceso.start();
            BufferedReader lector = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String linea;

            while ((linea = lector.readLine()) != null) {
                
                if (linea.contains("IPv4")) {
                    String ip = linea.substring(linea.indexOf(":") + 1);
                    System.out.println(ip);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
