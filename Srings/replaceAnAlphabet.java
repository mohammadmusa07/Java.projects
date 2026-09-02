package Srings;
import java.util.*;
public class replaceAnAlphabet {
    public static void main (String [] args ){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        for ( int i = 0 ; i < a.length(); i++){
            if ( a.charAt(i) == 'e'  ) {
                result = result + 'i';
            } else {
                result = result + a.charAt(i);
            }
        }   
        System.out.println(result);
    }
}
