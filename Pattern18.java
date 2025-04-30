public class Pattern18 {
    public static void main(String[] args) {
        
        int x=5;
        for(int i=0;i<x;i++)
        {
            for(int j=65+x-1-i;j<=65+x-1;j++)
            {
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}
