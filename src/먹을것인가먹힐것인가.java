import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 먹을것인가먹힐것인가 {
    static int[] b;
    static int count = 0;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());

        while(t > 0) {
            t--;
            //a[], b[] size
            st = new StringTokenizer(br.readLine());
            int sizeA = Integer.parseInt(st.nextToken());
            int sizeB = Integer.parseInt(st.nextToken());
            //a 원소
            int[] a = new int[sizeA];
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < sizeA; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            //b 원소
            b = new int[sizeB];
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < sizeB; i++) {
                b[i] = Integer.parseInt(st.nextToken());
            }

            //Sort b in ascending order
            Arrays.sort(b);

            //Start counting!
            int total = 0;

            for(int i : a) {
                total += countBig(i);
            }

            sb.append(total).append("\n");
        }

        System.out.println(sb);
    }


    public static int countBig(int i) {

        int min = 0;
        int max = b.length;
        int mid = 0;

        while(min < max) {
            mid = (min + max) / 2;

            if(b[mid] == i) {
                return (mid - min);
            }
            if(b[mid] > i) {
                max = (mid - 1);
            } else {
                min = (mid + 1);
            }
        }
        if(min == max) {
            if(min < b.length) {
                if(b[min] < i) return max + 1;
            }

            return (max);
        }
        return 0;

    }
}
