public class Chess {
    public static void main(String[] args) {
        int a[][]= new int[8][8];
        board(a);
    }
    public static void board(int a[][])
    {
        for(int i =0;i<8;i++)
        {
            for(int j =0;j<8;j++)
            {
                if((i+j)%2==0)
                {
                    a[i][j]=0;
                }
                else
                {
                    a[i][j]=1;
                }
            }
        }
        //printing the result
        for(int i =0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
