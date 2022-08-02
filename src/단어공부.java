import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class 단어공부 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        String input = br.readLine().toUpperCase();
        Map<Character, Integer> words = new HashMap<>();

        for(int i = 0; i < input.length(); i++) {
            char temp = input.charAt(i);
            if(words.containsKey(temp)) {
                words.replace(temp,  words.get(temp),words.get(temp)+1);
            } else {
                words.put(temp, 1);
            }
        }

        Set<Character> keys = words.keySet();
        char maxChar = ' ';
        int max = Integer.MIN_VALUE;
        for(Character key : keys) {
            if(words.get(key) > max) {
                max = words.get(key);
                maxChar = key;
            }
        }


        //동일한 수량이 있는지 체크
        Set<Character> checkSet = new HashSet<>();
        for(Character key : keys) {
            if(words.get(key) == max) {
                checkSet.add(key);
            }
        }

        if(checkSet.size() > 1) {
            System.out.println("?");
        } else {
            System.out.println(maxChar+"");
        }



























    }
}
