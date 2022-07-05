import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class 최대힙 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        //큰 숫자에 priority를 주기 위해서 Collections.reverseOrder 적용 (default는 작은 숫자에 우선순위가 있음)
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        //n input
        int n = Integer.parseInt(br.readLine());

        //n번 만큼 수가 주어지므로 while문 사용
        while(n > 0) {
            n--; //턴 돌면서 하나씩 감소
            int x = Integer.parseInt(br.readLine()); //input으로 들어오는 수 x에 할당

            if(x > 0) { //x가 0보다 큰 경우는 priorityQueue에 넣어줌
                priorityQueue.add(x);
            } else { //x가 0과 같거나 0보다 작은 경우는 queue size에 따라 다르게 행동
                if(priorityQueue.size() == 0) { //queue가 빈 경우는 0을 out
                    sb.append(0 + "\n");
                } else { //queue에 숫자가 있는 경우는 가장 큰 수를 remove하고 해당 수는 out
                    sb.append(priorityQueue.remove() + "\n");
                }
            }

        }

        //string builder 마지막에 있는 \n 제거하고 출력
        System.out.println(sb.substring(0, sb.length() - 1));

    }
}


/*
    int totalNum = Integer.parseInt(br.readLine());

    Set<Integer> list = new HashSet<>();

        for(int i = 0; i < totalNum; i++) {
        int numPassed = Integer.parseInt(br.readLine());

        if(numPassed == 0) {
        //if list is empty
        if(list.size() == 0) {
        sb.append("0" + "\n");
        } else {
        Integer max = list.stream()
        .max(Comparator.naturalOrder())
        .orElse(0);

        sb.append(max+"").append("\n");

        list.remove(max);
        }
        } else {
        list.add(numPassed);
        }

        }
        System.out.println(sb.toString());

 */



























