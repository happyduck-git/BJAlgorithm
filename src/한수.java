import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 한수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int count = 0;

        if(X < 100) {
            count = X;
            System.out.println(count);
        } else {
            for(int a = 100; a <= X; a++) {
                int B = a;
                int digits = 0;

                //Number of digits?
                int A = a;
                while(A != 0) {
                    digits += 1;
                    A /= 10;
                }
                //1의 자리수부터 배열에 넣기
                int[] numbers = new int[digits];
                for(int i =  0; i < digits; i++) {
                    numbers[i] = B % 10;
                    B /= 10;
                }
                //등차수열인지 확인
                boolean flag = false;
                for(int n = 0; n < digits - 2; n++) {
                    if((numbers[n] - numbers[n+1]) == (numbers[n+1] - numbers[n+2])) {
                        flag = true;
                        continue;
                    } else {
                        flag = false;
                        break;
                    }
                }
                if(flag == true) {
                    count += 1;
                }
            }
            System.out.println(99 + count);
        }
    }
}
