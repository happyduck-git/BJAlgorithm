import java.io.*;

public class AB3 {
    /*
        2558번
        A+B -2
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(Integer.parseInt(br.readLine()) + Integer.parseInt(br.readLine()) + "");
        br.close();
        bw.flush();
        bw.close();
    }
}
