//To find the number either it is palindrome or not
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int pali = 0,rem,temp;
        System.out.println("Enter the number");
        int num = sc.nextInt();
        temp = num;
        palindrome(num,temp);
    }
    public static void palindrome(int num,int temp)
    {
        int pali =0,rem;
        while(num!=0)
        {
            rem = num%10;
            pali = rem+(pali*10);
            num =num/10;
        }
        if(temp == pali)
            System.out.println(temp+" is a palindrome number");
        else
            System.out.println(temp +" is not a palindrome number");
    }
}
