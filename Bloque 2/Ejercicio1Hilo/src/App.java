public class App {
    public static void main(String[] args) throws Exception {
        
        int n1;
        int n2;

        n1 = Integer.parseInt(System.console().readLine("Dime un error: "));
        n2 = Integer.parseInt(System.console().readLine("Dime otro numero: "));

        Suma s = new Suma(n1, n2);
        Resta r = new Resta(n1, n2);
        Multi m = new Multi(n1, n2);
        div d = new div(n1, n2);

        r.start();
        s.start();
        m.start();
        d.start();
    }
}
