package Array;

public class RotateByD {

    public static void main(String[] args) {
        int n=7;
        int arr[]={1,2,3,4,5,6,7};
        int arr2[]={1,2,3,4,5,6,7};
        int k=2;

        // Rotating it to the right by k 
        ReverseRight(arr,n-k,n-1);
        ReverseRight(arr,0,n-k-1);
        ReverseRight(arr,0,n-1);

        //Rotating it to left by k elements
        ReverseRight(arr2, 0, k-1);
        ReverseRight(arr2, k, n-1);
        ReverseRight(arr2, 0, n-1);
        for(int a:arr2)
        {
            System.out.print(a+" ");
        }

    }

    public static void ReverseRight(int arr[],int start,int end)
    {
        while(start<=end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

}
