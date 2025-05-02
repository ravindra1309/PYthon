package Basic_Recursion;

public class ReverseArray {

    public static void reverseArray(int arr[],int temp[],int i)
    {
       if(i==arr.length)
       {
        for(int itr: temp)
        {
            System.out.print(itr+" ");
        }
        return;
       }
       temp[i]=arr[arr.length-1-i];
       reverseArray(arr, temp, i+1);
    }

    public static void reverseArray2(int arr[],int start,int end)
    {
        if(start<end)
        {
            int tmp=arr[start];
            arr[start]=arr[end];
            arr[end]=tmp;
        }
        reverseArray2(arr, start+1, end-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverseArray(arr, new int[arr.length], 0);
    }
}
