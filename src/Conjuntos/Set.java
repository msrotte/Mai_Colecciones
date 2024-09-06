package Conjuntos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

    public static void main(String[] args) {
        
        //----HASHSET----
        //Le da un valor único a los elementos (NO HAY DUPLICADOS)
        //El agregar y eliminar, tienen mayor rendimiento que el TreeSet
        //Guarda de forma aleatoria
        
        System.out.println("-----------HASHSET-----------");
        
        System.out.println("**CREACIÓN**");
        
        HashSet<Persona> hashSet = new HashSet();
        
        System.out.println("*AGREGO ELEMENTOS");
        
        hashSet.add(new Persona(1,"Maira", 34));
        hashSet.add(new Persona(2,"Juan", 30));
        hashSet.add(new Persona(3,"Pedro", 26));
        hashSet.add(new Persona(4,"Alma", 22));
        
        System.out.println("*RECORRER Y MOSTRAR");
        
        for (Persona per : hashSet) {
            System.out.println(per.toString());
        }
        
        System.out.println("ELIMINE A JUAN");
        
        
        //----TREESET----
        //Ordena los elementos de forma ascendente
        //El agregar y elimitar son más lentos porque los ordena
        //NO HAY DUPLICADOS
        
        System.out.println("-----------TREESET-----------");
        
        System.out.println("**CREACIÓN**");
        
        TreeSet<String> treeSet = new TreeSet();
        
        System.out.println("*AGREGO ELEMENTOS");
        
        treeSet.add("Maira");
        treeSet.add("Juan");
        treeSet.add("Pedro");
//        treeSet.add(new Persona(1, "Maira", 34));
//        treeSet.add(new Persona(2,"Juan", 30));
//        treeSet.add(new Persona(3,"Pedro", 26));
//        treeSet.add(new Persona(4,"Alma", 22));
        
        System.out.println("*RECORRER Y MOSTRAR");
        
        for (String per : treeSet) {
            
            System.out.println(per);
        }
        
        System.out.println("ELIMINE A JUAN");
        
        //----LIN_KED_HASH_SET----
        // Es una implementación de Set que mantiene el orden de inserción de los elementos. Es un poco más lento 
        //que HashSet en términos de rendimiento, pero permite una iteración más rápida debido a su orden predecible.
        //NO HAY DUPLICADOS
        
        System.out.println("-----------LIN_KED_HASH_SET-----------");
        
        System.out.println("**CREACIÓN**");
        
        LinkedHashSet<Persona> linKed = new LinkedHashSet();
        
        System.out.println("*AGREGO ELEMENTOS");
        
        linKed.add(new Persona(1, "Maira", 34));
        linKed.add(new Persona(2,"Juan", 30));
        linKed.add(new Persona(3,"Pedro", 26));
        linKed.add(new Persona(4,"Alma", 22));
        
        LinkedHashSet<Integer> num = new LinkedHashSet();
        
        num.add(1);
        num.add(20);
        num.add(6);
        num.add(1);
        
        System.out.println("*RECORRER Y MOSTRAR");
        
        for (Persona per : linKed) {
            
            System.out.println(per.toString());
        }
        
        for (Integer inter : num) {
            
            System.out.println(inter);
        }
        
        //ITERATOR
        
        Iterator iterador = linKed.iterator();
        
        System.out.println("Mostar lista con ITERADOR");
        
        while(iterador.hasNext()){
        
            System.out.println(iterador.next() + " ");
        }
        
        System.out.println("ELIMINE A JUAN");
        
        //Convierto el LinKedHashSet a Array List para podor usar el sort()
        
        ArrayList<Integer> numList = new ArrayList(num);
        
        Collections.sort(numList);
        
        Iterator it = numList.iterator();
        
        while(it.hasNext()){
        
            System.out.println(it.next());
        }
        
        System.out.println("Vuelvo a mostrar la LinKedHashSet");
        
        for (Integer inter : num) {
            
            System.out.println(inter);
        }
    }
    
}
