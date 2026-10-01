import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        try {
            
            String url = "https://medac.es/";
            String rutaChrome = "\"C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Google Chrome.lnk\"";
            String rutaEdge = "";

            ProcessBuilder chrome = new ProcessBuilder(rutaChrome, url);
            chrome.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
