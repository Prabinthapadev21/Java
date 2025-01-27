// To find the reverse of the array
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter the size of the array");
        int s1=sc.nextInt();
        System.out.println("Enter the elements of the array");
        int []a = new int[s1];
        int []b=new int[s1];
        for(i=0;i<s1;i++)
        {
            a[i]=sc.nextInt();
        }
        reverse(a,b,s1);
    }
    public static void reverse(int a[],int b[],int s1)
    {
        int i,j=0;
        for(i=s1-1;i>=0;i--)
        {
            b[j]=a[i];
            j++;
        }
        for(j=0;j<s1;j++)
        {
            System.out.println("The reversed array is "+b[j]);
        }
    }
}

