import java.util.Scanner;

public class 별찍기1 {

    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        /* input */
        int n = sc.nextInt();
        stars(n);
        System.out.println(sb);

    }

    /* logic */
    private static void stars(int n) {
        int temp = n;
        int temp2 = temp;
        while(n > 0) {

            temp -= (n - 1);
            n--;
            for(int i = 0; i < temp; i++) {
                sb.append("*");
            }
            sb.append("\n");
            temp = temp2;
        }
    }

}
