public class Pattern20 {
    public static void main(String[] args) {
        int x = 5;
        for (int i = 0; i < 2 * x - 1; i++) {
            if (i < x) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                for (int k = 0; k < 2 * x - 2 * (i + 1); k++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 0; j < x - (i-x) - 1; j++) {
                    System.out.print("*");
                }

                for (int k = 0; k < 2 * (i-x)+2; k++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < x - (i-x) - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }
}
