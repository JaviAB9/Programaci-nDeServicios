public class Cliente extends Thread{
    
    int num = 1;
    String productoID = "";
    String nombreCliente;
    Almacen a;

    public Cliente(String n, Almacen al){
        this.nombreCliente = n;
        this.a = al;
    }

    public void run(){
        while (true) {
            productoID = "Producto " + num + " de " + nombreCliente;
            this.a.insertarProducto(productoID);
            num++;
        }
    }
}
