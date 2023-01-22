import java.util.*;
public class SwappingNumberWithThirdVariable {
    public static void Swapping(int a , int b){
        int c =a;
        a=b;
        b=c;
        System.out.println("After Swapping "+ a + b);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Swapping(a,b);


    }
}
