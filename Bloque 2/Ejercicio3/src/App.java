public class App {
    public static void main(String[] args) throws Exception {
        
        Juego j = new Juego();
        Cronometro c = new Cronometro();
        Animo a = new Animo();

        j.start();
        c.start();
        a.start();
        
    }
}
