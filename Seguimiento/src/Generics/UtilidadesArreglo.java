package Generics;

public class UtilidadesArreglo {
// Generics, Nivel básico, ejercicio 4

    public static <T> void intercambiar(T[] arreglo, int indice1, int indice2) {
        // Validación opcional para evitar errores si los índices están fuera de rango
        if (arreglo == null || indice1 < 0 || indice2 < 0 || indice1 >= arreglo.length || indice2 >= arreglo.length) {
            throw new IndexOutOfBoundsException("Índices fuera de rango o arreglo nulo.");
        }

        T temporal = arreglo[indice1];

        arreglo[indice1] = arreglo[indice2];

        arreglo[indice2] = temporal;
    }
}
