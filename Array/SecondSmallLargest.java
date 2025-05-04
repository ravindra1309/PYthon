package Array;

public class SecondSmallLargest {

    public static void main(String[] args) {
        
        int arr[]={1,2,4,7,7,5};
        secondSmallestLargest(arr);
    }
    public static void secondSmallestLargest(int arr[])
    {
        int small=Integer.MAX_VALUE;
        int second_small=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
        int second_large=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<small)
            {
                second_small=small;
                small=arr[i];
            }
            else if(arr[i]<second_small && arr[i]!=small)
            {
                second_small=arr[i];
            }
            if(arr[i]>large)
            {
                second_large=large;
                large=arr[i];
            }
            else if(arr[i]>second_large && arr[i]!=large)
            {
                second_large=arr[i];
            }

        }

        System.out.println("Second Smallest="+second_small);
        System.out.println("Second Largest="+second_large);
    }
}
