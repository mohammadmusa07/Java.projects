package Arrays;
import java.util.*;
public class numberSearch {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num [] = new int [size];

        for ( int i = 0 ; i < size ; i++){
            num [i] = sc.nextInt();
        }
        int x = 5;

        for( int i = 0; i < size; i++){
         if (num [i] == x) { 
            System.out.println(i);
            }
        }
    }
}