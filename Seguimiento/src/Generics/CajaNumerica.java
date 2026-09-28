package Generics;// Generics, Nivel intermedio, ejercicio 1

public class CajaNumerica <T extends Number>{

    private T numero;
    
    public CajaNumerica(T numero) {
        this.numero = numero;
    }



    public T doble(){
        if (numero instanceof Integer){
            return (T) Integer.valueOf(numero.intValue()*2);
        }else if (numero instanceof Double){
            return(T) Double.valueOf(numero.doubleValue()*2);
        }
        return null;
    }

    // Generics, Nivel intermedio, ejercicio 2


    public double sumar (T p1, T p2){
    return p1.doubleValue()+p2.doubleValue();
    }

    // Generics, Nivel avanzado 2
    public static <T extends Runnable & Comparable<T>> int procesar(T objeto, T otroObjeto) {
    objeto.run();

    return objeto.compareTo(otroObjeto);
}



}
