import java.util.*;
public class SwappingNumberWithoutThirdVariable {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a, b;
        a= sc.nextInt();
        b=sc.nextInt();
        a =a ^ b;
        b= b^ a;
        a = a^b;
        System.out.println(a +"" +  b);

    }
}
