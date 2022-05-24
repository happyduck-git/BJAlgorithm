import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 재귀함수가뭔가요 {
    public static void main(String[] args) throws IOException {
        //BufferedReader로 user input 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //반복할 횟수 n
        int n = Integer.parseInt(br.readLine());
        //한 번만 나오는 문구라서 따로 sout
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        autoChatbot(n,n);
        br.close();
    }

    //별도 함수로 구현
    public static void autoChatbot(int n, int input) {
        //2회째부터 생기는 dash -> 횟수를 거듭하면서 4개씩 늘어남 -> .repeat() 사용해서 개수 증가 반영
        String dash = "____".repeat((input - n));

        System.out.println(dash + "\"재귀함수가 뭔가요?\"");
        if(n == 0) { //Base case
            System.out.println(dash + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
        } else { //Recursion
            //함수가 한 번 호출될 때마다 n을 1씩 감소시켜 n == 0인 조건이 나올 수 있도록 함
            n -= 1;
            System.out.println(
                    dash + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n" +
                            dash +"마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n" +
                            dash +"그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
            //재귀가 발생하는 부분에 재귀 함수 사용
            autoChatbot(n, input);
        }
        //마지막에 딸려나오는 문장이라서 if else 바깥쪽에 배치
        System.out.println(dash + "라고 답변하였지.");
    }
}
