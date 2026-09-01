package Arrays;
import java.util.*;
public class spiralOrderMatrix {
    public static void main (String [] args ){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int spiral [][]= new int [M][N];


        for ( int i = 0 ; i < M ; i++){
            for (int j = 0 ; j < N ; j++){
                spiral [i][j] = sc.nextInt();
            }
        }
               
    }
}
