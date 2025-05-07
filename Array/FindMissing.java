package Array;

public class FindMissing {

    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,6};
        find(arr);
    }

    public static void find(int arr[])
    {
        int n=arr.length;
        int xor1=0;
        int xor2=0;
        for(int i=0;i<n-1;i++)
        {
            xor1=xor1 ^(i+1);
            xor2=xor2 ^arr[i];
        }
        xor1=xor1 ^n;
        System.out.println(xor1 ^ xor2);
    }
}
