import java.util.*;
public class marksresult {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a;
do{ System.out.println("1 or 0");
a = sc.nextInt();
if(a == 0){
    System.out.println("program ends");
} else if (a == 1){
    System.out.println("enter marks");
    int b = sc.nextInt();
    if(b >= 90 && b < 101){
        System.out.println("Excellent");
     } else if(b >= 60){ 
            System.out.println("good");
} else if(b > 0){
    System.out.println("bad");
} else {
    System.out.println("invalid");
}
} else { 
    System.out.println("invalid");
    }  
} while (a != 0);
    }
}
    



        
    



    

