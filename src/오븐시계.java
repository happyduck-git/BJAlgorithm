import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 오븐시계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //1st input: HH MM (띄어쓰기로 구분) 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        //2nd input: 0<= C <=1000 분 받기
        int C = Integer.parseInt(br.readLine());
        br.close();
        //2nd input 받은 C를 C / 60 해서 HH에 더하고 C % 60 은 MM에 더하기
        A += (C / 60);
        B += (C % 60);
        //A > 23 인 경우에는 A -= 24
        if(A > 23){
            A -= 24;
        }
        //만약 HH + (C / 60)이 23인데 MM + (C % 60) >= 60 이면 HH는 0이 되게 하기
        //MM은 MM + (C % 60) - 60 하기
        if(B > 59){
            if(A == 23){
                A = 0;
            } else {
                A += 1;
            }
            B -= 60;
        }
        System.out.printf(A + " " + B);
    }
}

//다른 사람 풀이 - 시간 계산 부분이 많이 절약된 것을 확인 가능함. 24시간 단위로 시간 나타낼 때 % 24와 / 24를 활용하면 됨

// 버퍼를 이용해 입력 값을 받음
//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//    int A = Integer.parseInt(st.nextToken());
//    int B = Integer.parseInt(st.nextToken());
//    int C = Integer.parseInt(br.readLine());
//		br.close();
//
//                // 시간 계산
//                int sumMinutes = B + C;
//                int hours = (A + sumMinutes / 60) % 24;
//                int minutes = sumMinutes % 60;
//
//                // 결과 값 출력
//                System.out.println(new StringBuilder().append(hours).append(" ").append(minutes).toString());