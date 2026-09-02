package Srings;
import java.util.*;
public class removeCharecters {
    public static void main ( String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ENTER EMAIL ");
        String email  = sc.next();    
        String username = "";
        for ( int i = 0; i < email.length(); i++)
        if ( email.charAt(i) == '@'){
            break;
        
        } else { 
            username = username + email.charAt(i);
        }
        System.out.println("YOUR USERNAME IS ");
            System.out.println(username);
        }
    }

