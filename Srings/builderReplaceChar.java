package Srings;
import java.util.*;
public class builderReplaceChar {
    public static void main (String [] args ) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        for ( int i = 1 ; i < sb.length(); i++){
            if ( sb.charAt(i) ==  'e'){
            sb.setCharAt(i, 'i');
        }
}
System.out.println(sb);
}
}