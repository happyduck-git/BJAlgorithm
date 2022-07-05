import java.io.*;

public class 소트인사이드 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] counts;
    public static void main(String[] args) throws IOException {

        //0부터 9까지의 인덱스를 숫자로 사용
        counts = new int[10];

        String input = br.readLine();

        for(int i = 0; i < input.length(); i++) {
            //input 받은 String에 있는 수들은 공백으로 구분이 되지 않으므로 charAt 사용
            int curr = input.charAt(i) - '0';
            //해당 수와 일치하는 인덱스의 값 올려주기
            counts[curr]++;
        }
        br.close();

        //내림차순이 되어야하므로 9부터 0까지 차례로 갯수를 bw에 write해주기
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
