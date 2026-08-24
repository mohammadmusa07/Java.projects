package Functions;
import java.util.*;
public class prime {
    public static void primeNumbers( int n){
        if ( n == 1){
                System.out.println("NEITHER PRIME NOR COMPOSITE");
                return;
                }
                int count = 0;

            for ( int i = 1 ; i <= n ; i++){
            if ( n % i == 0){
                count++;
            }
        }
            if ( count == 2){
                System.out.println("A PRIME NUMBER");
            } else { 
                System.out.println("A COMPOSITE NUMBER");
                return;
            }
                public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
                    System.out.println("ENTER THE NUMBER");

            int n = sc.nextInt();
            primeNumbers(n);
        }
    }
        
    
 
