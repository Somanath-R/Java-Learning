import java.util.*;
import java.util.Arrays;

public class Arrays {
    public static void main(String[] args) {
        
        // 1.1. **Introduction**
        // An array is a collection of items stored at contiguous memory locations.
        // The idea is to store multiple items of the same type together.
        // This makes it easier to calculate the position of each element by simply adding an offset to a base value, i.e., the memory location of the first element of the array (generally denoted by the name of the array).
        
        // 1.2. **Declaration**
        int[] arr;
        char[] arr;
        String[] arr;
       
        // 1.3. **Initialization**
        int[] arr = new int[5];
        char[] arr = new char[5];
        String[] arr = new String[5];
        
        // 1.4. **Accessing Elements**
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[0]); // Output: 1
        
        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(arr[1]); // Output: b
        
        String[] arr = {"apple", "banana", "cherry", "date", "elderberry"};
        System.out.println(arr[2]); // Output: cherry
        
        // 1.5. **Traversing an Array**
        import java.util.Arrays; 

        class Main {
        public static void main(String[] args) {
        int[] arr= new int[]{5,7,1,4,7,8,9,3,5,56,6,6};
        for(int i:arr){
            System.out.println(i+" ");}
            System.out.println("After sorting" );
        Arrays.sort(arr);
             for(int i:arr){
            System.out.print( i+" ");
        }
    }}

        // 1.6. **Common Operations**
        
        // // Finding the length of an array
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr.length); // Output: 5
    
        // // Sorting an array
        int[] arr = {5, 2, 8, 7, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // Output: [1, 2, 5, 7, 8]
     
        // // Copying an array
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
                // arr1: The source array.
                // 0: The starting position in the source array.
                // arr2: The destination array.
                // 0: The starting position in the destination array.
                // arr1.length: The number of elements to copy.
        System.out.println(Arrays.toString(arr2)); // Output: [1, 2, 3, 4, 5]
     
        // // Comparing arrays
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.equals(arr1, arr2)); // Output: true
     
        // // Filling an array with a value
        int[] arr = new int[5];
        Arrays.fill(arr, 10);
        System.out.println(Arrays.toString(arr)); // Output: [10, 10, 10, 10, 10]
        // 
        // // Searching for an element in an array
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.binarySearch(arr, 3)); // Output: 2
       

        // 1.7. **Multidimensional Arrays**
        
        // Declaration and initialization
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Accessing elements
        System.out.println(arr[0][0]); // Output: 1
        System.out.println(arr[1][1]); // Output: 5
        System.out.println(arr[2][2]); // Output: 9
        
        // Traversing a multidimensional array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        // 1.8. **Jagged Arrays**
        
        // Declaration and initialization
        int[][] jaggedArr = new int[3][];
        jaggedArr[0] = new int[]{1, 2};
        jaggedArr[1] = new int[]{3, 4, 5};
        jaggedArr[2] = new int[]{6, 7, 8, 9};
        
        // Accessing elements
        System.out.println(jaggedArr[0][1]); // Output: 2
        System.out.println(jaggedArr[1][2]); // Output: 5
        System.out.println(jaggedArr[2][3]); // Output: 9
        
        // Traversing a jagged array
        for (int i = 0; i < jaggedArr.length; i++) {
            for (int j = 0; j < jaggedArr[i].length; j++) {
            System.out.print(jaggedArr[i][j] + " ");
            }
            System.out.println();
        }

// 1.9. **Dynamic Arrays (ArrayList)**
        // Declaration and initialization
        ArrayList<Integer> dynamicArr = new ArrayList<>();
        dynamicArr.add(1);
        dynamicArr.add(2);
        dynamicArr.add(3);
        
        // Accessing elements
        System.out.println(dynamicArr.get(0)); // Output: 1
        System.out.println(dynamicArr.get(1)); // Output: 2
        System.out.println(dynamicArr.get(2)); // Output: 3
        
        // Traversing a dynamic array
        for (int i = 0; i < dynamicArr.size(); i++) {
            System.out.print(dynamicArr.get(i) + " ");
        }
        System.out.println();
        
        // Common operations on dynamic arrays
        // Adding an element
        dynamicArr.add(4);
        System.out.println(dynamicArr); // Output: [1, 2, 3, 4]
        
        // Removing an element
        dynamicArr.remove(2); // Removes the element at index 2
        System.out.println(dynamicArr); // Output: [1, 2, 4]
        
        // Updating an element
        dynamicArr.set(1, 10); // Updates the element at index 1 to 10
        System.out.println(dynamicArr); // Output: [1, 10, 4]
        
        // Checking if an element exists
        System.out.println(dynamicArr.contains(10)); // Output: true
        System.out.println(dynamicArr.contains(3)); // Output: false

















        