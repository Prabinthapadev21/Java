import java.util.Scanner;
public class ThirdLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []num = new int[5];
        System.out.println("Enter the elements of the array:");
        for(int i =0;i<5;i++)
        {
         num[i] = sc.nextInt();
        }
        int max1=num[2];
        int max2=num[1];
        int max3=num[0];
        for(int i =0;i<5;i++)
        {
            if(max1<num[i])
            {
                max3=max2;
                max2 = max1;
                max1=num[i];
            }
            else if(max2<num[i] && num[i]<max1)
            {
                max3 = max2;
                max2 = num[i];
            }
            else if(max2>num[i] && max3<num[i])
            {
                max3 = num[i];
            }
        }
        System.out.println("The largest element is "+max1);
        System.out.println("The second largest element is "+max2);
        System.out.println("The third largest element is "+max3);
    }

}
