package Collections.Primero;

import java.util.TreeSet;

public class Empresa{
    String nombre;
    TreeSet<Producto> productotreeSet = new TreeSet<>();
    public Empresa(String nombre){
        this.nombre=nombre;
    }

    public void agregarProducto(Producto producto){
        productotreeSet.add(producto);
    }
    public TreeSet<Producto> getProductotreeSet(){
        return productotreeSet;
    }
    public Producto getProductoByCode(String code){
        for (Producto producto : productotreeSet) {
            if(producto.getCodigo().equals(code)){
                return producto;
            }
        }
        return null;
    }


}
