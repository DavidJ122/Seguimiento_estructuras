//Nivel Avanzado ejercicio 1

public class EntidadPersistente<T extends Number & Comparable<T>> {
    private T valor;

    public EntidadPersistente(T valor) {
        this.valor = valor;
    }

    public void comparar(T p2){
            int resultado = this.valor.compareTo(p2);
            System.out.println("Comparando " + this.valor + " con " + p2);
        
        if (resultado > 0) {
            System.out.println("-> El valor almacenado es MAYOR.");
        } else if (resultado < 0) {
            System.out.println("-> El valor almacenado es MENOR.");
        } else {
            System.out.println("-> Ambos valores son IGUALES.");
        }

    }   

}

      

