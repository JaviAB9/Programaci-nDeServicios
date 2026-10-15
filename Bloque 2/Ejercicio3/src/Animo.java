public class Animo extends Thread{
    
    String[] mensajes = {"Animo maquina", "Vamos!", "Ya casi lo tienes"};
    int msj;
    int tiempo;

    public Animo(){
    }

    public void run(){
        for (int i = 0; i < 5; i++) {
            msj = (int)(Math.random() * 4);
            System.out.println(mensajes[msj]);
            tiempo = (int)(2000 + Math.random() * 3000);

            try {
                sleep(tiempo);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
