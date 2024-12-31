
// for
public class Example{
    public static void main (String args[]){
        for (int i=0;i<5;i++){
            System.out.println(i+"th times is"+" Hello World!");
        }
    }
}

// while  
public class Example{
    public static void main (String args[]){
        int i=0;
        while(i<5){
            System.out.println(i+"th times is"+" Hello World!");
            i++;
        }
    }
}

// do-while 
public class Example{
    public static void main (String args[]){
        int i=0;
        do{
            System.out.println(i+"th times is"+" Hello World!");
            i++;
        }while(i<5);
    }
}

// continue 
public class Example{
    public static void main (String args[]){
        for (int i=0;i<5;i++){
            if (i==3){
                continue;
            }
            System.out.println(i+"th times is"+" Hello World!");
        }
    }
}

// break
public class Example{
    public static void main (String args[]){
        for (int i=0;i<5;i++){
            if (i==3){
                break;
            }
            System.out.println(i+"th times is"+" Hello World!");
        }
    }
}

