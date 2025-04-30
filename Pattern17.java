public class Pattern17 {
    public static void main(String[] args) {
        
        int x=4;
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<x-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=65;k<=65+i;k++)
            {
                System.out.print((char)k);
            }
            for(int l=64+i;l>=65;l--)
            {
                System.out.print((char)l);
            }
            System.out.println();
        }
    }
}
