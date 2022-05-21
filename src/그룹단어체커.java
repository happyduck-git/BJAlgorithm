import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 그룹단어체커 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //N 받기
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0; i < N; i++) {
            String input = br.readLine();

            if(checker(input)) {
                count += 1;
            }

        }
        System.out.println(count);
    }
    //내 풀이 - 실패

//    public static boolean checker(char[] charArr) {
//        boolean flag = true;
//        char prev = ' ';
//        for(int i = 0; i < charArr.length - 1; i++) {
//            if(charArr[i] != prev) {
//                for(int j = i + 1; j < charArr.length; j++) {
//                    if(charArr[i] == charArr[j]) {
//                        if(j-i > 1) {
//                            flag = false;
//                            break;
//                        }
//                    }
//                }
//                if(flag == false) {
//                    break;
//                }
//            }
//            prev = charArr[i];
//        }
//        return flag;
//    }

    /* https://st-lab.tistory.com/69 */
public static boolean checker(String str) {
    boolean[] check = new boolean[26];
    int prev = 0;

    for(int i = 0; i < str.length(); i++){
        int now = str.charAt(i);

        if(prev != now) {
            if(check[now - 'a'] == false) {
                check[now - 'a'] = true;
                prev = now;
            } else {
                return false;
            }
        }
        continue;
    }
    return true;
    }
}
