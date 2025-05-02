package DSA;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N");
        int n=sc.nextInt();
        int count=0;
        int x=n;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println(count);

        System.out.println((int)(Math.log10(x)+1));
        sc.close();
    }
}
