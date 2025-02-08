public class MaximumProduct {
    public static void main(String[] args) {
        int []arr={ 1,4,7,8,9,20,10};
        int max1=arr[2];
        int max2=arr[1];
        int max3=arr[0];
        for(int i = 0;i<arr.length;i++)
        {
            if(max1<arr[i])
            {
                max3=max2;
                max2=max1;
                max1=arr[i];
            } else if (max2<arr[i] && max1>arr[i]) {
                max3=max2;
                max2=arr[i];
            }
            else if(max3<arr[i] && max2>arr[i])
            {
                max3 = arr[i];
            }
        }
        int product = max1*max2*max3;
        System.out.println("The maximum product of the array is "+product);
    }
}
