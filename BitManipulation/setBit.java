package BitManipulation;
import java.util.*;
public class setBit {
    public static void main (String [] args ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER THE NO.");
            int a = sc.nextInt();
            System.out.println("ENTER THE POSITION");
            int pos = sc.nextInt();
            int bitMask = 1<<pos;
            int newNumber = bitMask | a;
            System.out.println(" THE NEW NUMBER IS ");
            System.out.println(newNumber);
    }
}
 