package Basic_Recursion;

public class SumFirstNnumbers {

    public static void sumN(int sum,int n)
    {
        if(n<1)
        {
            System.out.println(sum);
            return;
        }
        sum=sum+n;
        sumN(sum, --n);
    }
    public static void main(String[] args) {
        sumN(0, 6);
    }
}
