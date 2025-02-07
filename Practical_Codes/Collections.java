/**
 * An ArrayList in Java is a resizable array, which means it can grow and shrink in size dynamically.
 * 
 * List methods:
 * - add(E e): Appends the specified element to the end of this list.
 * - add(int index, E element): Inserts the specified element at the specified position in this list.
 * - remove(int index): Removes the element at the specified position in this list.
 * - remove(Object o): Removes the first occurrence of the specified element from this list, if it is present.
 * - get(int index): Returns the element at the specified position in this list.
 * - set(int index, E element): Replaces the element at the specified position in this list with the specified element.
 * - size(): Returns the number of elements in this list.
 * - isEmpty(): Returns true if this list contains no elements.
 * - contains(Object o): Returns true if this list contains the specified element.
 * - clear(): Removes all of the elements from this list.
 * - indexOf(Object o): Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
 * - lastIndexOf(Object o): Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
 * - toArray(): Returns an array containing all of the elements in this list in proper sequence (from first to last element).
 * - subList(int fromIndex, int toIndex): Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
 */

ArrayList: An ArrayList in Java is a resizable array, which means it can grow and shrink in size dynamically. 

import java.util.ArrayList; 
public class Main{
public static void main(String args[]){
    ArrayList<String> st= new ArrayList<>();
    st.add("Ram");
    st.add("Lakhan");
    st.add("Sita");
    System.out.println(st);   //[Ram, Lakhan, Sita]
    
    st.remove(1);
    System.out.println(st);  // [Ram, Sita]
    
    st.set(3,"rahul"); //error out of bound exception
    st.set(1,"rahul");
     System.out.println(st); 

    int[] makearray=st.toArray();
    for(int i=0;i<makearray.length;i++){
        System.out.println(makearray[i]);
    }
}}

// Updates: Array to list conversion
import java.util.ArrayList;
import java.util.List; 
import java.util.Iterator; 

class Main {
    public static void main(String[] args) {
        int[] numarray = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Array length: " + numarray.length + "\n");
        
        // Correcting ArrayList initialization
        ArrayList<Integer> arlist = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        System.out.println("ArrayList: " + arlist.size()+ "\n");
    
        for(int i:numarray){
        System.out.print(i + " "+ "\n");
        }
       
    //   Array to List:
        List<Integer> arrToList = new ArrayList<>();
        for(int push:numarray){
            arrToList.add(push);
        }
    
      Iterator<Integer> it1 = arrToList.iterator();
        while (it1.hasNext()) {
            System.out.print("Iterator method: " + it1.next()+ "\n");}
    }
}

LinkedList: A LinkedList in Java is a data structure that consists of a sequence of elements, where each element points to the next one.

similar code for the linked list

import java.util.LinkedList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> st = new LinkedList<>();
        st.add("Ram");
        st.add("Lakhan");
        st.add("Sita");
        
        // Using enhanced for loop
        for (String it : st) {
            System.out.println("Total element: " + it);
        }
        
        // Using iterator
        Iterator<String> it1 = st.iterator();
        while (it1.hasNext()) {
            System.out.println("Iterator method: " + it1.next()); // Use next() to get the element
        }
    }
}


/* 
 * 
 */

Stack: LIFO methodolies data structure.

import java.util.Stack;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Ram");
        st.push("Lakhan");
        st.push("Sita");
        
        // Print the initial stack
        System.out.println("Total elements in stack: " + st);
        
        // Pop an element from the stack
        st.pop();
        System.out.println("After popping one element: " + st);
        
        // Using enhanced for loop to display elements
        System.out.println("Using enhanced for loop:");
        for (String it : st) {
            System.out.println(it);
        }
        
        // Peek to see the last element
        System.out.println("Peek to see the last: " + st.peek());
        
        // Using the update method to change an element
        updateElement(st, 0, "Rahul");  // Update the first element
        
        // Display the updated stack
        System.out.println("After update: " + st);
        
        // Using iterator to display elements
        System.out.println("Using iterator:");
        Iterator<String> it1 = st.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
    }
    
    // Method to update the element at a given index in the stack
    public static void updateElement(Stack<String> stack, int index, String newElement) {
        // Convert the stack to a List and update the element
        if (index >= 0 && index < stack.size()) {
            stack.set(index, newElement);
        } else {
            System.out.println("Invalid index.");
        }
    }
}

// Total elements in stack: [Ram, Lakhan, Sita]
// After popping one element: [Ram, Lakhan]
// Using enhanced for loop:
// Ram
// Lakhan
// Peek to see the last: Lakhan
// After update: [Rahul, Lakhan]
// Using iterator:
// Rahul
// Lakhan

QUEUE: FIFO methodolies data structure.

import java.util.LinkedList;
import java.util.Queue; 
import java.util.List;  
import java.util.Iterator; 

