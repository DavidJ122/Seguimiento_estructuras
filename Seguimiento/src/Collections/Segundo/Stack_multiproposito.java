package Collections.Segundo;

import java.util.ArrayDeque;
import java.util.Stack;

public class Stack_multiproposito {
    private ArrayDeque<Object> internal_stack = new ArrayDeque<Object>();

    public String push(Object o){
        if (internal_stack.isEmpty()){
            internal_stack.push(o);
        }
        else {
            if (o.getClass().equals(internal_stack.peek().getClass())){
                internal_stack.push(o);
            }
            else {
                return "No se puede agregar un elemento de tipo " + o.getClass() + " en el stack";
            }
        }
        return "Elemento agregado";
    }

    public Object pop(){
        return internal_stack.pop();
    }

    public Object peek(){
        return internal_stack.peek();
    }
    public boolean isEmpty(){
        return internal_stack.isEmpty();
    }
}
