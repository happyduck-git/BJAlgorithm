import java.io.*;

public class 영화감독숌 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        //n input 받기
        int n = Integer.parseInt(br.readLine());
        //1번째 영화 제목인 666을 시작 int로 설정, count 변수로 몇번째 영화인지 count하기
        int start = 666;
        int count = 1;

        while(count < n){ //n == 1인 경우는 while문 들어가지 않음
            //start를 1씩 키우고
            start += 1;
            //start에 666이 포함되면 count++하기
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
