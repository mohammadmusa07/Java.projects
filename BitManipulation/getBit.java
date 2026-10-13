package BitManipulation;
import java.util.*;
public class getBit {
         
            int bitMask = 1<<pospublic static void main (String [] args ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER THE NO.");
            int a = sc.nextInt();
            System.out.println("ENTER THE POSITION");
            int pos = sc.nextInt();;
            if ( (bitMask & a) == 0 ){
                System.out.println(" NO WAS 0");
            } else { 
                System.out.println( "NO WAS 1");
            }
    }
}

