package Array;

public class MaxConsecutive {

    public static void main(String[] args) {
        
        int arr[]={1,1,1,1,0,1,1,0,1};

        findConsecutive2(arr);
    }
    public static void findConsecutive(int arr[])
    {
        int n=arr.length;

        int i=0;
        int j=0;
        int max=0;
        while(j<n)
        {
            int count=0;
            if(arr[i]==1)
            {
                while(j!=n && arr[j]!=0)
                {
                    count++;
                    j++;
                }
            }
            i=j+1;
            if(count>max)
            {
                max=count;
            }
            j++;
        }
        System.out.println(max);
    }

    public static void findConsecutive2(int arr[])
    {
        int count=0;
        int max=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                count++;
            }
            if(max<count)
            {
                max=count;
            }
            if(arr[i]==0)
            {
                count=0;
            }
        }
        System.out.println(max);
    }
}
