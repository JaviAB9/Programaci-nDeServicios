//Esta clase debe ser un monitor
public class Almacen {
    
    private String[] almacen;
    private int contador;

    public Almacen(){
        
        this.almacen = new String[10];
        this.contador = 0;

    }

    //Esto es una sección critica
    public void insertarProducto(String productoID){
        if (this.contador <= 9) {
            this.almacen[this.contador] = productoID;
            this.contador++;
            System.out.println("Se ha añadido el " + productoID);
        }
    }

    //Esto es una sección critíca 
    public void eliminarProducto(){
        if (this.contador > 0) {
            this.contador--;
            System.out.println("Se ha eliminado el " + this.almacen[this.contador]);
            this.almacen[this.contador] = null;
        }
    }
}
