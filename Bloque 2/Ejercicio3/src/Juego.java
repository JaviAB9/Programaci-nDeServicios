public class Juego extends Thread{
    
    int numUsuario;
    int numRandom;

    public Juego(){

        this.numRandom = (int)(Math.random() * 101);
    }

    public void run(){

        while (true) {
            numUsuario = Integer.parseInt(System.console().readLine("Introduce un número: "));

            if (numUsuario > numRandom) {
                System.out.println("Busca un numero menor");

            } else if (numUsuario < numRandom) {
                System.out.println("Busca un numero mayor");
            } else {
                System.out.println("Acertastes");
                break;
            }
        }
    }
}
