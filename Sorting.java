//move all zero to end of the array.
public class Sorting {
    public static void main(String[] args) {
        int []arr={1 ,0, 2,0, 4,0 ,5 ,7 ,9 };
        int j =0;
        int len = arr.length;
        for(int i =0;i<len;i++)
        {
              if(arr[i]!=0)
              {
                  arr[j]=arr[i];
                  j++;
              }
        }
        while(j<len)
        {
            arr[j]=0;
            j++;
        }
        for(int i =0;i<len;i++)
        {
            System.out.println(arr[i]+" ");
        }

    }
}
