package Array;

public class LongestSubArray {

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5,1,9};
        int k = 10;
        subArray(arr, k);
    }
    public static void subArray(int arr[],int k)
    {
        int n=arr.length;

        int i=0;
        int j=0;
        int count=0;
        int max=0;
        while(i<n)
        {
            int sum=0;
            for(j=i;j<n;j++)
            {
                sum=sum+arr[j];
                if(sum<=k)
                {
                    count++;
                }
            }
            if(count>max)
            {
                max=count;
            }
            count=0;
            i++;
        }
        System.out.println(max);
    }
}
