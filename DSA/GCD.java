package DSA;

public class GCD {
    
    public static void main(String[] args) {
        int a=20,b=15;
        gcd(a, b);
        int gcd=1;
        for(int i=Math.min(a,b);i>0;i--)
        {
            if(a%i==0 && b%i==0)
            {
                gcd=i;
                break;
            }
        }
        System.out.println(gcd);
    }
    public static void gcd(int a,int b)
    {
        if(a==0)
        {
            System.out.println("gcd"+b);
            return;
        }
        else if( b==0)
        {
            System.out.println("gcd"+a);
            return;
        }
        gcd(Math.min(a,b),Math.max(a,b)-Math.min(a,b));
    }

    public static void gcd2(int a,int b)
    {
        while(a>0&&b>0)
        {
            if(a>b)
            {
                a=a%b;
            }
            else {
                b=b%a;
            }

            if(a==0)
            {
                System.out.println("GCD "+b);
                return;
            }
            else
            {
                System.out.println("GCD "+ a);
                return;
            }
        }

    }
}
