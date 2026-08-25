package Functions;

import java.util.Scanner;

public class whileStatement {
    public static void infiniteLoop( String name ){
   do { System.out.print(name + " "); 
   }
    while(true);
  
    }
                 public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                String name = sc.next();
                        infiniteLoop(name);
    

}
}