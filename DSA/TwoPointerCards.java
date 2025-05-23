package DSA;

public class TwoPointerCards {

    public static int sum(int num[],int k)
    {
        int lsum=0, rsum=0,maxsum=0;

        for(int i=0;i<=k-1;i++)
        {
            lsum=lsum+num[i];
        }
        int rindex=num.length-1;

        for(int i=k-1;i>=0;i--)
        {
            lsum=lsum-num[i];
            rsum=rsum+num[rindex];
            maxsum=Math.max(maxsum, lsum+rsum);

            rindex--;
        }

        return maxsum;
    }
    public static void main(String[] args) {

        int arr[]={6,2,3,4,7,2,1,7,1};

        System.out.println(sum(arr, 4));
        
    }
}
