import java.io.*;

public class 수정렬하기3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        // 수의 범위 (0 ~ 10000) 사실상 0은 제외
        int[] cnt = new int[10001];

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            // 해당 인덱스의 값을 1 증가
            cnt[Integer.parseInt(br.readLine())] ++;
        }

        br.close();

        // 0은 입력범위에서 없으므로 1부터 시작
        for(int i = 1; i < 10001; i++){
            // i 값이 개수가 0 이 될 때 까지 출력 (빈도수를 의미)
            while(cnt[i] > 0){
                bw.write(i +"\n");
                cnt[i]--;
            }
        }
        bw.flush();
        bw.close();
    }
//    public static void main(String[] args) throws IOException {
//        // # of test case
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//
//        //loop for n times
//        for(int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//
//        Arrays.sort(arr);
//        for(int i : arr) {
//            bw.write(i +"\n");
//        }
//        bw.flush();
//        bw.close();
//    }
}
