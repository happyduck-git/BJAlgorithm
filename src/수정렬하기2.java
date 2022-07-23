import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수정렬하기2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        //input: number of cases
        int n = Integer.parseInt(br.readLine());
        //declare an array for counting sort
        int[] counts = new int[2000001];
        //find max and min num
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        //input: while n times
        while(n > 0) {
            n--;
            int a = Integer.parseInt(br.readLine());
            int index = (a + 1000000);
            counts[index]++;
            if(index > max) {
                max = index;
            }
            if (index < min) {
                min = index;
            }
        }
        //system out in ascending order
        for(int i = min; i < max + 1; i++) {
            if(counts[i]>0) sb.append(i - 1000000).append("\n");
        }
        System.out.println(sb);
    }
}
