import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 체스판다시칠하기 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        //white first || black first
        String[][] white = new String[8][8];
        String[][] black = new String[8][8];
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if((i+j)%2 == 0) {
                    white[i][j] = "W";
                } else {
                    white[i][j] = "B";
                }
            }
        }
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if((i+j)%2 == 0) {
                    black[i][j] = "B";
                } else {
                    black[i][j] = "W";
                }
            }
        }

        //input받기
        //N * M
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        //chess lines
        String input[][] = new String[n][m];
        for(int i = 0; i < n; i++) {
            String[] inputLine = br.readLine().split("");
            input[i] = inputLine;
        }
        br.close();

//        확인용-임시
        for(int i = 0; i < input.length; i++){
            for(int j = 0; j < input[i].length; j++) {
                System.out.print(input[i][j] + "\t");
            }
            System.out.println();
        }

        //iterating

        ArrayList<Integer> answerArr = new ArrayList<>();
        for(int a = 0; a < (n - 7); a++) {
            for(int b = 0; b < (m - 7); b++) {
                int count = 0;

                    for(int c = 0; c < 8; c++) {
                        for(int d = 0; d < 8; d++) {
                            if(!input[a + c][b + d].equals(white[c][d])) {
                                count++;
                            }

                        }
                    }
                answerArr.add(count);
            }
        }
        for(int a = 0; a < (n - 7); a++) {
            for(int b = 0; b < (m - 7); b++) {
                int count = 0;

                for(int c = 0; c < 8; c++) {
                    for(int d = 0; d < 8; d++) {
                        if(!input[a + c][b + d].equals(black[c][d])) {
                            count++;
                        }

                    }
                }
                answerArr.add(count);
            }
        }
//        for(int a = 0; a < (n - 7); a++) {
//            for(int b = 0; b < (m - 7); b++) {
//                int count = 0;
//                if(input[a][b].equals("W")) {
//                    for(int c = 0; c < 8; c++) {
//                        for(int d = 0; d < 8; d++) {
//                            if(!input[a + c][b + d].equals(white[c][d])) {
//                                count++;
//                            }
//                        }
//                    }
//                } else {
//                    for(int c = 0; c < 8; c++) {
//                        for(int d = 0; d < 8; d++) {
//                            if(!input[a + c][b + d].equals(black[c][d])) {
//                                count++;
//                            }
//                        }
//                    }
//                }
//                answerArr.add(count);
//            }
//        }
        System.out.println(answerArr);

//        //Find min
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < answerArr.size(); i++) {
            if(answerArr.get(i) < min) {
                min = answerArr.get(i);
            }
        }
        System.out.println(min);


    }
}
