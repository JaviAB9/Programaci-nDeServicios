public class Hilo extends Thread {
        
    String palabra;

    public Hilo(String palabra){
        this.palabra = palabra;
    }

    public void run(){
        for (int i = 0; i < 100; i++) {
                System.out.println(palabra);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
