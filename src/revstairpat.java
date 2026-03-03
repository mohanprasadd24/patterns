public class revstairpat {
    public static void main(String[] args) {
        int n=6;
        for (int row = 1; row <= n+1; row++) {
            for (int col = 1 ; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
