package Collections.Sexto;

import java.util.ArrayList;

public class SortAlphabet implements ProductoSort{
    @Override
    public ArrayList<Producto_tienda> sort(ArrayList<Producto_tienda> productoTiendas) {
        ArrayList<Producto_tienda> productos_ordenados = new ArrayList<>();
        ArrayList<Producto_tienda> productos_sin_ordenar = new ArrayList<>();
        productos_sin_ordenar.addAll(productoTiendas);
        while (!productos_sin_ordenar.isEmpty()) {
            Producto_tienda producto_tienda_actual = productos_sin_ordenar.getFirst();
            for (Producto_tienda productoTienda : productos_sin_ordenar) {
                int x= producto_tienda_actual.getNombre().compareTo(productoTienda.getNombre());
                if (x>0){
                    producto_tienda_actual = productoTienda;
                }
            }
            productos_ordenados.add(producto_tienda_actual);
            productos_sin_ordenar.remove(producto_tienda_actual);
        }
        return productos_ordenados;
    }
}
