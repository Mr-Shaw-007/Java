
import java.util.*;

public class GettingInput{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        String s = sc.next();
        sc.next();
        char p = sc.next().charAt(0);
        System.out.println("Integer Input Is "+ a);
        System.out.println("String Input is " + s);
        System.out.println("Character Input is "+ p);


    }

}
