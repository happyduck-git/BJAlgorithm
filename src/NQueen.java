import java.io.*;

public class NQueen {
    //9663번 N-Queen
    //어차피 같은 행이나 열에는 놓을 수 없음
    //index를 column, index에 들어있는 값을 row로 생각!
    static int[] arr;
    static int n;
    static int count = 0;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        nQueen(0);

        bw.write(count +"");
        br.close();
        bw.flush();
        bw.close();
    }

    public static void nQueen(int depth) {
        //Base case
        if(depth == n) {
            count++;
            return;
        }

        for(int i = 0; i < n; i++) {
            arr[depth] = i;
            if(isAvailable(depth)) {
                //한개 놓고 다른 한개 놓고... n개 놓을 때까지 반복
                nQueen(depth + 1);
            }
        }
    }

    //int col에서 가능한 자리는 어디가 있는지 확인하기
    public static boolean isAvailable(int col) {
        for(int i = 0; i < col; i++) {
            if(arr[col] == arr[i]) {
                return false;
            } else if(Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }
        return true;
    }
}
































