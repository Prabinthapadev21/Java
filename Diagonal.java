//To compute the sum of the diagonal element of the matrix
import java.util.Scanner;
public class Diagonal {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.println("Enter the size of the matrix");
        int size = sc.nextInt();
        int [][]a=new int[size][size];
        System.out.println("Enter the element of the 3*3 matrix");
        for(i=0;i<size;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        diagonal(a);
    }
    public static void diagonal(int a[][])
    {
        int i, sum =0;
        for(i=0;i<3;i++)
        {
            sum = sum +a[i][i];
        }
        System.out.println("The sum of the diagonal element of the matrix is "+sum);
    }
}
