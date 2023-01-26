import  java.util.*;
public class FindLargestAmongThree {
    public static void FindLargest(int a, int b, int c){
        if(a>b){
            if(a>c){
                System.out.println("The Largest among three is  "+ a);
            }
        }
        else if(b> a){
            if(b>c){
                System.out.println("The Largest among three is "+ b);
            }
        }
        else{
            System.out.println("The Largest among Three is "+ c);
        }
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b=sc.nextInt();
        int c =sc.nextInt();

        FindLargest(a,b,c);
    }
}
