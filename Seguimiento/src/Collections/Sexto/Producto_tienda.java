package Collections.Sexto;

public class Producto_tienda {
    String codigo;
    String nombre;
    int precio;
    int stock = 0;

    public Producto_tienda(String codigo, String nombre, int precio, int stock){
        this.codigo=codigo;
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
    }
    public String getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public int getPrecio(){
        return precio;
    }
    public int getStock(){
        return stock;
    }
    public void setStock(int stock){
        this.stock=stock;
    }
    public void removeStryck(int cantidad){
        this.stock-=cantidad;
    }
    @Override
    public String toString(){
        return "Codigo: " + codigo + " Nombre: " + nombre + " Precio: " + precio + " Stock: " + stock;
    }
}
