package Functions;
import java.util.*;
public class printFactorial {
    public static void factorialfunction( int a ){
        if( a < 0){
            System.out.println("INVALID");
            return;
        }
            int factorial = 1;

 for ( int i = a; i >= 1 ; i--){
    factorial = factorial * i;
 }
 System.out.println(factorial);
 return;
}
 public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            factorialfunction(a);
}
}
