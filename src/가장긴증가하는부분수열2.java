import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 가장긴증가하는부분수열2 {
    //12015번 가장 긴 증가하는 부분 수열 2

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        /* preparation: input */
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        /* actual logic */
        ArrayList<Integer> countList = new ArrayList<>();
        int max = 0;
        int count = 0;
        int maxIndex = -1;

//        while(maxIndex < n-1) {
//            for(int i = 0; i < n; i++) {
//
//            }
//        }

        while(maxIndex < n-1) {

            for(int i = (maxIndex + 1); i < n; i++) {
                if(arr[i] > max) {
                    max = arr[i];
                    count++;
                    maxIndex = i;
                }
            }

            countList.add(count);
            count = 0;
            max = 0;

        }

        int answer = countList.stream().mapToInt(a -> a).max().orElse(0);
        System.out.println(answer);


    }
}






