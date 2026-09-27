package Collections.Octavo;

import java.util.Vector;

public class Notepad {
    StringBuilder notas = new StringBuilder("");
    Vector<String> historial = new Vector<>();
    public void add(String nota){
        this.RH();
        notas = notas.append(nota);
    }

    public String get(){
        return notas.toString();
    }

    public void clear(){
        this.RH();
        notas = new StringBuilder();
    }

    public void eliminar(){
        this.undo();
    }
    public void undo(){
        if (historial.isEmpty()) {
            notas = new StringBuilder();
        }
        else {
            notas = new StringBuilder(historial.firstElement());
            historial.removeElementAt(0);}
    }

    private void RH(){
        historial.add(notas.toString());
    }
}
