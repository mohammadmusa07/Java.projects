package Arrays;
import java.util.*;
public class transpose {
    public static void main ( String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ENTER M ");
        int M = sc.nextInt();
        System.out.println("ENTER N ");
        int N = sc.nextInt();
        int matrix [][] = new int [M][N];
        System.out.println("ENTER THE MATRIX");

        for ( int i = 0 ; i < M ; i++){
            for ( int j = 0 ; j < N; j++){
                matrix [i][j] = sc.nextInt();
            }
        }
        for ( int i = 0 ; i < N ; i++){
            for ( int j = 0 ; j < M; j++){
                 
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}