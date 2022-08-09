import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 포도주시식 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        /* input */
        int n = Integer.parseInt(br.readLine());

        //포도주양 input 받을 때 index 사용을 편리하게 하기 위해 크기 n+1인 배열로 생성
        int[] arr = new int[n+1];
        //memoization을 위한 배열 생성
        int[] memo = new int[n+1];

        for(int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        /* logic */
        //첫번째 잔은 무조건 마셔야 최대이므로 마시기(=memo[1]에 값 넣어주기)
        memo[1] = arr[1];

        //n이 1인 경우도 있을 수 있으니 if(n>1) 조건 추가
        if(n > 1) {
            memo[2] = arr[1] + arr[2];
        }

        //연속 세번째 잔은 마시지 못하므로 i = 3부터 계산에 변화가 생김
        for(int i = 3; i <= n; i++) {
            memo[i] =
                    //arr[i]를 선택하지 않는 경우
                    Math.max(memo[i-1],
                            //arr[i]를 선택하는 경우
                            Math.max(memo[i-2] + arr[i],
                                    memo[i-3] + arr[i-1] + arr[i]
                                    ));
        }

        System.out.println(memo[n]);


    }

}
