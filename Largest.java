// To find the largest element of the array
import java.util.Scanner;
public class Largest {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int []a=new int[size];
        System.out.println("Enter the elements of the array");
        for(i =0;i<size;i++)
        {
            a[i]= sc.nextInt();
        }
        largest(a,size);
        // to find the largest element of the array
    }
    public static void largest(int a[],int size)
    {
        int largest,i;
        largest =a[0];
        for(i=0;i<size;i++)
        {
            if(largest<a[i])
            {
                largest=a[i];
            }
        }
        System.out.println("The largest element is "+largest);
    }
}
