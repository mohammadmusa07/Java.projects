package Problems;
import java.util.*;
public class month {
           public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int months = sc.nextInt();
        switch (months) {
            case 1:System.out.println("jan");
                
                break;
            case 2: System.out.println("feb");
                break;
            case 3: System.out.println("march");
            break;
        
            default:System.out.println("invalid");
                break;
        }
 
    }
    
}
