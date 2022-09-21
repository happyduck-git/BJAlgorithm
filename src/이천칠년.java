import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 이천칠년 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        int[] dates = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        st = new StringTokenizer(br.readLine());

        int month = Integer.parseInt(st.nextToken());
        int date = Integer.parseInt(st.nextToken());

        int sum = 0;

        for(int i = 0; i < month; i++) {
            sum += dates[i];
        }

        sum += date;

        switch (sum % 7) {
            case 1:
                System.out.println("MON");
                break;
            case 2:
                System.out.println("TUE");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THU");
                break;
            case 5:
                System.out.println("FRI");
                break;
            case 6:
                System.out.println("SAT");
                break;
            case 0:
                System.out.println("SUN");
                break;
        }

    }
}
