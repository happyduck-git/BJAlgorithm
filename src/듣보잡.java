import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 듣보잡 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> nList = new HashSet<>();

        for(int i = 0; i < n; i++) {
            nList.add(br.readLine());
        }

        int count = 0;
        String input;
        ArrayList<String> answerList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < m; i++) {
            input = br.readLine();

                if(nList.contains(input)) {
                    count++;
                    answerList.add(input);
                }

        }


        sb.append(count).append("\n");
        answerList.sort(Comparator.naturalOrder());
        for (String s : answerList) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);
    }
}
