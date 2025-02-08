import java.util.Scanner;
public class Multiplication{
    public static final int m = 3;
    public static final int n =3;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int [][]a=new int[m][n];
        int [][]b=new int[m][n];
        int [][]c=new int[m][n];
        System.out.println("Enter the elements of the matrix1");
        for(int i = 0;i<m;i++)
        {
            for( int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }System.out.println("Enter the elements of the matrix2");
        for(int i = 0;i<m;i++)
        {
            for( int j=0;j<n;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        //Now for multiplying the both matrix we need to run 3 loops
        for(int i = 0;i<m;i++)
        {
            for(int j =0 ;j<n;j++)
            {
                for(int k = 0;k<m;k++)
                {
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        //Now displaying the resultant matrix
        for(int i = 0;i<m;i++)
        {
            for(int j =0;j<n;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}