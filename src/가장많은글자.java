import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 가장많은글자 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        String input = " ";
        int[] array = new int[26];
        while(!(input = br.readLine()).isEmpty()) {
            for(int i = 0; i < input.length(); i++) {
                if(input.charAt(i) != ' ') {
                    array[input.charAt(i) - 'a']++;
                }
            }
        }

        /* logic */
        int max = 0;
        for(int i : array) {
            if(max <= i) max = i;
        }

        StringBuilder sb = new StringBuilder();

            for(int i = 0; i < array.length; i++) {

                if(array[i] == max) sb.append((char)(i + 'a'));
            }

        System.out.println(sb);
    }
}

