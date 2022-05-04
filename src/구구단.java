import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 구구단 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //input
        int N = Integer.parseInt(br.readLine());
        //구구단 N단 출력 N * 1 = ? 형태
        for(int i = 1; i < 10; i ++){
            System.out.println(N + " * " + i + " = " + (N*i));
        }
    }
}
