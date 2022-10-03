import java.util.Scanner;

public class 나머지와몫이같은수 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long sum = 0;

        for(int i = 0; i < n; i++) {
            sum += (n * i) + i;
        }

        System.out.println(sum);

    }
}
