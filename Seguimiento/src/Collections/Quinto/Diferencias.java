package Collections.Quinto;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Diferencias {
    HashMap<Integer,String> diferencia_hash = new HashMap<>();
    TreeMap<Integer,String> diferencia_tree = new TreeMap<>();
    LinkedHashMap<Integer,String> diferencia_linked = new LinkedHashMap<>();

    //Hashmap
    void hash_agregardatos(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        Integer x = 0;
        while (!lista.isEmpty()) {
        Integer random = ThreadLocalRandom.current().nextInt(lista.size());
        Integer variable = lista.get(random);
            switch (variable){
                case 1:
                    x = lista.indexOf(1);
                    diferencia_hash.put(0,"Primero");
                    break;
                case 2:
                    x = lista.indexOf(2);
                    diferencia_hash.put(40,"Segundo");
                    break;
                case 3:
                    x =  lista.indexOf(3);
                    diferencia_hash.put(60,"Tercero");
                    break;
                case 4:
                    x = lista.indexOf(4);
                    diferencia_hash.put(100,"Cuarto");
                    break;
            }
        lista.remove((int) x);
        }
    }


    public void hash_imprimir(){
        hash_agregardatos();
        for (Map.Entry<Integer, String> entry : diferencia_hash.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

    }

    void tree_agregardatos(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        Integer x = 0;
        while (!lista.isEmpty()) {
            Integer random = ThreadLocalRandom.current().nextInt(lista.size());
            Integer variable = lista.get(random);
            switch (variable){
                case 1:
                    x = lista.indexOf(1);
                    diferencia_tree.put(0,"Primero");
                    break;
                case 2:
                    x = lista.indexOf(2);
                    diferencia_tree.put(40,"Segundo");
                    break;
                case 3:
                    x =  lista.indexOf(3);
                    diferencia_tree.put(60,"Tercero");
                    break;
                case 4:
                    x = lista.indexOf(4);
                    diferencia_tree.put(100,"Cuarto");
                    break;
            }
            lista.remove((int) x);
        }
    }
    //treemap
    public void tree_imprimir(){
        tree_agregardatos();
        for (Map.Entry<Integer, String> entry : diferencia_tree.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
    }

    void linked_agregardatos(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        Integer x = 0;
        while (!lista.isEmpty()) {
            Integer random = ThreadLocalRandom.current().nextInt(lista.size());
            Integer variable = lista.get(random);
            switch (variable){
                case 1:
                    x = lista.indexOf(1);
                    diferencia_linked.put(0,"Primero");
                    break;
                case 2:
                    x = lista.indexOf(2);
                    diferencia_linked.put(40,"Segundo");
                    break;
                case 3:
                    x =  lista.indexOf(3);
                    diferencia_linked.put(60,"Tercero");
                    break;
                case 4:
                    x = lista.indexOf(4);
                    diferencia_linked.put(100,"Cuarto");
                    break;
            }
            lista.remove((int) x);
        }
    }
    public void linked_imprimir(){
        linked_agregardatos();
        for (Map.Entry<Integer, String> entry : diferencia_linked.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
    }
}
