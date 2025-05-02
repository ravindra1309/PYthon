package DSA;

public class ReverseDigit {
 
    public static void reverse(int n)
    {
        int reverse=0;

        while(n>0)
        {
            reverse=(reverse*10)+n%10;
            n=n/10;
        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        reverse(12345);
    }
}
