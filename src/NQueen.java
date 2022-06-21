import java.io.*;

public class NQueen {
    //9663번 N-Queen

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
        if(depth == n) {
            count++;
            return;
        }

        for(int i = 0; i < n; i++) {
            arr[depth] = i;
            if(isAvailable(depth)) {
                nQueen(depth + 1);
            }
        }
    }

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
































