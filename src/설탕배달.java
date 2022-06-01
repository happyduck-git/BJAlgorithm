import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 설탕배달 {
    //2839번 설탕배달
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int five = (n / 5);
        int remainder = (n % 5);
        int three = 0;

        if(remainder % 3 == 0) {
            three = (remainder / 3);
        } else {
            while (five != 0) {
                five -= 1;
                remainder = n - (5 * five);
                if(remainder % 3 == 0) {
                    three = (remainder / 3);
                    break;
                }
            }
        }

        if(five == 0 && three == 0) {
            System.out.println(-1);
        } else {
            System.out.println(five + three);
        }

    }
}
