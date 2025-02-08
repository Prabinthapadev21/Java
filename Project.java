import java.util.Scanner;
public class Project {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("performing the different operations in java");
        System.out.println("I request to choose the different operation for the following");
        System.out.println("1.Fibonacci\n2.Factorial\n3.Reverse\n4.Palindrome\n5.Armstrong\n6.Exit");
        System.out.println("Enter your choice");
        choice = sc.nextInt();
        while(true)
        {
            switch(choice)
            {
                case 1:
                    System.out.println("Enter number for nth fibonacci series");
                    int num=sc.nextInt();
                    System.out.println("The fibonacci numbers are");
                    for(int i =0;i<num;i++)
                    {
                        System.out.println(fibonacci(i));
                    }
                    break;
                case 2:
                    System.out.println("Enter the number for calculating the factorial");
                    int num1=sc.nextInt();
                    System.out.println("The factorial of the number is "+fact(num1));
                    break;
                case 3:
                    System.out.println("Enter the number for performing reverse operation");
                    int num2= sc.nextInt();
                    System.out.println("The reverse of the number is "+reverse(num2));
                    break;
                case 4:
                    System.out.println("Enter the number for performing the palindrome operation");
                    int num3 = sc.nextInt();
                    if(num3==palindrome(num3))
                    {
                        System.out.println("The given number is a palindrome number");
                    }
                    else {
                        System.out.println("The given number is not a palindrome number");
                    }
                    break;
                case 5:
                    System.out.println("Enter the number for performing the armstrong operation");
                    int num4 = sc.nextInt();
                    if(num4==armstrong(num4))
                    {
                        System.out.println("The number is an armstrong number");
                    }
                    else
                    {
                        System.out.println("The number is not an armstrong number");
                    }
                    break;
                case 6:
                    System.out.println("Exiting the program");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option");
                    break;
            }
        }
    }
    //For calculation of fibonacci number
    public static int fibonacci(int num)
    {
        if(num==0)
        {
            return 0;
        }
        else if(num==1)
        {
            return 1;
        }
        else {
            return fibonacci(num-1)+fibonacci(num-2);
        }
    }
    // for calculation of factorial of a number
    public static int fact(int num1)
    {
        if(num1==0)
        {
            return 1;
        }
        else
        {
            return num1*fact(num1-1);
        }
    }
    //For calculation of reverse of a number
    public static int reverse(int num2)
    {
        int rem,rev =0;
        while(num2!=0)
        {
            rem = num2%10;
            rev = rem + (rev*10);
            num2= num2/10;
        }
        return rev;
    }
    // checking either a number is palindrome or not
    public static int palindrome(int num3)
    {
        int rem,pali =0;
        while(num3!=0)
        {
            rem = num3%10;
            pali = rem +(pali*10);
            num3=num3/10;
        }
        return pali;
    }
    //checking either a number is armstrong or not
    public static int armstrong(int num4) {
        int arm, sum = 0;
        arm = num4 % 10;
        sum = sum + (arm * arm * arm);
        num4 = num4 / 10;
        return sum;
    }
}
