import java.io.*;
import java.util.Stack;

//스택 문제!

public class 균형잡힌세상 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {

        while(true) {

            String sentence = br.readLine();
            // . 만 나오면 break
            if(sentence.equals(".")) {
                break;
            }

            if(isYes(sentence)) {
                bw.write("yes" + "\n");
            } else {
                bw.write("no" + "\n");
            }

        }

        br.close();
        bw.flush();
        bw.close();

    }

    public static boolean isYes(String sentence) {
        Stack<Character> chars = new Stack<>();

        for(int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            //open bracket인 경우
            if(c == '(' || c == '[') {
                chars.push(c);
            } else if(c == ')') { //closed small bracket
                if( chars.empty() || chars.peek() != '(') {
                   return false;
                }
                chars.pop();
            } else if(c == ']') { //closed curly
                if(chars.empty() || chars.peek() != '[') {
                    return false;
                }
                chars.pop();
            }
        }
        if(chars.empty()) {
            return true;
        } else {
            return false;
        }

    }
}























