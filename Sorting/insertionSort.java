package Sorting;
import java.util.*;
public class insertionSort {
    public class bubbleSort {
    public static void printArray(int arr[]){
        for ( int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main (String [] args ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter size");
            int size = sc.nextInt();
            int arr[] = new int [size];
            for ( int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();

            }
            for ( int i = 1 ; i < size ; i++){
                int current = arr[i];  // unsorted
                int j = i - 1;  // sorted 
                while ( current < arr[j] ){
                    arr [j=1] = arr[j];
                    j--;
                }
                printArray(arr);
            }
        }
    }
}
