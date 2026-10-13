package BitManipulation;
import java.util.*;
public class clearBit {
    public static void main (String [] args ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER THE NO.");
            int a = sc.nextInt();
            System.out.println("ENTER THE POSITION");
            int pos = sc.nextInt();
            int bitMask = 1<<pos;
            int notMask = ~(bitMask);
            int newNumber = notMask & a ;
             System.out.println("NEW NO IS ");
             System.out.println(newNumber);
    }
}
