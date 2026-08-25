package Functions;
import java.util.*;
public class greaterNo {
 public static void printGreaterNo( int a , int b){
    if (  a > b ) {
        System.out.println(" THE GREATER NO IS " + a);
    } else{ 
        System.out.println(" THE GREATER NO IS " + b);
    } 
    }
public static void main( String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    printGreaterNo(a, b);
}
 }   

