package Functions;
import java.util.*;
public class countNos {
    public static void main( String[] args) {
        int positive = 0, negative = 0 , zeros = 0 ;
        Scanner sc = new Scanner(System.in);
        int a;
        char choice;
        System.out.println("COUNTING NUMBERS PROGRAM");
        System.out.println("ENTER YOUR NUMBER");
        do {a = sc.nextInt();
            if( a > 0){
            
            positive++;
        } else if ( a < 0 ){
            negative++;
        } else {
            zeros++;
        } 
        System.out.println(" DO YOU WANT TO CONTINUE ? Y/N");
         choice = sc.next().charAt(0);
         if ( choice != 'Y' && choice != 'N'){
            System.out.println("INVALID INPUT");
            } else if( choice == 'Y' && choice == 'N') { 
                System.out.println("ENTER AGAIN");
            }
        }
        while ( choice == 'Y');
    
    System.out.println("POSITIVE COUNT = " + positive);
    System.out.println("NEGATIVE COUNT = " + negative);
    System.out.println("ZERO COUNT = " + zeros);


        



            }
        }
