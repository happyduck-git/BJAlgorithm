import java.io.*;
import java.util.StringTokenizer;

public class 연산자끼워넣기 {
    static int n;
    static int[] arr;
    static int[] operators;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        /* input 받기 */
        //숫자 개수
        n = Integer.parseInt(br.readLine());
        arr = new int[n];

            //arr 채우기
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

            //operator 채우기
        st = new StringTokenizer(br.readLine());
        operators = new int[4]; // +, -, *, / 총 4개 종류이므로
        for(int i = 0; i < 4; i++) {
            operators[i] = Integer.parseInt(st.nextToken());
        }

        /* dfs 탐색 */
        dfs(arr[0], 1);


        /* output */
        br.close();
        bw.write(max+ "\n" + min);
        bw.flush();
        bw.close();

    }

    /*dfs*/
    public static void dfs(int num, int index) {
        if(index == n) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }
        for(int i = 0; i < 4; i++) {
            if(operators[i] > 0) {
                operators[i]--;

                if(i==0) {
                    dfs(num + arr[index], index + 1);
                } else if(i == 1) {
                    dfs(num - arr[index], index + 1);
                } else if(i == 2) {
                    dfs(num * arr[index], index + 1);
                } else if(i == 3){
                    dfs(num / arr[index], index + 1);
                }
                    operators[i]++; //연산자 수량 되돌려 놓기!!

            }
        }
    }
}






























