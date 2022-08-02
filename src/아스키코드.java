import java.io.*;

public class 아스키코드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char input = br.readLine().charAt(0);

        br.close();
        bw.write(input);
        bw.flush();
        bw.close();
    }
}
