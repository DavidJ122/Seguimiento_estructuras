package Collections.Tercero;

import java.util.Iterator;
import java.util.LinkedList;

public class Lista_exclusiva {
    LinkedList<Object> lista = new LinkedList<>();

    public String add(Object o){
        if (lista.isEmpty() || !isDuplicated(o)){
            lista.add(o);
            return "Elemento agregado";
        }
        else{
           return "Elemento duplicado";
        }
    }

    public boolean isDuplicated(Object o){
        return lista.contains(o);
    }
    public String print(){
        Iterator<Object> it = lista.iterator();
        StringBuilder str = new StringBuilder();
        str.append("Lista: [");
        while (it.hasNext()){
                str.append(it.next());
                if (it.hasNext()) str.append("|");
        }
        str.append("]");
        return str.toString();
    }
}
