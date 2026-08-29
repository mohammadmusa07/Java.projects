package Arrays;
import java.util.Scanner;
public class checkOrder {
    public static void main( String args []) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers [] = new int[size];



        for ( int i = 0 ; i < size ; i++){
            numbers [i] = sc.nextInt();
        }
        boolean asscending = true ;
        for ( int i = 1 ; i < size ; i++){
            if ( numbers [i] < numbers [i - 1]){
                asscending = false;
            }
        }
        if (asscending){
            System.out.println("NUMBERS ARE IN ASSENDING ORDER");
        } 
        else { 
            System.out.println(" THE NUMBERS ARE NOT IN ASSENDING ORDER ");
        }
    }
}