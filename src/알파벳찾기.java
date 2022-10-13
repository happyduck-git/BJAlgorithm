import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알파벳찾기 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        /* input */
        String input = br.readLine();
        int[] array = new int[26];
        //-1을 기본값으로 넣어준다.
        for(int i = 0; i < 26; i++) {
            array[i] = -1;
        }

        /* logic */
        for(int i = 0; i < input.length(); i++) {
            int index = input.charAt(i) - 'a';
            if(array[index] == -1) {
                array[index] = i;
            }
        }

        for(int n : array) {
            sb.append(n).append(" ");
        }
        System.out.println(sb);

    }






























}
