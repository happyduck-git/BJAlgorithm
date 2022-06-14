import java.io.*;
import java.util.StringTokenizer;

public class 상수 {
    //2908번 상수
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        br.close();

        a = reverse(a);
        b = reverse(b);

        if(a > b) {
            bw.write(a + "");
        } else {
            bw.write(b + "");
        }

        bw.flush();
        bw.close();
    }

    private static int reverse(int n) {
        int reversed = 0;
        while(n != 0) {
            reversed *= 10;
            reversed += (n % 10);
            n /= 10;
        }
        return reversed;
    }
}
/*
import java.io.*;
        import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine()).reverse();
        int A = Integer.parseInt(sb.substring(0, 3));
        int B = Integer.parseInt(sb.substring(4, 7));
        System.out.println(A > B ? A : B);
    }


}
*/