public class Lab7 {
    public static void main(String[] args) {
        int n = 30;

        System.out.println("n= " + n  + " matrix");
        System.out.println("-------------");
        for (int i = 0; i < n; i++) {
            for(int j = 1; j <= n; j++) {

                System.out.printf("%3s", i + j  + " ");

            }
            System.out.println();
        }
    }
}
