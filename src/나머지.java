import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 나머지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[42];
        int count = 0;
        for(int i = 0; i < 10; i++) {
            arr[Integer.parseInt(br.readLine()) % 42]++;
        }
        for(int n = 0; n < 42; n++) {
            if(arr[n] > 0) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
