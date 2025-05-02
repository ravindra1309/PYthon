package DSA;

import java.util.Scanner;

public class Divisor {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=(int)Math.sqrt(n);

        for(int i=1;i<=x;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);

                if(i!=n/i)
                {
                    System.out.println(n/i);
                }
            }
        }
        sc.close();
    }
}
