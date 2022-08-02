import java.io.*;
import java.util.StringTokenizer;

public class AB나누기{
    //1008번 A/B
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        double result = (double) a / b;
        bw.write(String.format("%.2f", result));

        br.close();
        bw.flush();
        bw.close();
        }

}
