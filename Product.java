//to find the product of the number using recursion
import java.util.Scanner;
public class Product {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("The product is "+product(a,b));
        sc.close();
    }
    public static int product(int a ,int b)
    {
        if(a ==0 || b==0)
        {
            return 0;
        }
        else
        {
            return a+product(a,b-1);
        }
    }
}
