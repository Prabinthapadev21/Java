import java.util.Scanner;
public class StringLength {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String name = sc.nextLine();
        System.out.println("The length of the string is "+name.length());
    }
}
