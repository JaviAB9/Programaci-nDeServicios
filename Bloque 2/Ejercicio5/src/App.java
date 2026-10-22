/*
CARRERA V1.0

Crea una clase llamada 'Jugador', que tome un nombre por parámetro, y que realice un bucle
del 1 al 10 imprimiendo en cada iteración la frase "El jugador *nombre* va por el numero i."

Entre una interación y otra, se debe esperar un tiempo aleatorio entre 1 y 3 segundos.

En el main, crea 5 jugadores y lánzalos al mismo tiempo. Comprueba quién gana la carrera, es
decir, quien imprime primero su número 10.
*/

public class App {

    public static boolean finpartida = false;

    public static void main(String[] args) throws Exception {
        
        Jugador j1 = new Jugador("Javi");
        Jugador j2 = new Jugador("Alberto");
        Jugador j3 = new Jugador("Pablo");
        Jugador j4 = new Jugador("Lizana");
        Jugador j5 = new Jugador("Escobilla");

        j1.start();
        j2.start();
        j3.start();
        j4.start();
        j5.start();
    }
}
