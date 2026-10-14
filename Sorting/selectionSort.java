package Sorting;
import java.util.*;
public class selectionSort {
    public static void printArray(int arr[]){
        for ( int i = 0 ; i < arr.length; i++ ){
            System.out.print(arr[i] + " ");
        }
    }
        public static void main (String [] args ){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the size of the array");
            int size = sc.nextInt();
            int arr [] = new int [size];
            for ( int i = 0 ; i < size ; i++){
                arr[i] = sc.nextInt();
            }
            for ( int i = 0 ; i < size -1 ; i++){
                int smallest = i ;
                for ( int j = i + 1 ; j < size  ; j++){
                    if( arr[smallest] > arr[j]){
                        smallest = j ;
                    }
                    int temp = arr[i];
                    arr[i] = arr[smallest] ;
                    arr [smallest] = temp;
                }
            }
            printArray(arr);
                }
            }
        
    
    
    
    

