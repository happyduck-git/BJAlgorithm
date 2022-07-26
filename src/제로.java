import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;



public class 제로 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        //가장 최근에 쓴 수를 지우는 것이므로 Stack 사용!
        Stack<Integer> stack = new Stack<>();
        //부르게 되는 숫자의 총 개수 k
        int k = Integer.parseInt(br.readLine()); 

        //k번 동안 로직 수행
        while(k > 0) {
            k--;
            int temp = Integer.parseInt(br.readLine());
            if(temp > 0) { //부른 숫자가 0보다 크면 stack에 해당 수 넣기
                stack.push(temp);
            } else { //부른 숫자가 0보다 작으면 stack에서 가장 최근 수 삭제
                stack.pop();
            }
        }
        int sum = 0;
        //더 이상 수를 부르지 않을 때 stack안에 남은 수 총합 구하기
        for(int i : stack) {
            sum += i;
        }
        System.out.println(sum);
    }
}









































