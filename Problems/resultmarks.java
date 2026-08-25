package Problems;
import java.util.*;
public class resultmarks {
        public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a;
do{ System.out.println("0 OR 1");
    a = sc.nextInt();
    if(a == 0){
        System.out.println("end program");
    } else if(a == 1){ System.out.println("ENTER MARKS");
             int b = sc.nextInt();
     if(b >= 90 && b < 101){
                System.out.println("EXCELLENT");
    } else if (b >= 60 && b < 101 ){
        System.out.println("GOOD");
    } else if(b >= 0 && b < 101){System.out.println("BAD");
    }   else  {
    System.out.println("INVALID");
    }
    } else { 
    System.out.println("INVALID");
    }
    } while (a != 0);
        }
    }



            
        
    