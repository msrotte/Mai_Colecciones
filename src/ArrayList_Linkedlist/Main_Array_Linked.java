package ArrayList_Linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main_Array_Linked {

    public static void main(String[] args) {
        
        //ArrayList: se implementa como un arreglo de tamaño variable. A medida que se agregan más elementos, 
        //su tamaño aumenta dinámicamente. Es el tipo más común.
        //ARRAYLIST
        
        System.out.println("--------ARRAY LIST--------");
        
        System.out.println("*CREACIÓN");
        
        List<Persona> listaArray = new ArrayList<Persona>(); //Declaro el ARRAYLIST
        
        System.out.println("*AGREGO ELEMENTOS");
        
        listaArray.add(new Persona(1, "Maira", 34));
        listaArray.add(new Persona(2, "Juan", 30));
        listaArray.add(new Persona(3, "Pedro", 26));
        listaArray.add(new Persona(4, "Alma", 22));
        
        System.out.println("*RECORRER Y MOSTRAR");
        
        //Mostrar ArrayList
        for (Persona listaArray1 : listaArray) {
            System.out.println(listaArray1.getNombre() + " Index " + listaArray1.getIndex());
        }
        
        //Remove en ArrayList
        System.out.println("ELIMINE A JUAN");
        listaArray.remove(1); //Borro a Juan
        
        
        //Mostrar ArrayList
        for (Persona listaArray1 : listaArray) {
            System.out.println(listaArray1.getNombre() + " Index " + listaArray1.getIndex());
        }
        
        //Declaro el iterador
        
        Iterator iterador = listaArray.iterator();
        
        System.out.println("Mostar lista con ITERADOR");
        
        while(iterador.hasNext()){
            
            System.out.println(iterador.next() + " ");
            
            System.out.println();
        }
        
        //LinkedList: se implementa como una lista de doble enlace. Su rendimiento
        //al agregar y quitar es mejor que Arraylist, pero peor en los métodos set y get.
        //LINKEDLIST
        
        System.out.println("--------LINKEDLIST--------");
        
        System.out.println("*CREACIÓN");
        
        LinkedList<Persona> listaLinked = new LinkedList<Persona>(); //Declaro el LINKEDLIST
        
        System.out.println("*AGREGO ELEMENTOS");
        
        listaLinked.add(new Persona(1, "Maira", 34));
        listaLinked.add(new Persona(2, "Juan", 30));
        listaLinked.add(new Persona(3, "Pedro", 26));
        listaLinked.add(new Persona(4, "Alma", 22));
        
        
         System.out.println("*RECORRER Y MOSTRAR");

        //Mostrar LinkedList
        for (Persona persona : listaLinked) {
            System.out.println(persona.getNombre() + " INDEX " + persona.getIndex());
        }
        
        //Remove en LinkedList (Lista doblemente enlazada)
        //En la LinkedList debo recorrerla, para encontrar el objeto y borrarlo
        
        System.out.println("ELIMINE A JUAN");
        
        String nombreBorrar = "Juan";
        for (Persona persona : listaLinked) {
            
            if(persona.getNombre().equals(nombreBorrar)){
            
                listaLinked.remove(persona);
                break; //Debo cortar la ejecución para que la lista se ordene nuevamente
            }
        }
        
         //Mostrar LinkedList
        for (Persona persona : listaLinked) {
            System.out.println(persona.getNombre() + " INDEX " + persona.getIndex());
        }
        
        
        System.out.println("METODOS EXTRAS");
        
        //METODOS EXTRAS
        
        //Tamaño de la lista - Sirve para ambos
        System.out.println("------------¿Qué tamaño tienen las listas?------------");
        System.out.println("ArrayList: " + listaArray.size());
        System.out.println("LinkedList: " + listaLinked.size());
        
        //Obtener el primer objeto y el último
        System.out.println("------------Primer y último Objeto (Solo para LINKEDLIST)------------");
        System.out.println("Primer objeto: " + listaLinked.getFirst().toString());
        System.out.println("Último objeto: " + listaLinked.getLast().toString());
        
        //Borrar toda la lista
        System.out.println("---------Borrando las listas---------");
        listaArray.clear();
        listaLinked.clear();
        
        //Comprobar si está vacía
        System.out.println("---------¿Está vacía alguna de las listas?--------");
        System.out.println("ArrayList: " + listaArray.isEmpty());
        System.out.println("Linkedlist: " + listaLinked.isEmpty());
        
    }
    
}
