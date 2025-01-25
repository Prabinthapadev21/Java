import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Enter the float");
        float f= sc.nextFloat();
        System.out.println("Enter the String");
        String s = sc.next();
        System.out.println("Enter the Boolean");
        Boolean b = sc.nextBoolean();
        System.out.println(num);
        System.out.println(f);
        System.out.println(s);
        System.out.println(b);
    }
}