import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements to the LinkedList
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");

        // Display the LinkedList
        System.out.println("LinkedList: " + list);

        // Remove an element from the LinkedList
        list.remove("Element 2");

        // Display the LinkedList after removal
        System.out.println("LinkedList after removal: " + list);

        // Access an element from the LinkedList
        String element = list.get(1);
        System.out.println("Element at index 1: " + element);
    }
}

// Add an element at the first position
list.addFirst("First Element");
System.out.println("LinkedList after adding first: " + list);

// Add an element at the last position
list.addLast("Last Element");
System.out.println("LinkedList after adding last: " + list);

// Remove the first element
list.removeFirst();
System.out.println("LinkedList after removing first: " + list);

// Remove the last element
list.removeLast();
System.out.println("LinkedList after removing last: " + list);

// Check if the LinkedList contains a specific element
boolean contains = list.contains("Element 1");
System.out.println("LinkedList contains 'Element 1': " + contains);

// Get the first element
String firstElement = list.getFirst();
System.out.println("First element: " + firstElement);

// Get the last element
String lastElement = list.getLast();
System.out.println("Last element: " + lastElement);

// Get the size of the LinkedList
int size = list.size();
System.out.println("Size of LinkedList: " + size);

// Clear the LinkedList
list.clear();
System.out.println("LinkedList after clearing: " + list);

// CRUD OPERATIONS:
// Add elements to the LinkedList
list.add("Element 4");
list.add("Element 5");

// Display the LinkedList
System.out.println("LinkedList after adding new elements: " + list);

// Update an element in the LinkedList
list.set(1, "Updated Element");
System.out.println("LinkedList after updating an element: " + list);

// Read elements from the LinkedList
for (String item : list) {
    System.out.println("Item: " + item);
}

// Delete an element from the LinkedList
list.remove(2);
System.out.println("LinkedList after deleting an element: " + list);