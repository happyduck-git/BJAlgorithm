import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class 서로다른부분문자열의개수 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String input = br.readLine();
        Set<String> set = new HashSet<>();

        for(int i = 0; i < input.length(); i++) {
            for(int j = i + 1; j <= input.length(); j++) {
                set.add(input.substring(i, j));
            }
        }

        System.out.println(set.size());

    }


}
