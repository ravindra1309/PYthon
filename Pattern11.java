public class Pattern11 {
    public static void main(String[] args) {
        
        int c=1;
        for(int i=0;i<5;i++)
        {
            if(i%2==0)
            {
                c=1;
            }
            else{
                c=0;
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print(c);
                c=1-c;
            }
            System.out.println();
        }
    }
}
