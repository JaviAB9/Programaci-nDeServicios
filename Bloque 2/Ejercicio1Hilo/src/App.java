public class App {
    public static void main(String[] args) throws Exception {
        
        int n1;
        int n2;

        n1 = Integer.parseInt(System.console().readLine("Dime un error: "));
        n2 = Integer.parseInt(System.console().readLine("Dime otro numero: "));

        suma s = new suma(n1, n2);
        resta r = new resta(n1, n2);
        multi m = new multi(n1, n2);
    }
}
