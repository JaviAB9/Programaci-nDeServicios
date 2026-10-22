/*

PALABRAS

Crea una clase encargada de recibir una palabra por parámetro e imprimirla 100 veces

Crea 3 hilos con objetos de dicha clase ejecutandose al mismo tiempo (a cada una le pasamos
una palabra distinta)...

... pero asegurate de que por consola se muestra siempre primero que lances, y cuando acabe,
los dos siguientes si sean simultaneos.

*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Hilo p1 = new Hilo("Hola");
        Hilo p2 = new Hilo("Medac");
        Hilo p3 = new Hilo("Davante");

        //El metodo JOIN() obliga a utilizar excepciones

        try {
            
            p1.start();
            p1.join();
            p2.start();
            p3.start();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
