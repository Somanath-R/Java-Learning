
// Exception Handling:
public class ExceptionHandling {
    public static void main(String args[]) {
        try {
            int arr[] = { 1, 2, 3, 4, 5 };
            System.out.println(arr[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds");
        }
    }
}

// custom exception:
class MyException
{
    public static void main(String args[])
    {
        try
        {
            throw new ArithmeticException("This is custom exception");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Caught exception");
            System.out.println(e.getMessage());
        }
    }
}

public class Main{
    public static void main(String[] args){
        try{
            int get=element(new int[]{1,2,3,4,5,6,7,8});
        }
        catch(AdditionalOut e){
            System.out.println("Error message:"+e.getMessage());
        }
        finally{
            System.out.println("this is final block");
        }
    }
    
    static int element(int[] arr) throws AdditionalOut {
        if(arr.length <= 10){
            throw new AdditionalOut("Accessing element out of range");
        }
        return arr[2];
    }
}

//custom exception: new class and constructor is created to handle custom exception 
class AdditionalOut extends Exception{     
    public AdditionalOut (String message){
        super (message);
    }
}

// Multithreading:

class Multithreading extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String args[]) {
        Multithreading obj = new Multithreading();
        obj.start();
    }
}
