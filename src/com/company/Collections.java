package com.company;

import java.util.*;

public class Collections {

    // Set
    void set(){
        // collections receive Wrapper classes instead of primitive data types
        // Hashset -> for unique values
        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("Rasa");
        names.add("David");
        names.add("John");

        for (String name: names){
            System.out.println(name);
        }
    }

    void setInOrder(){
        Set<String> names = new TreeSet<>(); //TreeSet() sets the set in ascending order
        names.add("John");
        names.add("Rasa");
        names.add("David");
        names.add("John");

        for (String name: names){
            System.out.println(name);
        }
    }

    // List
    void list(){
        List<Float> transfers = new ArrayList<>();
        transfers.add(120.0f);
        transfers.add(500.0f);
        transfers.add(120.0f);
        transfers.add(5000.0f);

        for (Float transfer: transfers){
            System.out.println(transfer);
        }
    }

    // Queue
    void queue(){
        Queue<String> pokemons = new LinkedList<>();
        pokemons.offer("Pikachu");
        pokemons.offer("David");
        pokemons.offer("Charmander");

        // .poll method: to remove element from the queue
        // .peek method: to view the first element on queue

        System.out.println(pokemons.poll());
        System.out.println(pokemons.size());
        System.out.println(pokemons.peek());
    }

    //Map
    void map(){
        //Creating an object of the Map
        Map<String, Float> employees = new HashMap<>();

        // adding Item to the Map
        employees.put("John Dool", 3000.0f);
        employees.put("Charlie Chaplin", 4500.0f);
        employees.put("David David", 5000.0f);

        // removing an element from the map with the given key
        employees.remove("John Dool");

        // retrieve value of a key in Map with .get(<key>)
        System.out.println(employees.get("David David"));

        for (String key: employees.keySet()){
            System.out.println("Employers: " + key);
        }

        // .values() we use to get values
        for (float value: employees.values()){
            System.out.println("Payment " + value);
        }

        for (Map.Entry<String, Float> pair: employees.entrySet()){
            System.out.println("Employee-Payment " + pair);
        }
    }
}
