import java.util.*;
public class calculator {
       public static void main(String[] args) {
        int a = 10;
        int b = 5;
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        
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
}