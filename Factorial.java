// to find the factorial of the number using recursion
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("The factorial of the number is "+factorial(num));
        sc.close();
    }
    public static int factorial(int num){
        if(num==0)
        {
            return 1;
        }
        else
        {
            return num*factorial(num-1);
        }
    }
}
