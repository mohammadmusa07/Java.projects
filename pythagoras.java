import java.util.*;
public class pythagoras {
            public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int mul1 = a * a;
int mul2 = b * b;
double hyp = Math.sqrt((mul1 ) + (mul2));
System.out.println(hyp);
    }
}
