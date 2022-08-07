import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 방번호 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        String input = br.readLine();
        int[] arr = new int[10];
        for(int i = 0; i < input.length(); i++) {
            arr[input.charAt(i) - '0']++;
        }
        int answer = 0;
        int sixAndNine = arr[6] + arr[9];

        if(sixAndNine % 2 != 0) {
            answer = ((sixAndNine) / 2) + 1;
        } else {
            answer = sixAndNine / 2;
        }
        for(int i = 0; i < 10; i++) {
            if(i == 6 || i == 9) {
                continue;
            }
            if(arr[i] > answer) {
                answer = arr[i];
            }
        }

        System.out.println(answer);
    }
}
