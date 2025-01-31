import java.util.Scanner;
public class Switch {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice from 1-2");
        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        System.out.println("Enter a number");
                int num2= sc.nextInt();
        System.out.println("Enter the choice:");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("The addition is "+(num1+num2));
                break;
            case 2:
                System.out.println("The subtraction is "+(num1-num2));
                break;
            default:
                System.out.println("Please enter the correct choice");
                break;
        }
    }
}
