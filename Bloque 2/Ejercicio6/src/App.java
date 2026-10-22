/*

PROGRAMACIÓN CONCURRENTE PARA MEJORAR LA EFICIENCIA

Cuando tenemos que hacer en programación operaciones matemáticas muy pesadas, una buena estrategia utilizada
a veces es repartir la operación entre varios hilos. Vamos a hacer una simulación de esto para entenderlo mejor
(aunque nuestra cantidad de datos no sea tan grande como para que realmente mejore la eficiencia, pero si es un
ejemplo de como se haría a una mayor escala).

Genera un array de 200.000.000 (200 millones) de posiciones y rellénalo con números enteros aleatorios entre el 0 
y el 100. Ahora, calcula la suma de todos los números enteros aleatorios entre el 0 y el 100. Ahora, calcula la
suma de todos los números del array. Utiliza 'currentTimeMillis()' antes y despues de generar el array, y antes y
después de realizar la suma, para comprobar cuánto tiempo tarda Java en realizar esta operación.

Para agilizar la operación, crea 4 hilos y reparte la operación entre ellos (1/4 del array para cada uno). Cada 
hilo calculará la suma de sus números cuando los 4 hilos hayan terminado, se deberá hacer ña suma de los 4 
resultados. Comprueba también cuanto tiempo se tarda en este caso y compara los resultados.

Tiempo en crear y rellenar el array: 1745ms
Suma total obtenida: 9999931888
Tiempo en realizar la suma: 360ms

*/

import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        long tamaño = 200000000;
        long[] array = new long[200000000];
        Random random = new Random();


        long inicioCreacion = System.currentTimeMillis();

        for (int i = 0; i < tamaño; i++) {
            array[i] = random.nextInt(101);
        }
        long finalCreacion = System.currentTimeMillis();
        

        System.out.println("Tiempo en crear y rellenar el array: " + (finalCreacion - inicioCreacion) + "ms");


        long inicioSuma = System.currentTimeMillis();
        long sumaTotal = 0;

        for (int i = 0; i < tamaño; i++) {
            sumaTotal += array[i];
        }
        long finalSuma = System.currentTimeMillis();

        System.out.println("Suma total obtenida: " + sumaTotal);
        System.out.println("Tiempo en realizar la suma: " + (finalSuma - inicioSuma) + "ms");

    }
}
