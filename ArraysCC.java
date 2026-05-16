
/*import java.util.*;

public class ArrayCC {
    public static void main(String args[]){
        int marks[] = new int [50];
    }
    
}*/



// Array input output

/*import java.util.*;

public class ArrayCC {
    public static void main(String args[]){
int marks[] = new int[100];
Scanner sc = new Scanner(System.in);
//int phy
// phy = sc.nextInt();

marks[0] = sc. nextInt(); //phy
marks[1] = sc. nextInt(); //chem
marks[2] = sc. nextInt(); //math

   System.out.println("phy : " + marks[0]);
    System.out.println("chem : " + marks[1]);
     System.out.println("math : " + marks[2]);


     marks[2] = 100; //update maths marks

     marks[2] = marks[2] + 1; // add one marks in original marks 
     marks[2] = marks[2] - 1; // substract
    
     marks[2] = marks[2] * 1; // multiply
     marks[2] = marks[2] / 1; //devide

     System.out.println("math : " + marks[2]);
    }
}*/
        

// Calculate percentage
/* 
import java.util.*;

public class ArrayCC {
    public static void main(String args[]){
    int marks[] = new int[100];
    Scanner sc = new Scanner(System.in);
     //int phy
     // phy = sc.nextInt();

       marks[0] = sc. nextInt(); //phy
       marks[1] = sc. nextInt(); //chem
       marks[2] = sc. nextInt(); //math

     System.out.println("phy : " + marks[0]);
     System.out.println("chem : " + marks[1]);
     System.out.println("math : " + marks[2]);

     int percentage = (marks[0] + marks[1] + marks[2]) /3;
     System.err.println("percentage = " + percentage + "%");

    }
}
    */


/* 
import java.util.*;
//Linear search
public class ArraysCC{
    public static int linearSearch(int numbers[], int key){ //define function 

        for(int i=0; i<numbers.length; i++ ){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        int index = linearSearch(numbers, key); // by help of liner search we do pass by reference value
        if(index == -1){
            System.out.println("Not found");
        } else {

      

        System.out.println("key is at index");
    }
}
}
*/


import java.util.*;
public class ArraysCC{
    public static int linearSearch(String items[], String key){

    for(String i = 0; i< name.length; i++){
         if(name[i]. equals( key)){
                return i;
              } 
               }
             return -1;
            }
    
    public static void main(String[] args) {
        String name[] = {"dosa", "samosa", "idli", "chole", "icecream", "cone", "cock"};
        String key = "dosa";

        int index = linearSearch(name, key); // by help of liner search we do pass by reference value
       
        if(index == -1){
            System.out.println("Not found");
        } else {

             System.out.println("key is at index");

    }
    }
}

