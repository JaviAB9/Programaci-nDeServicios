/*

Array rellenando en: 1747ms
Suma total calculada: 10000148388
Tiempo total en los 4 hilos 127ms

*/

import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        long tamaño = 200000000;
        long[] array = new long[200000000];
        Random random = new Random();


        long inicioRelleno = System.currentTimeMillis();
        
        for (int i = 0; i < tamaño; i++) {
            array[i] = random.nextInt(101);
        }

        long finRelleno = System.currentTimeMillis();
        System.out.println("Array rellenando en: " + (finRelleno - inicioRelleno) + "ms");

        int cuatro = 200000000 / 4;

        Hilos hilo1 = new Hilos(array, 0, cuatro);
        Hilos hilo2 = new Hilos(array, cuatro, cuatro * 2);
        Hilos hilo3 = new Hilos(array, cuatro * 2, cuatro * 3);
        Hilos hilo4 = new Hilos(array, cuatro * 3, 200000000);

        long inicioSuma = System.currentTimeMillis();

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

        try {
            
            hilo1.join();
            hilo2.join();
            hilo3.join();
            hilo4.join();

        } catch (InterruptedException e) {
            System.out.println("Error en la ejecución de los hilos: " + e.getMessage());
        }

        long sumaTotal = hilo1.getResultado() + hilo2.getResultado() + hilo3.getResultado() + hilo4.getResultado();

        long finalSuma = System.currentTimeMillis();

        System.out.println("Suma total calculada: " + sumaTotal);
        System.out.println("Tiempo total en los 4 hilos " + (finalSuma - inicioSuma) + "ms");
    }
}
