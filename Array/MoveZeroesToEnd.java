package Array;

public class MoveZeroesToEnd {

    public static void main(String[] args) {
        int arr[]={1,0,2,3,0,4,0,1};

        int i,j=0;
        for(int k=0;k<arr.length;k++)
        {
            if(arr[k]==0)
            {
                j=k;
                break;
            }
        }
        for(i=j+1;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }

        for(int a: arr)
        {
            System.out.print(a+" ");
        }
    }
}
