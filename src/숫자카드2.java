import java.io.*;
import java.util.StringTokenizer;

/*
  896ms
 */

public class 숫자카드2 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        //1. 카드 input 받기
        int n = Integer.parseInt(br.readLine());
        //-10000000부터 10000000까지 수 카운트 할 수 있게 사이즈 정해서 int[] 생성
        int[] arr = new int[20000001];

        //counting sort 사용해서 input 받은 수에 해당하는 index의 값 1개씩 올려주기
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            arr[temp + 10000000]++;
        }

        //2. 상근이가 가진 카드 input 받기
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        //상근이가 가진 카드 수 출력할 sb 생성
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < m; i++) {
            //st로 받은 카드 종류 하나씩 확인하면서 확인된 카드의 개수는 arr에서 늘려주기
            int temp = Integer.parseInt(st.nextToken());
            sb.append(arr[temp + 10000000]).append(" ");
        }

        br.close();
        bw.write(sb.deleteCharAt(sb.length() - 1).toString()+""); //마지막에 있는 white space 제거하고 출력
        bw.flush();
        bw.close();
    }
}