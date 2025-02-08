import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []num = new int[5];
        System.out.println("Enter the elements of the array:");
        for(int i =0;i<5;i++)
        {
         num[i] = sc.nextInt();
        }
        int max1 = num[1];
        int max2 = num[0];
        for(int i =0;i<5;i++)
        {
            if(max1<num[i])
            {
                max2 = max1;
                max1=num[i];
            } else if (num[i] < max1 && num[i]>max2) {
                max2 = num[i];
            }
        }
        System.out.println("The largest element is "+max1);
        System.out.println("The second largest element is "+max2);
    }
}
