package Basic_Recursion;

public class PalindromeCheck {

    public static void checkPalindrome(String str, int start,int end)
    {
        if(start<end)
        {
            if(str.charAt(end-1) == str.charAt(start))
            {
                checkPalindrome(str, start+1, end-1);
            }
            else{
                System.out.println("Not Palindrome");
                return;
            }
        }
        else {
            System.out.println("Palindrome");
            return;
        }
    }
    public static boolean palindrome(String str, int i)
    {
        if(i>=str.length()/2) return true;

        if(str.charAt(i)!=str.charAt(str.length()-1-i)) return false;
        return palindrome(str, i+1);
    }

    public static void main(String[] args) {
        String str="ABCABA";
        checkPalindrome(str, 0, str.length());
    }
}
