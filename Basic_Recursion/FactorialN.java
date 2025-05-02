package Basic_Recursion;

public class FactorialN {

    public static int factN(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n*factN(n-1);
    }

    public static void main(String[] args) {
        System.out.println(factN(3));
    }
}
