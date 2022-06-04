import java.io.*;

public class 물음표느낌표 {
    //10926번 ??!
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        bw.write(input + "??!");

        br.close();
        bw.flush();
        bw.close();
    }

}
