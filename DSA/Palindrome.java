package DSA;

public class Palindrome {
    
    public static void checkPalindrome(int n)
    {
        int rev=0;
        int temp=n;

        while(n>0)
        {
            rev=(rev*10)+n%10;
            n=n/10;
        }

        if(rev==temp)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
    public static void main(String[] args) {
        checkPalindrome(45574);
    }
}
