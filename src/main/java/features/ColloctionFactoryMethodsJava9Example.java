package main.java.features;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The type Colloction factory methods java 9 example.
 */
public class ColloctionFactoryMethodsJava9Example {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println("ListFactoryMethodExample : #################");
        ListFactoryMethodExample();
        System.out.println("SetFactoryMethodExample : #################");
        SetFactoryMethodExample();
        System.out.println("MapFactoryMethodExample : #################");
        MapFactoryMethodExample();
        System.out.println("MapOfEntriesFactoryMethodExample : #################");
        MapOfEntriesFactoryMethodExample();
    }

    /**
     * List factory method example.
     */
    private static void ListFactoryMethodExample() {
        List<String> list = List.of("Java","JavaFX","Spring","Hibernate","JSP");
        for(String l:list) {
            System.out.println(l);
        }
    }

    /**
     * Set factory method example.
     */
    private static void SetFactoryMethodExample() {
        Set<String> set = Set.of("Java","JavaFX","Spring","Hibernate","JSP");
        for(String l:set) {
            System.out.println(l);
        }
    }

    /**
     * Map factory method example.
     */
    private static void MapFactoryMethodExample() {
        Map<Integer,String> map = Map.of(101,"JavaFX",102,"Hibernate",103,"Spring MVC");
        for(Map.Entry<Integer, String> m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }

    /**
     * Map of entries factory method example.
     */
    private static void MapOfEntriesFactoryMethodExample() {
        // Creating Map Entry
        Map.Entry<Integer, String> e1 = Map.entry(101, "Java");
        Map.Entry<Integer, String> e2 = Map.entry(102, "Spring");
        // Creating Map using map entries
        Map<Integer, String> map = Map.ofEntries(e1,e2);
        // Iterating Map
        for(Map.Entry<Integer, String> m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
