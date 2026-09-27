package Collections;

import Collections.Cuarto.Tarea;
import Collections.Noveno.Navegador;
import Collections.Noveno.Pagina_web;
import Collections.Octavo.Notepad;
import Collections.Primero.Empresa;
import Collections.Primero.Producto;
import Collections.Quinto.Diferencias;
import Collections.Segundo.Stack_multiproposito;
import Collections.Septimo.Banco;
import Collections.Septimo.Cliente;
import Collections.Sexto.Producto_tienda;
import Collections.Sexto.SortAlphabet;
import Collections.Sexto.SortPrice;
import Collections.Sexto.Tienda;
import Collections.Tercero.Lista_exclusiva;

import java.util.PriorityQueue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        primer_ejercicio();
        segundo_ejercicio();
        tercer_ejercicio();
        cuarto_ejercicio();
        quinto_ejercicio();
        sexto_ejercicio();
        septimo_ejercicio();
        octavo_ejercicio();
        nueve_ejercicio();



    }
    private static void primer_ejercicio(){
        // Primer Ejercicio
        Empresa etarget = new Empresa("Target");
        Producto producto = new Producto("Mayonesa", "P1");
        Producto producto2 = new Producto("Pan", "P2");
        Producto producto3 = new Producto("Aceite", "P3");
        etarget.agregarProducto(producto);
        etarget.agregarProducto(producto2);
        etarget.agregarProducto(producto3);
        System.out.println(etarget.getProductoByCode("P1"));
        System.out.println(etarget.getProductoByCode("P3"));
    }
    private static void segundo_ejercicio(){
        // Segundo Ejercicio
        Stack_multiproposito stack = new Stack_multiproposito();
        System.out.println(stack.push("Hola"));
        stack.push("Mundo");
        System.out.println(stack.pop());
        System.out.println(stack.push(123));
        System.out.println(stack.peek());
    }
    private static void tercer_ejercicio(){
        Lista_exclusiva lista = new Lista_exclusiva();
        System.out.println(lista.add("Hola"));
        System.out.println(lista.add("Mundo"));
        System.out.println(lista.add("Hola"));
        System.out.println(lista.add(123));
        System.out.println(lista.print());
    }
    private static void cuarto_ejercicio(){
        PriorityQueue<Tarea> tareas = new PriorityQueue<>();
        Tarea tarea1 = new Tarea("Conseguir el arroz",0);
        Tarea tarea2 = new Tarea("Conseguir la olla",1);
        Tarea tarea3 = new Tarea("Agregar una taza de arroz",2);
        Tarea tarea4 = new Tarea("Agregar 2 tazas de agua",3);
        Tarea tarea5 = new Tarea("Cocinar el arroz",4);
        tareas.add(tarea1);
        tareas.add(tarea4);
        tareas.add(tarea2);
        tareas.add(tarea5);
        tareas.add(tarea3);
        System.out.println(tareas.poll());
        System.out.println(tareas.poll());
        System.out.println(tareas.poll());
        System.out.println(tareas.poll());
        System.out.println(tareas.poll());

    }
    private static void quinto_ejercicio(){
        System.out.println("Hashmap: Su diferencia principal es que su orden depende del orden fisico de sus buckets en memoria.");
        System.out.println("Primera iteracion");
        Diferencias diferencias_1 = new Diferencias();
        diferencias_1.hash_imprimir();
        System.out.println("Segunda iteracion");
        Diferencias difrencias_2 = new Diferencias();
        difrencias_2.hash_imprimir();
        System.out.println("Tercera iteracion");
        Diferencias difrencias_3 = new Diferencias();
        difrencias_3.hash_imprimir();
        System.out.println("----------------------------------------");
        System.out.println("Treemap: Su diferencia principal es que su orden depende de las claves segun su naturaleza");
        System.out.println("Primera iteracion");
        Diferencias diferencias_4 = new Diferencias();
        diferencias_4.tree_imprimir();
        System.out.println("Segunda iteracion");
        Diferencias diferencias_5 = new Diferencias();
        diferencias_5.tree_imprimir();
        System.out.println("Tercera iteracion");
        Diferencias diferencias_6 = new Diferencias();
        diferencias_6.tree_imprimir();
        System.out.println("----------------------------------------");
        System.out.println("LinkedHashMap: Su diferencia principal es que su orden depende de la insercion");
        System.out.println("Primera iteracion");
        Diferencias diferencias_7 = new Diferencias();
        diferencias_7.linked_imprimir();
        System.out.println("Segunda iteracion");
        Diferencias diferencias_8 = new Diferencias();
        diferencias_8.linked_imprimir();
        System.out.println("Tercera iteracion");
        Diferencias diferencias_9 = new Diferencias();
        diferencias_9.linked_imprimir();
        System.out.println("----------------------------------------");



    }
    private static void sexto_ejercicio(){
        Tienda tienda = new Tienda("Farmatodo");
        Producto_tienda producto3 = new Producto_tienda("C", "Divulproato",500,20);
        Producto_tienda producto1 = new Producto_tienda("A", "Acetaminofen",1000,10);
        Producto_tienda producto4 = new Producto_tienda("D", "Estradiol",2000,6);
        Producto_tienda producto2 = new Producto_tienda("B", "Clonazeman",1500,9);
        tienda.agregarProducto(producto1);
        tienda.agregarProducto(producto2);
        tienda.agregarProducto(producto3);
        tienda.agregarProducto(producto4);
        System.out.println("Sin sortear y como se inserto:");
        System.out.println(tienda.getProductoTiendas());
        System.out.println("----------------------------------------");
        System.out.println("Ordenado por precio:");
        tienda.sort(new SortPrice());
        System.out.println(tienda.getProductoTiendas());
        System.out.println("----------------------------------------");
        System.out.println("Ordenado por nombre:");
        tienda.sort(new SortAlphabet());
        System.out.println(tienda.getProductoTiendas());
        System.out.println("----------------------------------------");
        System.out.println("Producto por codigo:");
        System.out.println(tienda.getProductoByCode("A"));
        System.out.println("----------------------------------------");
        System.out.println(tienda.EliminarInventario("A",2));
        System.out.println(tienda.getProductoTiendas());
        System.out.println("----------------------------------------");
        System.out.println(tienda.EliminarInventario("B",8));
        System.out.println(tienda.getProductoTiendas());
        System.out.println("----------------------------------------");
        System.out.println(tienda.EliminarInventario("C",20));
        System.out.println(tienda.getProductoTiendas());



    }
    private static void septimo_ejercicio(){
        Banco banco = new Banco("Santander");
        banco.burnedData();
        banco.imprimirCola();
        int i=0;
        while (!banco.isEmpty()) {
            i++;
            if (i == 3) {
                Cliente cliente = new Cliente("Jefe");
                banco.addPriority(cliente);
                System.out.println("----------------------------------------");
                System.out.println("----------------------------------------");
                System.out.println("Cliente agregado con prioridad");
                System.out.println("----------------------------------------");

            }

            System.out.println("----------------------------------------");
            System.out.println("El siguiente cliente es: " + banco.clienteNext());
            banco.imprimirCola();
        }
        System.out.println(banco.clienteNext());


    }
    private static void octavo_ejercicio(){
        System.out.println("--------------------------------------");
        Notepad notepad = new Notepad();
        notepad.add("Hola");
        notepad.add(" ");
        notepad.add("Mundo");
        System.out.println(notepad.get());
        notepad.undo();
        System.out.println(notepad.get());
        notepad.undo();
        notepad.undo();
        System.out.println(notepad.get());

    }
    private static void nueve_ejercicio(){
        System.out.println("--------------------------------------");
        Navegador firefox = new Navegador();
        Pagina_web pagina1 = new Pagina_web("Google","Google.com");
        Pagina_web pagina2 = new Pagina_web("Facebook","Facebook.com");
        Pagina_web pagina3 = new Pagina_web("Youtube","Youtube.com");
        firefox.add(pagina1);
        firefox.add(pagina2);
        firefox.add(pagina3);
        System.out.println(firefox.get());
        firefox.back();
        System.out.println(firefox.get());
        firefox.back();
        System.out.println(firefox.get());
        firefox.add(pagina3);
        System.out.println(firefox.get());
    }
}