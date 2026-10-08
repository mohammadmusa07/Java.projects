package Srings;
import java.util.*;
public class builderRemove {
     public static void main (String [] args ) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        for ( int i = 0 ; i < sb.length(); i++){
            if ( sb.charAt(i) == '@' ) {
                sb.delete(i, sb.length());
            }
        }
        System.out.println(sb);
     }
}
