// to comppute the sum of the elements of the array
import java.util.Scanner;
public class Array {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int []a= new int[size];
        System.out.println("Enter the elements of the array");
        for(i=0;i<size;i++)
        {
            a[i]= sc.nextInt();
        }
        sum(a,size);
    }
    public static void sum(int a[],int size)
    {
        int i,sum =0;
        for(i=0;i<size;i++)
        {
            sum = sum + a[i];
        }
        System.out.println("The sum of  the elements of the array is "+sum);
    }
    }