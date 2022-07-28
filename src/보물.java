import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 보물 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        int t = Integer.parseInt(br.readLine());
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        int sum = 0;

        st = new StringTokenizer(br.readLine());
        while(st.hasMoreElements()) {
            a.add(Integer.parseInt(st.nextToken()));
        }
        a.sort(Comparator.naturalOrder());

        st = new StringTokenizer(br.readLine());
        while(st.hasMoreElements()) {
            b.add(Integer.parseInt(st.nextToken()));
        }

        for(int i = 0; i < a.size(); i++) {
            int max = b.stream()
                    .mapToInt(n -> n)
                    .max().orElse(0);

            sum += max * a.get(i);
            b.remove(Integer.valueOf(max));
        }
        System.out.println(sum);
    }
}
