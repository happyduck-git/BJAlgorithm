import java.io.*;
import java.util.*;

public class 덩치 {
    //7568번 덩치
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        //input n 받기
        int n = Integer.parseInt(br.readLine());
        //input x, y 받기
        int[][] information = new int[n][2];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            information[i][0] = Integer.parseInt(st.nextToken());
            information[i][1] = Integer.parseInt(st.nextToken());
        }
        br.close();

        //점수 저장할 int[] & Set 선언
        int[] score = new int[n];
        Set<Integer> noDuplicateScores = new HashSet<>();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(information[i][0] < information[j][0] && information[i][1] < information[j][1]) {
                    score[i] += 1;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i : score) {
            sb.append(i + 1).append(" ");
        }
        System.out.println(sb.deleteCharAt(sb.length() - 1));
//        //Set에 넣어서 중복 없이 보기
//        for(int i : score) {
//            noDuplicateScores.add(i);
//        }
//        //Set to array and sort in descending order
//        ArrayList<Integer> setToList = new ArrayList<>(noDuplicateScores);
//        Collections.sort(setToList, Collections.reverseOrder());
//
//        //등수 찾기
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < score.length; i++) {
//            for(int j = 0; j < setToList.size(); j++) {
//                if(score[i] == setToList.get(j)) {
//                    sb.append(j + 1).append(" ");
//                    break;
//                }
//            }
//        }
//        System.out.println((sb.deleteCharAt(sb.length()-1)));

    }
}
