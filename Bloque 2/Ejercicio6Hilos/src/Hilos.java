public class Hilos extends Thread {
    
    private long[] array;
    private int inicio;
    private int fin;
    private long resultado = 0; //Acumular la suma

    public Hilos(long[] array, int inicio, int fin){
        this.array = array;
        this.inicio = inicio;
        this.fin = fin;
    }

    public void run(){
        for (int i = inicio; i < fin; i++) {
            resultado += array[i];
        }
    }

    public long getResultado(){
        return resultado;
    }
}
