import java.util.Scanner;
public class Ascending {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int []a=new int[5];
        System.out.println("Enter the element of the array:");
        for(int i =0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        //To sort the values in Ascending order
        for(int i =0;i<5-1;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                int temp = a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        //Displaying in ascending order
        for(int i = 0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}
