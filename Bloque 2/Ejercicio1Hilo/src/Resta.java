public class Resta extends Thread {
    
    int numero;
    int numero1;
    int cuenta = numero - numero1;

    public Resta(int numero, int numero1){
        this.numero= numero;
        this.numero1 = numero1;

    }


    @Override 

    public void run(){

        cuenta = numero - numero1;
        System.out.println("el resultado es: " + cuenta);

        try {

            Thread.sleep(1000);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        

    }
}
