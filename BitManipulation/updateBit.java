package BitManipulation;
import java.util.*;
public class updateBit {
     public static void main (String [] args ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER THE NO.");
            int a = sc.nextInt();
            System.out.println("ENTER THE POSITION");
            int pos = sc.nextInt();
            System.out.println("WHAT DO YOU WANT TO SET IT TO ?");
            int set = sc.nextInt();
            int bitMask = 1<<pos;
            if ( set == 1 ){
                int newNumber = bitMask | a ;
                System.out.println("NEW NO IS ");
                System.out.println(newNumber);
            } else if ( set == 0){
                int notMask = ~(bitMask);
                int newNumber = notMask & a ;
                System.out.println("NEW NO IS ");
                System.out.println(newNumber);
            } else {
                System.out.println("INVALID FOR BINARY NUMBER SYSTEM");
            }
            
}
} 