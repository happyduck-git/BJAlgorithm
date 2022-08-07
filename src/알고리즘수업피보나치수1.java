import java.util.Scanner;

public class 알고리즘수업피보나치수1 {
    static int rCount = 0;
    static int dCount = 1;
    public static void main(String[] args) {

        /* input */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*logic*/
        recursive(n);
        dp(n);

        System.out.print(rCount + " " + dCount);

    }

    private static int recursive(int n) {

        if(n == 1 || n == 2) {
            rCount++;
            return 1;
        }

        return (recursive(n - 1 ) + recursive(n - 2));

    }

    private static int dp(int n) {
        int[] f = new int[n];
        f[1] = 1;
        f[2] = 1;
        for(int i = 3; i < n; i++) {
            dCount++;
            f[i] = f[i-1] + f[i-2];
        }
        return f[n-1];
    }
}
