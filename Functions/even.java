package Functions;
import java.util.*;
public class even {
    public static void checkEvenNumber( int n){

            
            if ( n % 2 == 0){ System.out.println("EVEN");
            
            } else { 
                System.out.println("ODD");
                return;
            }
        }
                public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
                    System.out.println("ENTER THE NUMBER");
                int n = sc.nextInt();
             checkEvenNumber(n);
        }
    }
        
    
 

    

