package Collections.Noveno;

import java.util.Stack;

public class Navegador {
    Stack<Pagina_web> Historial = new Stack<>();

    public void add(Pagina_web pagina){
        this.Historial.push(pagina);
    }
    public void back(){
        this.Historial.pop();

    }

    public String get(){
        return this.Historial.peek().toString();
    }
}
