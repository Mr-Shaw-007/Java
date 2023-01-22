import java.util.*;
public class CelciusToFarenhite {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        float celcius;

        System.out.println("Enter The Vale of Celcius You want to get Converted ");
        celcius=sc.nextFloat();
        float farenhite = (celcius * 9)/5 + 32;
        System.out.println("The Farenhite Value is "+ farenhite);

    }
}
