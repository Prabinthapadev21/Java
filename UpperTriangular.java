import java.util.Scanner;
public class UpperTriangular {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [][]a = new int[3][3];
    System.out.println("Enter the elements of the matrix");
    for(int i =0;i<3;i++)
    {
        for(int j =0;j<3;j++)
        {
            a[i][j]=sc.nextInt();
        }
    }
    //logic for upper triangular matrix
    for(int i =0;i<3;i++)
    {
        for(int j =0;j<3;j++)
        {
            if(i<j) {
                a[i][j] = 0;
            }
        }
    }
    for(int i =0;i<3;i++)
    {
        for(int j =0;j<3;j++)
        {
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
  }
}
