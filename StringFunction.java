import java.util.Scanner;
public class StringFunction {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string1:");
        String s1 = sc.nextLine();
        System.out.println("Enter the string2:");
        String s2 = sc.nextLine();
        if(s1.equals(s2))
        {
            System.out.println("The strings are equal");
        }
        else
        {
            System.out.println("The strings are not equal");
        }
    }
}
