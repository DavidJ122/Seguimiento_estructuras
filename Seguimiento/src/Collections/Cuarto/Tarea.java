package Collections.Cuarto;



public class Tarea implements Comparable<Tarea>{
    String nombre;
    int prioridad;
    public Tarea(String nombre, int prioridad){
        this.nombre=nombre;
        this.prioridad=prioridad;
    }

    @Override
    public int compareTo(Tarea o) {
        return Integer.compare(this.prioridad, o.prioridad);
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + " Prioridad: " + prioridad;
    }
}
