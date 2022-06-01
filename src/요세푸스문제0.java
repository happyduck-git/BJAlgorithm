import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 요세푸스문제0 {
    static BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            list.add(i+1);
        }
        int start = 0;
        int[] answer = new int[n];
        int index = 0;
        while(list.size() > 1) {
            int indexToRemove = (start + k - 1) % list.size();
            answer[index++] = list.remove(indexToRemove);
            start = indexToRemove % list.size();
        }
        answer[n-1] = list.get(0);
        System.out.println(Arrays.toString(answer).replace("[","<").replace("]",">"));
    }
}
