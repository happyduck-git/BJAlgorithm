import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 모음의개수 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        char[] consonants = { 'a', 'e', 'i', 'o', 'u'};
        int count = 0;

        while(true) {
            String input = br.readLine();
            if(input.charAt(0) == '#') {
                break;
            }
            for(int i = 0; i < input.length(); i++) {
                for(int j = 0; j < consonants.length; j++) {
                    if(Character.toLowerCase(input.charAt(i)) == consonants[j]) {
                        count++;
                    }
                }
            }
            sb.append(count).append("\n");
            count = 0;
        }

        System.out.println(sb);
    }
}
