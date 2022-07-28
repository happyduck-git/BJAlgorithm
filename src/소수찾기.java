import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수찾기 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        //input the number of numbers
        int n = Integer.parseInt(br.readLine());

        //count the number of prime numbers using for loop
        int count = 0;
        int temp;
        st = new StringTokenizer(br.readLine());

        while(st.hasMoreElements()) {
            temp = Integer.parseInt(st.nextToken());
            if(isPrime(temp)) count++;
        }

        System.out.println(count);
    }

    public static boolean isPrime(int num) {

        if(num == 1) return false;

        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }

        return true;

    }
}
