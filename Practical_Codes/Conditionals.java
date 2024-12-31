// if statement:
public class Example{
    public static void main (String args[]){
        int a=100,b=50,c=150;
        if (a>b){
            System.out.println("A is the greatest number");
        }
    }
}

// if - else statement:
public class Example{
    public static void main (String args[]){
        int a=100,b=50,c=150;
        if (a>b){
            System.out.println("A is the greatest number");
        }
        else if (b>c){
            System.out.println("B is the greatest number");
        }
        else{
            System.out.println("C is the greatest number");
        }   
    }
}

// Switch statement:
Switc statement:
public class Example{
public static void main (String args[]){
    int value=5;
    string match="";

    switch(value):
    case 1:
        match="One";
        break;
    case 2:
        match="Two";
        break;
    case 3:
        match="Three";
        break;
    case 4:
        match="Four";
        break;
    case 5:
        match="Five";
        break;
    case 6:
        match="Six";
        break;
    default:
        match="No Match";
        break;
}
System.out.println("Match found: "+match);
}


// Enum Switch statement:
public class Conditionals {
    enum Match {
        ONE, TWO, THREE, FOUR, FIVE, SIX, NO_MATCH
    }

    public static void main(String[] args) {
        int number = 4;
        Match match;

        switch (number) {
            case 1:
                match = Match.ONE;
                break;
            case 2:
                match = Match.TWO;
                break;
            case 3:
                match = Match.THREE;
                break;
            case 4:
                match = Match.FOUR;
                break;
            case 5:
                match = Match.FIVE;
                break;
            case 6:
                match = Match.SIX;
                break;
            default:
                match = Match.NO_MATCH;
                break;
        }

        System.out.println("Match found: " + match);
    }
}