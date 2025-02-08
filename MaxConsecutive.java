public class MaxConsecutive {
    public static void main(String[] args) {
        int onecount =0;
        int zerocount=0;
        int []arr = {1,0,1,0,1,0,1,0,1,0};
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                onecount++;
            }
            else {
                zerocount++;
            }
        }
        if(onecount>zerocount)
        {
            System.out.println("The max consecutive number is 1");
        }
        else if(onecount==zerocount)
        {
            System.out.println("Both are same");
        }
        else
        {
            System.out.println("The max consecutive number is 0");
        }
    }
}
