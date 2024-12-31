// Array
public class ArrayExample{
    public static void main(String args[]){
        int[] arr = {10,20,30,40,50};
        for(int i=0; i<arr.length; i++){
            System.out.println("Element at "+ i +" Position is "+arr[i]);
        }
    }
}

// Array using ForEach
public class ArrayExample{
    public static void main(String args[]){
        int[] arr = {10,20,30,40,50};
        for(int i:arr){
            System.out.println(i);
        }
    }
}

// passing array to a method
public class ArrayExample{
    static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        int[] arr = {10,20,30,40,50};
        printArray(arr);
    }
}

// returning array from a method
public class ArrayExample{
    static int[] get(){
        return new int[]{10,20,30,40,50};
    }
    public static void main(String args[]){
        int arr[] = get();
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

// Multidimensional Array
public class Example{
    public static void main(String args[]){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

// Matrix
public class MatrixAddition {
    public static void main(String args[]) {
        int rows = 3, cols = 3;
        int[][] matrix1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] matrix2 = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };
        int[][] sum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum of the matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Matrix Multiplication
public class MatrixMultiplicationExample {

  public static void main(String args[]) {
    int row1, col1, row2, col2;
    Scanner s = new Scanner(System.in);

    // Input dimensions of First Matrix: A
    System.out.print("Enter number of rows in first matrix: ");
    row1 = s.nextInt();

    System.out.print("Enter number of columns in first matrix: ");
    col1 = s.nextInt();

    // Input dimensions of second matrix: B
    System.out.print("Enter number of rows in second matrix: ");
    row2 = s.nextInt();

    System.out.print("Enter number of columns in second matrix: ");
    col2 = s.nextInt();

    // Requirement check for matrix multiplication
    if (col1 != row2) {
      System.out.println("Matrix multiplication is not possible");
      return;
    }

    int a[][] = new int[row1][col1];
    int b[][] = new int[row2][col2];
    int c[][] = new int[row1][col2];

    // Input the values of matrices
    System.out.println("\nEnter values for matrix A : ");
    for (int i = 0; i < row1; i++) {
      for (int j = 0; j < col1; j++) a[i][j] = s.nextInt();
    }
    System.out.println("\nEnter values for matrix B : ");
    for (int i = 0; i < row2; i++) {
      for (int j = 0; j < col2; j++) b[i][j] = s.nextInt();
    }

    // Perform matrix multiplication
    // Using for loop
    System.out.println("\nMatrix multiplication is : ");
    for (int i = 0; i < row1; i++) {   // row1 of matrix A
      for (int j = 0; j < col2; j++) {   // col2 of matrix B.. this loop will run to show the last element (last row)
        // Initialize the element C(i,j) with zero
        c[i][j] = 0;

        // Dot product calculation
        for (int k = 0; k < col1; k++) {
            c[i][j]+=a[i][k]*b[k][j];  }
        
        System.out.print(c[i][j] + " ");
      }
      System.out.println();
    }
  }
}
