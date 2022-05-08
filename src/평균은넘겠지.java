import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 평균은넘겠지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //1st input - number of test cases
        int C = Integer.parseInt(br.readLine());
        //2nd~ input - num of students and scores of each student


        for(int i = 0; i < C; i++) {
            double sum = 0;
            ArrayList<Integer> arrayList = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            for(int j = 0; j < N; j++) {
                int temp = Integer.parseInt(st.nextToken());
                sum += temp;
                arrayList.add(temp);
            }

            sum /= N;

            double count = 0;
            for(int a = 0; a < arrayList.size(); a++) {
                if(arrayList.get(a) > sum) {
                    count += 1;
                }
            }
            double answer = (count / N) * 100;
            System.out.println(String.format("%.3f", answer) + "%");
        }
    }
}
