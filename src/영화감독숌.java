import java.io.*;

public class 영화감독숌 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int start = 666;
        int count = 1;

        while(count < n){
            start += 1;

            if(String.valueOf(start).contains("666")) {
                count++;
            }
        }

        bw.write(String.valueOf(start));

        br.close();
        bw.flush();
        bw.close();
    }
}
