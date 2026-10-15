public class Cronometro extends Thread{
    
    int tiempo;

    public Cronometro(){
        this.tiempo = 30;
    }

    public void run(){
        for (int i = tiempo; i >= 0; i--) {
            System.out.println("Te quedan " + i + " segundos");
        
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }
}
