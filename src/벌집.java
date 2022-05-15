import java.io.*;

public class 벌집 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int temp = 1;
        int count = 1;
        while (true) {
            temp += (6 * count);
            if(n <= temp) {
                bw.write(String.valueOf(count + 1));
//                System.out.println(count + 1);
                break;
            }
            count += 1;
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
