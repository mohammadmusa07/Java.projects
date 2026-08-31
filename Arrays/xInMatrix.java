package Arrays;
import java.util.Scanner;
public class xInMatrix {
        public static void main( String args []) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" ENTER ROWS ");
        int rows = sc.nextInt();
        System.out.println(" ENETER COLUMNS");
        int col = sc.nextInt();
        System.out.println("ENTER THE 2D ARRAY");
        int numbers [][] = new int [rows][col];
        for ( int i = 0 ; i < rows ; i++ ){
            for ( int j = 0 ; j < col ; j++){
                numbers [i][j] = sc.nextInt();

            }
        }               
                        System.out.println("ENTER X ");
                        int x = sc.nextInt();
                        for ( int i = 0 ; i < rows ; i++ ){
                        for ( int j = 0 ; j < col ; j++){
                        if (numbers [i][j] == x ){
                        System.out.println(i + " , " + j );
                    }
                }
            }
    }
}