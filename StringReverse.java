import java.util.Scanner;
public class StringReverse{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String name = sc.nextLine();
        String temp = name;
        String reverse = " ";
        int len = name.length();
        for(int i =len-1;i>=0;i--)
        {
            reverse += name.charAt(i);
        }
        System.out.println("The reverse of the string is "+reverse);
    }
}