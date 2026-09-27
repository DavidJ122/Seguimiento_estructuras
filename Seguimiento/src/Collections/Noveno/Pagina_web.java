package Collections.Noveno;

public class Pagina_web {
    String nombre;
    String url;
    public Pagina_web(String nombre, String url){
        this.nombre=nombre;
        this.url=url;
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + " url: " + url;
    }
}
