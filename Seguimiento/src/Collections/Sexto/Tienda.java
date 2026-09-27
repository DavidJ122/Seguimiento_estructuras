package Collections.Sexto;

import java.util.ArrayList;

public class Tienda {
    String nombre;
    ArrayList<Producto_tienda> productoTiendas = new ArrayList<>();

    public Tienda(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void agregarProducto(Producto_tienda productoTienda){
        productoTiendas.add(productoTienda);
    }

    public void removeProducto(Producto_tienda productoTienda){
        productoTiendas.remove(productoTienda);
    }

    public void sort(ProductoSort productoSort){
        this.productoTiendas =  new ArrayList<Producto_tienda>(productoSort.sort(productoTiendas));
    }
    public ArrayList<Producto_tienda> getProductoTiendas(){
        return productoTiendas;
    }
    public Producto_tienda getProductoByCode(String code){
        for (Producto_tienda producto : productoTiendas) {
            if(producto.getCodigo().equals(code)){
                return producto;
            }
        }
        return null;
    }
    public Producto_tienda getProductoByNombre(String nombre){
        for (Producto_tienda producto : productoTiendas) {
            if(producto.getNombre().equals(nombre)){
                return producto;
            }
        }
        return null;
    }
    public String EliminarInventario(String code, int cantidad){
        for (Producto_tienda producto : productoTiendas) {
            if(producto.getCodigo().equals(code)){
                producto.setStock(producto.getStock()-cantidad);
                if (producto.getStock()<=0){
                    productoTiendas.remove(producto);
                    return "Stock agotado del producto: " + producto.nombre;
                }
                return "Producto: " + producto.nombre + " Stock: " + producto.getStock() ;
            }
        }
        return "Producto no encontrado";
    }
}
