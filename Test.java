import java.util.Scanner;
public class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0 )
        {
            if((n>2 && n<5))
            {
                System.out.println("Not Weird");
            }
            else if((n>6 && n<=20))
            {
                System.out.println("Weird");
            }
            else if(n>20)
            {
                System.out.println("Not Weird");
            }
        }
        else
        {
            System.out.println("Weird");
        }

    }
}
