package Problems;
import java.util.*;
public class calculator {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first no");
        int a = sc.nextInt();
                System.out.println("enter second no");

        int b = sc.nextInt();
        int operation = sc.nextInt();
        System.out.println("enter operation");
        
        switch (operation) {
            case 1:System.out.println(a + b);
                
                break;
            case 2 : System.out.println(a - b);
                break;
            case 3 : System.out.println(a * b);
                break;
            case 4 : System.out.println(a / b);
                break;
            case 5 : System.out.println(a % b);
                break;
            default: System.out.println("Invalid Command");
                break;
        }
        // int months = sc.nextInt();
        // switch (months) {
        //     case 1:System.out.println("jan");
                
        //         break;
        //     case 2: System.out.println("feb");
        //         break;
        //     case 3: System.out.println("march");
        //     break;
        
        //     default:System.out.println("invalid");
        //         break;
        }
 
    }
