import java.util.Scanner;
public class Descending {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter the marks of the student");
        for(int i =0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        //After getting the marks of the student arranging them according the marks obtained
        for(int i =0;i<5-1;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(a[i]<a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        // displaying the resultant marks in descending order
        System.out.println("The marks of the student are");
        for(int i =0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}
