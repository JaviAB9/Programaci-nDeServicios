public class App {
    public static void main(String[] args) throws Exception {
        
        hilo hilo1 = new hilo(1);
        hilo hilo2 = new hilo(2);
        hilo hilo3 = new hilo(3);


        hilo1.start();
        hilo2.start();
        hilo3.start();


        // metodos a ver 
        // start()
        // join()
        // thread.sleep()
    }
}
