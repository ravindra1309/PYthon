package Sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int arr[]={13,24,46,52,20,9};
        insertion(arr);
    }

    public static void insertion(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int k=i;
            for(int j=i-1;j>=0;j--)
            {
                if(arr[k]<arr[j])
                {
                    int temp=arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp;
                    k--;
                }
            }
        }

        for(int a: arr)
        {
            System.out.print(a+" ");
        }
    }
}
