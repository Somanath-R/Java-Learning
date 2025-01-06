import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

/**
 * Collections and Lists in Java
 * 
 * Collections in Java is a framework that provides an architecture to store and manipulate a group of objects.
 * Java Collections can achieve all the operations that you perform on data such as searching, sorting, insertion, manipulation, and deletion.
 * 
 * The Collection interface (java.util.Collection) and Map interface (java.util.Map) are the two main "root" interfaces of Java collection classes.
 * 
 * List is an ordered collection (also known as a sequence). The user of this interface has precise control over where in the list each element is inserted.
 * The user can access elements by their integer index (position in the list), and search for elements in the list.
 * 
 * Commonly used List implementations:
 * - ArrayList
 * - LinkedList
 * - Vector
 * - Stack
 * 
 * CRUD - create - add | read - get | update - set | delete - remove clear
 * 
 * Commonly used methods in List interface:
 * - add(E e): Appends the specified element to the end of this list.
 * - add(int index, E element): Inserts the specified element at the specified position in this list.
 * - get(int index): Returns the element at the specified position in this list.
 * - remove(int index): Removes the element at the specified position in this list.
 * - set(int index, E element): Replaces the element at the specified position in this list with the specified element.
 * - size(): Returns the number of elements in this list.
 * - isEmpty(): Returns true if this list contains no elements.
 * - contains(Object o): Returns true if this list contains the specified element.
 * - clear(): Removes all of the elements from this list.
 * - iterator(): Returns an iterator over the elements in this list in proper sequence.
 * 
 * 
 * Example usage:
 */


public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        Accessing elements
        System.out.println("Element at index 1: " + list.get(1));

        Removing an element
        list.remove(2);

        Replacing an element
        list.set(1, "Blueberry");

        Iterating over the list
        for (String fruit : list) {
            System.out.println(fruit);
        }

        Checking size
        System.out.println("Size of the list: " + list.size());

        Checking if list is empty
        System.out.println("Is the list empty? " + list.isEmpty());

        Checking if list contains an element
        System.out.println("Does the list contain 'Apple'? " + list.contains("Apple"));

        Clearing the list
        list.clear();
        System.out.println("Size of the list after clearing: " + list.size());
    }
}

/**
 * Output:
 * Element at index 1: Banana
 * Apple
 * Blueberry
 * Size of the list: 2
 * Is the list empty? false
 * Does the list contain 'Apple'? true
 * Size of the list after clearing: 0
 */

 * ArrayList:
 /**
 * - ArrayList is a resizable array implementation of the List interface.
 * - It is faster than LinkedList because it uses a dynamic array to store the elements.
 * - It maintains the insertion order of the elements.
 * - It allows duplicate elements.
 * - It is non-synchronized.
 * - It allows random access because it stores the elements in the form of an array.
 * - It is better to use ArrayList when you have to access elements more frequently than you have to manipulate them.
 * - It is not suitable for adding or deleting elements frequently because it requires more time to add or delete elements.
 * - It is better to use ArrayList when you have to search for elements more frequently than you have to insert or delete them.
 * - It is not suitable for multi-threaded applications.
 *
 * Commonly used methods in ArrayList class:
 * - add(E e): Appends the specified element to the end of this list.
 * - add(int index, E element): Inserts the specified element at the specified position in this list.
 * - get(int index): Returns the element at the specified position in this list.
 * - remove(Object o): Removes the first occurrence of the specified element from this list, if it is present.
 * - remove(int index): Removes the element at the specified position in this list.
 * - set(int index, E element): Replaces the element at the specified position in this list with the specified element.
 * - size(): Returns the number of elements in this list.
 * - isEmpty(): Returns true if this list contains no elements.
 * - contains(Object o): Returns true if this list contains the specified element.
 * - clear(): Removes all of the elements from this list.
 * - iterator(): Returns an iterator over the elements in this list in proper sequence.
 */

 * Example usage:

public class ArrayListExample {
    public static void main(String[] args) {
        Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        Accessing elements
        System.out.println("First fruit: " + fruits.get(0));

        Removing an element
        fruits.remove("Banana");

        Replacing an element
        fruits.set(1, "Blueberry");

        Iterating over the ArrayList
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        Checking size
        System.out.println("Size of the ArrayList: " + fruits.size());

        Checking if ArrayList is empty
        System.out.println("Is the ArrayList empty? " + fruits.isEmpty());

        Checking if ArrayList contains an element
        System.out.println("Does the ArrayList contain 'Apple'? " + fruits.contains("Apple"));

        Clearing the ArrayList
        fruits.clear();
        System.out.println("Size of the ArrayList after clearing: " + fruits.size());
    }
}

