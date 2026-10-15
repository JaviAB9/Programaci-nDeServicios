public class hilo extends Thread {
    
    int numero;

    public hilo(int n) {
        this.numero = n;
    }

    @Override

    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("hilo " + this.numero + ":" + i);

            try {
                sleep(1000);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
