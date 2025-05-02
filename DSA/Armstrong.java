package DSA;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N");
        int n=sc.nextInt();
        int rev=n;
        int sum=0;
        int k=String.valueOf(n).length();
        while(n>0)
        {
            sum=sum+(int)Math.pow(n%10, k);
            n=n/10;
        }
        if(sum==rev)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not Armstrong Number");
        }
        sc.close();
    }
}
