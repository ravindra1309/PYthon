package Sorting;

public class SelectionSort {

    public static void main(String[] args) {
        
        int ar[]={13,46,24,52,20,9};
        selection(ar);
    }
    public static void selection(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                min=j;
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

        for(int i: arr)
        {
            System.out.print(i+" ");
        }
    }
}
