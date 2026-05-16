/*public class Main {
    public static void main(String args[]) {
        int counter = 1;
        while(counter <= 10){
            System.err.println(counter);
            counter++;
        }
        System.out.println();

    }
}*/


/*import java.util.*;


public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;

        while(counter <= range){
            System.err.println(counter);
            counter++;
        }
        System.out.println();

    } 
        
}

*/

// inverted star pattern
/*public class Main {
   public Main() {
   }

   public static void main(String[] var0) {
    int n = 4;
    for(int line=1; line<=n; line++){
        for(int star=1; star<=n-line+1; star++){
            System.out.print("*");
        }
     System.out.println();
    }

   }
}
*/

/* 
public class Main {
   public Main() {
   }

   public static void main(String[] var0) {
    int n = 4;
    for(int i = 1; i<= n; i++){
        for(int p =1; p<=i; p++){
            System.out.print(p);
            {
                System.out.println();
            }
        }
    }
}
}*/


// Convert Binary to Decimal
/*public class Main {

public static void binToDec(int binNum){
    int myNum = binNum;
    int pow = 0;
    int decNum = 0;

    while(binNum > 0) {
        int lastDigit = binNum % 10;
        decNum = decNum + (lastDigit *(int)Math.pow (2, pow));

        pow++;
        binNum = binNum/10;
    }

    System.out.println("decimal of " + myNum  +" =" + decNum);
}
        

public static void main(String args[]){
    binToDec(101);
}
}*/ 