class Main {
    /* 
    if data not there, left side give null, right side give error
        offer = add
        poll=remove
        peek=element
    */
    public static void main(String[] args) {
       
        Queue<Integer> arlist = new LinkedList<>();
        arlist.offer(1);
        arlist.offer(2);
        arlist.offer(3);  
        arlist.offer(4);    
        
        for(int i:arlist){
        System.out.print(i + " "+ "\n");
        }
       
       arlist.poll();
        System.out.print(arlist+"\n");
    
      Iterator<Integer> it1 = arlist.iterator();
        while (it1.hasNext()) {
            System.out.print("Iterator method: " + it1.next()+ "\n");}
    }
}

PriorityQueue: A PriorityQueue in Java is a special type of queue that orders its elements 
based on their natural ordering or by a Comparator provided at the time of creation.
    
import java.util.PriorityQueue;
import java.util.Queue; 
import java.util.List;  
import java.util.Iterator; 
import java.util.Comparator;

class Main {
    /* 
    if data not there, left side give null, right side give error
        offer = add
        poll=remove
        peek=element
    */
    public static void main(String[] args) {
       
        Queue<Integer> arlist = new PriorityQueue<>();
        arlist.offer(1);
        arlist.offer(2);
        arlist.offer(3);  
        arlist.offer(4);    
        
        System.out.print(arlist+"\n");
        for(int i:arlist){
        System.out.print(i + " "+ "\n");
        }
       
       arlist.poll();
        System.out.print(arlist+"\n");
    
      Iterator<Integer> it1 = arlist.iterator();
        while (it1.hasNext()) {
            System.out.print("Iterator method: " + it1.next()+ "\n");}
            
            // Reverse printing of the list
         Queue<Integer> arlistrev = new PriorityQueue<>(Comparator.reverseOrder());
         arlistrev.offer(1);
        arlistrev.offer(2);
        arlistrev.offer(3);  
        arlistrev.offer(4); 
        System.out.print("Reverse list printing" + arlistrev);
    }
}

DEQUEUE: A Deque in Java is a double-ended queue, which means it can be used as a queue or a stack.

QUEUE methodolies:
import java.util.ArrayDeque;
import java.util.Queue; 
import java.util.List;  
import java.util.Iterator; 
import java.util.Comparator;

class Main {
    /* 
    if data not there, left side give null, right side give error
        offer = add
        poll=remove
        peek=element
    */
    public static void main(String[] args) {
       
        ArrayDeque<Integer> arlist = new ArrayDeque<>();
        arlist.offer(1);
        arlist.offer(2);
        arlist.offer(3);  
        arlist.offer(4);    
        
        System.out.print(arlist+"\n");
        for(int i:arlist){
        System.out.print(i + " "+ "\n");
        }
       
       arlist.poll();
        System.out.print(arlist+"\n");
    
      Iterator<Integer> it1 = arlist.iterator();
        while (it1.hasNext()) {
            System.out.print("Iterator method: " + it1.next()+ "\n");}

    }
}


STACK methodolies

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Create a new ArrayDeque
        ArrayDeque<Integer> arlistrev = new ArrayDeque<>();
        
        // Add elements to the deque
        arlistrev.offer(1);
        arlistrev.offer(2);
        arlistrev.offer(3);
        arlistrev.offer(4);

        // Create a stack to reverse the order
        Stack<Integer> stack = new Stack<>();
        
        // Push elements from ArrayDeque to Stack
        for (Integer element : arlistrev) {
            stack.push(element);
        }

        // Reverse printing from Stack
        System.out.print("Reverse list printing: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}

// PART 2:

HashSet: A HashSet in Java is a collection that stores unique elements. It does not allow duplicate elements.
 methods available in set: add, remove, contains, size, clear, isEmpty, iterator, toArray

import java.util.HashSet;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        Set<Integer> s= new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(6);
        
        System.out.println(s);
        s.remove(5);
        System.out.println(s);
        
        // Convert the set to an array    
        Integer [] k= new Integer [s.size()];
        k=s.toArray(k);
        for(int i:k){
             System.out.println(i);
        }
    }
}

// Output:
// [1, 2, 3, 4, 5, 6]
// [1, 2, 3, 4, 6]
// 1
// 2
// 3
// 4
// 6

LinkedHashSet: A LinkedHashSet in Java is a collection that stores unique elements. It maintains the insertion order of the elements.
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        Set<Integer> s= new LinkedHashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(6);
        
        System.out.println(s);
        s.remove(5);
        System.out.println(s);
        
        Integer [] k= new Integer [s.size()];
        k=s.toArray(k);
        for(int i:k){
             System.out.println(i);
        }
        
         // Convert the set to an array
        
    }
}

Treeset: A TreeSet in Java is a collection that stores unique elements. It maintains the natural ordering of the elements.

import java.util.TreeSet;
import java.util.HashSet;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        Set<Integer> s= new TreeSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(6);
        
        System.out.println(s);
        s.remove(5);
        System.out.println(s);
        
        Integer [] k= new Integer [s.size()];
        k=s.toArray(k);
        for(int i:k){
             System.out.println(i);
        }
        
         // Convert the set to an array
    }
}

map: A Map in Java is a collection that stores key-value pairs. It does not allow duplicate keys.

