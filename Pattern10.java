
public class Pattern10 {

    public static void main(String[] args) {

        int x = 5;

        for (int i = 0; i < 2 * x - 1; i++) {
            if (i < x) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");

                }
                System.out.println();
            } else {
                for (int j = i-x; j <x-1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
