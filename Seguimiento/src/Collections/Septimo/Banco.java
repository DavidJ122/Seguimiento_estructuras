package Collections.Septimo;

import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class Banco {
    String nombre;
    LinkedList<Cliente> clientes_lista = new LinkedList<>();
    public Banco(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void agregarCliente(Cliente cliente){
        clientes_lista.add(cliente);
    }
    public LinkedList<Cliente> getClientes_lista(){
        return clientes_lista;
    }

    void removeCliente(Cliente cliente){
        clientes_lista.remove(cliente);
    }

    public String clienteNext(){
        Cliente cliente = clientes_lista.poll();
        if (cliente == null){
            return "La cola esta vacia";
        }
        return cliente.toString();
    }

    public Cliente addPriority(Cliente cliente){
        clientes_lista.addFirst(cliente);
        return cliente;
    }

    public void burnedData(){
        Cliente cliente = new Cliente("Juan");
        Cliente cliente2 = new Cliente("Maria");
        Cliente cliente3 = new Cliente("Pedro");
        Cliente cliente4 = new Cliente("Ana");

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
                    this.agregarCliente(cliente);
                    break;
                case 2:
                    x = lista.indexOf(2);
                    this.agregarCliente(cliente2);
                    break;
                case 3:
                    x =  lista.indexOf(3);
                    this.agregarCliente(cliente3);
                    break;
                case 4:
                    x = lista.indexOf(4);
                    this.agregarCliente(cliente4);
                    break;
            }
            lista.remove((int) x);
        }
    }

    public void imprimirCola(){
        System.out.println("Nombre: " + this.nombre);
        int i = 0;
        for (Cliente cliente : clientes_lista) {
            i++;
            System.out.println("Numero: " + i + " Nombre: " + cliente);
        }
    }

    public boolean isEmpty(){
        return clientes_lista.isEmpty();
    }

}
