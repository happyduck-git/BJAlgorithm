import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 나는야포켓몬마스터이다솜 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        //n, m 받기
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        //Pocketmon name 담을 hashMap
        HashMap<String, Integer> pokemonDictionary = new HashMap<>();
        String[] forIndex = new String[n];

        //도감에 이름 넣기
        int index = 0;
        for(int i = 0; i < n; i++) {
            String input = br.readLine();
            pokemonDictionary.put(input, index++);
            forIndex[i] = input;
        }

//        System.out.println(pokemonDictionary.entrySet());

        //도감에서 찾기
        for(int i = 0; i < m; i++) {
            String temp = br.readLine();
            if(Character.isDigit(temp.charAt(0))) {
                bw.write(forIndex[Integer.parseInt(temp) - 1] + "");
            } else {
                bw.write((pokemonDictionary.get(temp) + 1)+ "");
            }

            if(i != (m-1)) {
                bw.newLine();
            }

        }
        br.close();
        bw.flush();
        bw.close();
    }

    private static String findKey(HashMap<String, Integer> map, int value) throws IOException {
        String answer = "";
        for(Map.Entry<String, Integer> entry : map.entrySet())  {
            if(entry.getValue().equals(value)) {
                answer = entry.getKey();
            }
        }
        return answer;
    }
}
