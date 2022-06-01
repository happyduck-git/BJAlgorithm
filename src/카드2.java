import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class 카드2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        //get N
        int n = Integer.parseInt(br.readLine());
        //1~N to a linkedlist
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
            linkedList.add(i);
        }

        //action
//        while(linkedList.size() != 1) {
//            linkedList.poll();
//            linkedList.offer(linkedList.poll());
//        }
        queueing(linkedList);

        //when linkedList.size() == 0

        System.out.println(linkedList.get(0));

    }

    public static LinkedList<Integer> queueing(LinkedList<Integer> list) {
        //bc
        if(list.size() == 1) { return list; }
        //recursion
        list.poll();
        list.offer(list.poll());
        return queueing(list);
    }
}
