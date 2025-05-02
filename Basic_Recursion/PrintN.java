package Basic_Recursion;

public class PrintN {

    static int cnt=0;
    public static void print()
    {
        if(cnt==3) return;
        System.out.println(cnt);
        cnt=cnt+1;
        print();
    }
    public static void main(String[] args) {
        print();
        printName(1, 4);
        printNReverse(6);
    }

    public static void printName(int i,int n)
    {
        if(i>n)return;
        System.out.println("Raj");

        printName(i+1, n);
    }

    public static void printNReverse(int n)
    {
        if(n<1) return;
        System.out.println(n);
        printNReverse(--n);
    }
}
