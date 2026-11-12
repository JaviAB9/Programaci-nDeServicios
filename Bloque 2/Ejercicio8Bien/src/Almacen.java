//Esta clase debe ser un monitor
public class Almacen {
    
    private String[] almacen;
    private int contador = 0;

    public Almacen(){
        
        this.almacen = new String[10];
        this.contador = 0;

    }

    //Esto es una sección critica
    //MÉTODO - SECCIÓN CRÍTICA
    //Synchronized para que Java no permita a varios hilos
    //Ejecutar este método al mismo tiempo

    public synchronized void insertarProducto(String productoID){
        while (contador >= 10) {    //Si está completo el array
            try {
                wait();     //... te esperas a que alguien (cliente) notifique
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        almacen[contador] = productoID;
        System.out.println("Se ha añadido el " + productoID + " en la posición " + contador);
        contador++;

        //Cuando termina avisa(quiero avisar a los trabajadores)
        notifyAll();

        }

    //Esto es una sección critíca 
    public synchronized void eliminarProducto(){
        while (contador >= 0) {
            try {
                wait();     
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        contador--;
        System.out.println("Se ha eliminado el " + almacen[contador] + " del hueco " + contador);
        almacen[contador] = null;

        notifyAll();
    }

}
