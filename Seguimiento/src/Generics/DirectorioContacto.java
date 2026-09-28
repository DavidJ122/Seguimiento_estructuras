import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
//ejercicios enunciados numero 2 incluye classe contacto

public class DirectorioContacto {
    
    // Mantiene una LinkedList de contactos
    private LinkedList<Contacto> contactos;

    // Constructor
    public DirectorioContacto() {
        this.contactos = new LinkedList<>();
    }

    // Método para agregar contactos
    public void agregarContacto(Contacto contacto) {
        this.contactos.add(contacto);
    }

    // ○ Búsqueda de contactos cuyo email termine en un dominio dado, usando SOLO Iterator
    public List<Contacto> buscarPorDominioEmail(String dominio) {
        LinkedList<Contacto> resultados = new LinkedList<>();
        
        // Obtenemos el Iterator de la LinkedList
        Iterator<Contacto> iterador = this.contactos.iterator();
        
        // Recorremos la lista usando únicamente el Iterator (prohibido for-each o for tradicional)
        while (iterador.hasNext()) {
            Contacto c = iterador.next();
            
            // Verificamos si el email termina con el dominio especificado
            if (c.getEmail() != null && c.getEmail().endsWith(dominio)) {
                resultados.add(c);
            }
        }
        
        return resultados;
    }

    // ○ Un método que ordene por teléfono usando un Comparator
    public void ordenarPorTelefono() {
        // Usamos Collections.sort pasando un Comparator personalizado basado en el teléfono
        Collections.sort(this.contactos, new Comparator<Contacto>() {
            @Override
            public int compare(Contacto c1, Contacto c2) {
                return c1.getTelefono().compareTo(c2.getTelefono());
            }
        });
        
        // Alternativa moderna en Java (expresión lambda equivalente):
        // this.contactos.sort(Comparator.comparing(Contacto::getTelefono));
    }

    // Método para mostrar el directorio actual en consola
    public void mostrarDirectorio() {
        Iterator<Contacto> iterador = this.contactos.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}