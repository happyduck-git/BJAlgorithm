import java.io.*;
import java.util.StringTokenizer;

public class 주차의신 {
    public static void main(String[] args) throws IOException {
        //declare br, st
        //input t -> the number of cases : br
        //input n ->the number of stores

        //t만큼 반복
            //declare int min & int max
            //input받으면서 min max 구하기
            //(max - min) *2 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());



        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for(int j = 0; j < n; j++) {
                int nextToken = Integer.parseInt(st.nextToken());
                if(nextToken < min) min = nextToken;
                if(nextToken > max) max = nextToken;
            }
            bw.write((max - min) * 2 + "\n");
        }

        br.close();
        bw.flush();
        bw.close();


    }
}
