import java.io.*;

public class 소트인사이드 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] counts;
    public static void main(String[] args) throws IOException {

        String input = br.readLine();
        counts = new int[10];

        for(int i = 0; i < input.length(); i++) {
            int curr = input.charAt(i) - '0';
            counts[curr]++;
        }
        br.close();

        for(int i = (counts.length - 1); i >= 0; i--) {
            while(counts[i] != 0) {
                bw.write(i+"");
                counts[i]--;
            }
        }
        bw.flush();
        bw.close();

    }

}
