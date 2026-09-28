import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//ejercicios enunciados numero 1
public class InventarioCaja <T extends Comparable<T>>{
    private ArrayList<T>elementos;

    public InventarioCaja(ArrayList<T>elementos){
        this.elementos = elementos;
    }

    public void agregarElemento(T elementoT){
        this.elementos.add(elementoT);
    }
    public List<T> filtrarMayoresQue(T umbral) {
        ArrayList<T> listaFiltrada = new ArrayList<>();
        
        Iterator<T> iterador = this.elementos.iterator();
        
        while (iterador.hasNext()) {
            T elementoActual = iterador.next();
            
            if (elementoActual.compareTo(umbral) > 0) {
                listaFiltrada.add(elementoActual);
            }
        }
        
        return listaFiltrada;
    }


}
    