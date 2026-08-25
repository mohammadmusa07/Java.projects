package Functions;
import java.util.*;
public class circumference {
    public static void printCircumference( float r ){
     float circumference = (2 * r * 3.14f );
     System.out.println(circumference);
    }
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        printCircumference(r);


    }
}
