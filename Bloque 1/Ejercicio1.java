public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        try{
            //Los programas nativos de windows no necesitan ruta

            //Ejecutar la Calculadora de Windows
            ProcessBuilder calculadora = new ProcessBuilder("calc");
            calculadora.start();

            //Esperar un momento para asegurarnos de que la calculadora se abra completamente
            Thread.sleep(2000);

            //Ejecutar el Bloc de notas de Windows
            ProcessBuilder notepad = new ProcessBuilder("notepad");
            notepad.start();

            //Esperar un momento para asegurarnos de que el Bloc de notas se abra completamente
            Thread.sleep(2000);

            //Ejecutar Paint de Windows
            ProcessBuilder paint = new ProcessBuilder("mspaint");
            paint.start();

            //Esperar un momento para asegurarnos de que el Paint se abra completamente
            Thread.sleep(2000);

            //Ejecutar Netbean que es uno externo
            ProcessBuilder netbeans = new ProcessBuilder("C:\\Program Files\\NetBeans-19");
            netbeans.start();
            
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
