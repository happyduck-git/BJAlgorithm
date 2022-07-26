import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 프린터큐2 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        /* input */

        //number of test cases
        int t = Integer.parseInt(br.readLine());

        //t번 반복해서 test 수행
        while(t > 0) {
            t--;

            //첫번째 input 받기: 문서 수, 타겟 인덱스
            st = new StringTokenizer(br.readLine());
            int numOfDoc = Integer.parseInt(st.nextToken());
            int targetIndex = Integer.parseInt(st.nextToken());

            //Declare a Queue and an index Queue: 두번째 input으로 들어올 중요도 숫자 받기위한 queue선언
            Queue<Integer> queue = new LinkedList<>();
            Queue<Integer> indexQueue = new LinkedList<>();

            //documents 중요도 input 받으면서 indexQueue도 채우기
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < numOfDoc; i++) {
                queue.offer(Integer.parseInt(st.nextToken()));
                indexQueue.offer(i);
            }

            /* logic */
            int count = 0; //몇번째에 빠져나가는 지 확인하기 위한 변수선언

            while(true) {
                int first = queue.peek();
                boolean found = false;

                //queue의 첫번째 수보다 큰 수가 있는지 확인
                for (int i : queue) {
                    if (i > first) {
                        found = true; //있으면 found를 true로 변경하고 for loop escape
                        break;
                    }
                }

                if (found) {
                    queue.offer(queue.poll());
                    indexQueue.offer(indexQueue.poll());
                } else {
                    count++;
                    queue.poll();
                    if (indexQueue.poll() == targetIndex) {
                        break;
                    }
                }
            }
            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }
}
