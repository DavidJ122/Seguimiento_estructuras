package Collections.Primero;

public class Producto implements Comparable<Producto>{
    String nombre;
    String codigo;

    public Producto(String nombre, String codigo){
        this.nombre=nombre;
        this.codigo=codigo;
    }
    public String getNombre(){
        return nombre;
    }

    public String getCodigo(){
        return codigo;
    }

    @Override
    public int compareTo(Producto o) {
        return this.codigo.compareTo(o.codigo);
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + " Codigo: " + codigo;
    }
}