LinkedList
/**
 * - LinkedList is a doubly-linked list implementation of the List interface.
 * - It is slower than ArrayList because it uses a doubly-linked list to store the elements.
 * - It maintains the insertion order of the elements.
 * - It allows duplicate elements.
 * - It is non-synchronized.
 * - It allows random access because it stores the elements in the form of a doubly-linked list.
 * - It is better to use LinkedList when you have to manipulate elements more frequently than you have to access them.
 * - It is suitable for adding or deleting elements frequently because it requires less time to add or delete elements.
 * - It is better to use LinkedList when you have to insert or delete elements more frequently than you have to search for them.
 * - It is not suitable for multi-threaded applications.
 *
 * Commonly used methods in LinkedList class:
 * - add(E e): Appends the specified element to the end of this list.
 * - add(int index, E element): Inserts the specified element at the specified position in this list.
 * - get(int index): Returns the element at the specified position in this list.
 * - remove(Object o): Removes the first occurrence of the specified element from this list, if it is present.
 * - remove(int index): Removes the element at the specified position in this list.
 * - set(int index, E element): Replaces the element at the specified position in this list with the specified element.
 * - size(): Returns the number of elements in this list.
 * - isEmpty(): Returns true if this list contains no elements.
 * - contains(Object o): Returns true if this list contains the specified element.
 * - clear(): Removes all of the elements from this list.
 * - iterator(): Returns an iterator over the elements in this list in proper sequence.
 */

 * Example usage:
public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> fruits = new LinkedList<>();

        // Adding elements to the LinkedList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Accessing elements
        System.out.println("First fruit: " + fruits.get(0));

        // Removing an element
        fruits.remove("Banana");

        // Replacing an element
        fruits.set(1, "Blueberry");

        // Iterating over the LinkedList
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Checking size
        System.out.println("Size of the LinkedList: " + fruits.size());

        // Checking if LinkedList is empty
        System.out.println("Is the LinkedList empty? " + fruits.isEmpty());

        // Checking if LinkedList contains an element
        System.out.println("Does the LinkedList contain 'Apple'? " + fruits.contains("Apple"));

        // Clearing the LinkedList
        fruits.clear();
        System.out.println("Size of the LinkedList after clearing: " + fruits.size());
    }
}

// hashmap
/**
 * HashMap is a part of the Java collection framework. It stores the data in the form of key-value pairs.
 * It is not synchronized, which means it is not suitable for multi-threaded applications.
 * It allows null values and the null key.
 * It does not maintain the insertion order of the elements.
 * It allows duplicate values but not duplicate keys.
 * It is faster than HashTable because it is not synchronized.
 * It is better to use HashMap when you have to search for elements more frequently than you have have to insert or delete them.
 * It is not suitable for adding or deleting elements frequently because it requires more time to add or delete elements.
 * It is not suitable for multi-threaded applications.
 *
 * Commonly used methods in HashMap class:
 * - put(K key, V value): Associates the specified value with the specified key in this map.
 * - get(Object key): Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
 * - remove(Object key): Removes the mapping for the specified key from this map if present.
 * - containsKey(Object key): Returns true if this map contains a mapping for the specified key.
 * - containsValue(Object value): Returns true if this map maps one or more keys to the specified value.
 * - size(): Returns the number of key-value mappings in this map.
 * - isEmpty(): Returns true if this map contains no key-value mappings.
 * - clear(): Removes all of the mappings from this map.
 * - keySet(): Returns a Set view of the keys contained in this map.
 * - values(): Returns a Collection view of the values contained in this map.
 * - entrySet(): Returns a Set view of the mappings contained in this map.
 */

 * Example usage:

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main{
    public static void main (String args[]){
        HashMap<String,Integer> hm = new HashMap<String,Integer> ();
        hm.put("apple",1);
        hm.put("Ball",2);
        
        for(Map.Entry m: hm.entrySet()){
            System.out.println(m);
        }
            
        }
    }
