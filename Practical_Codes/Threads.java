--------!! THREAD !!---------

class Threads extends Thread{
     
    public void run(){
        System.out.println("running instance");
    }
    public static void main(String[] args){
        Threads p= new Threads();
        p.start();
    }
}

--------!! RUNNABLE !!---------
class Threads implements Runnable{
     
    public void run(){
        System.out.println("running instance");
    }
    public static void main(String[] args){
        
        Threads p= new Threads();
        Thread t= new Thread(p);
        t.start();
    }
}

--------!!  TRHEAD POOL!!---------

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Threads {
     
    public static void main(String[] args){
        
        ExecutorServices ex = Executors.newFixedThreadPool(2);
        ex.submit(() ->  System.out.println("running instance1"));
        ex.execute(() ->  System.out.println("running instance2"));
    }
    ex.shutdown();
}



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {
    private String taskName;

    WorkerThread(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is executing " + taskName);
        try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
    }
}

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); // 3 threads in pool

        for (int i = 1; i <= 5; i++) {
            Runnable worker = new WorkerThread("Task " + i);
            executor.execute(worker); // Submits task for execution
        }

        executor.shutdown(); // Shuts down after all tasks are executed
    }
}


--------------! SYNCHRONIZATION !----------------
public class Counter {
    private int count = 0;

    public synchronized void increment() {
         count++;
    }

    public int getCount() {
         return count;
    }

    public static void main(String[] args) {
         Counter counter = new Counter();
         Thread t1 = new Thread(() -> {
               for (int i = 0; i < 1000; i++) {
                    counter.increment();
               }
         });
         Thread t2 = new Thread(() -> {
               for (int i = 0; i < 1000; i++) {
                    counter.increment();
               }
         });
         t1.start();
         t2.start();
         try {
               t1.join();
               t2.join();
         } catch (InterruptedException e) {
               e.printStackTrace();
         }
         System.out.println("Count: " + counter.getCount());
    }
}
```
class SharedResource {
synchronized void printNumbers(int n) {
   for (int i = 1; i <= 5; i++) {
       System.out.println(n * i);
       try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
   }
}
}

class MyThread extends Thread {
SharedResource resource;
MyThread(SharedResource resource) {
   this.resource = resource;
}

public void run() {
   resource.printNumbers(5);
}
}

public class SyncExample {
public static void main(String[] args) {
   SharedResource obj = new SharedResource();
   MyThread t1 = new MyThread(obj);
   MyThread t2 = new MyThread(obj);

   t1.start();
   t2.start();
}
}
