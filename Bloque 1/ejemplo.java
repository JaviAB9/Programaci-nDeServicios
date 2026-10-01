public class ejemplo {
    
    public static void main(String[] args) {

    ProcessBuilder pb = new ProcessBuilder("notepad.exe");
    Process p = pb.start();             //se crea el proceso

    Thread.sleep(5000);         //cinco segundos
    p.destroy();                       //y se termina
    }
}
