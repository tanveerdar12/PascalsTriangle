public class PascalsTriangle {
    public static int factorial(int i) {
        if(i==0){
            return 1;
        }
        return i * factorial(i-1);
    }
    public static void main(String[] args) {
        int n = 5;
        int i;
        int j;
        PascalsTriangle pt = new PascalsTriangle();


        for (i = 0; i <= n; i++) {
            //for spacing
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for printing pascals triangle elements
            for (j = 0; j <= i; j++) {
                System.out.print( " " +
                                pt.factorial(i)/( factorial(i-j) * factorial(j))
                );
            }
            System.out.println(" ");
        }
    }

}