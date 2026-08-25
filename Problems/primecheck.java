package Problems;
import java.util.*;
public class primecheck {
            public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("ENTER THE NUMBER");
int n = sc.nextInt();
int count = 0;
for(int i = 1; i <= n ;i++){
    if(n % i == 0 )
        count++;
    }
    if( count == 2)
        {System.out.println("A PRIME NUMBER");
} else { 
    System.out.println("NOT A PRIME NUMBER");
}
    }
}


        

