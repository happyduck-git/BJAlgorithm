import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 프린터큐 {
    public static void main(String[] args) throws IOException {
        //br, bw, st needed
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //test case: t  //for loop for t times
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            //int count = 0;생성 -> 몇번째에 빠지는 지 카운트하기 위한 변수
            int count = 0;
            //br로 input 받고 st로 나누기
            StringTokenizer st = new StringTokenizer(br.readLine());
            //st.nextToken() 첫번째꺼는 numbers of document
            int numberOfDoc = Integer.parseInt(st.nextToken());
            //두번째 토큰은 몇번째 출력될건지 궁금한 문서의 현재 index
            int indexOfTarget = Integer.parseInt(st.nextToken());

            //br로 document list input 받을 때 Queue linkedlist에 받기
            st = new StringTokenizer(br.readLine());
            Queue<Integer> queue = new LinkedList<>();
            while(st.hasMoreTokens()) {
                queue.offer(Integer.parseInt(st.nextToken()));
            }
            //index 역할을 하는 linkedList도 하나 생성하여 0부터 문서갯수 -1 까지 숫자 담기 - 궁금한 문서 index로 따라가야함
            Queue<Integer> indexQueue = new LinkedList<>();
            for(int n = 0; n < numberOfDoc; n++) {
                indexQueue.offer(n);
            }
            while(true) {
                //peek()으로 첫번째 수 확인 후
                int first = queue.peek();
                boolean found = false;
                for(int a : queue) {
                    if(first < a) {
                        found = true;
                        break;
                    }

                }
                if(found) {
                    queue.offer(queue.poll());
                    indexQueue.offer(indexQueue.poll());

                } else {
                    queue.poll();
                    indexQueue.poll();
                    count += 1;
                }
                //for loop으로 더 큰 수가 있는지 확인
                //if(있으면 다큐먼트 리스트랑, 인덱스 리스트 poll() 하고 offer()하기)
                //else {다큐먼트 리스트랑, 인덱스 리스트 poll()만}
                if(!indexQueue.contains(indexOfTarget)){
                    bw.write(count +"\n");
                    bw.flush();
                    break;
                }
                //궁금한 문서의 index가 indexlist에서 사라지게 되면 count 출력

            }

        }

        bw.close();
    }
}
