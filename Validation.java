import java.util.Scanner;
public class Validation {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email address:");
        String email = sc.nextLine();
        boolean validEmail = email.contains("@") && email.contains(".com") && email.length()>8;
        boolean guest = email.contains("guest");
        if(validEmail || guest)
        {
            System.out.println("Welcome to the System ");
        }
        else
        {
            System.out.println("Please enter the valid Email");
        }
    }
}
