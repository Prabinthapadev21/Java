//to find the power of the number using recursion
import java.util.Scanner;
public class Power {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of base");
        int base = sc.nextInt();
        System.out.println("Enter the value of power");
        int pover = sc.nextInt();
        Power p = new Power();
        System.out.println("The result is "+p.power(base,pover));
        sc.close();
    }
    public int power(int base, int pover)
    {
        if(pover == 0)
        {
            return 1;
        }
        else {
            return base*power(base,pover-1);
        }
    }
}
