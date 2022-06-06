import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 좌표정렬하기 {
    public static void main(String[] args) throws IOException {
//        int[][] a = {
//                {3,9},
//                {1,1},
//                {1,-1},
//                {2,2},
//                {3,3},
//                {-1,0},
//                {2,6}
//        };
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        int[][] a = new int[t][2];
        for(int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            a[i][0] = Integer.parseInt(st.nextToken());
            a[i][1] = Integer.parseInt(st.nextToken());
        }


        for(int i = 0; i < a.length - 1; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i][0] > a[j][0]) {
                    int[][] temp = new int[][]{{0,0}};
                    temp[0][0] = a[i][0];
                    temp[0][1] = a[i][1];
                    a[i][0] = a[j][0];
                    a[i][1] = a[j][1];
                    a[j][0] = temp[0][0];
                    a[j][1] = temp[0][1];
                }
            }
        }

//        for(int i = 0; i < a.length; i++) {
//            for(int j = 0; j < a[i].length; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println();

        int first = 0;
        int second = 1;
        ArrayList<ArrayList<Integer>> indexes = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        while(second != a.length) {
            if((a[first][0] - a[second][0] == 0)) {
              second += 1;
            } else {
                temp = new ArrayList<>();
                temp.add(first);
                temp.add(second);
                indexes.add(temp);
                first = second;
                second += 1;
            }
        }
        temp = new ArrayList<>();
        temp.add(first);
        temp.add(second);
        indexes.add(temp);
//        System.out.println(indexes);

        //index 배열 보고 해당하는 인덱스 숫자들 swap

        for(int i = 0; i < indexes.size(); i++) {
            if(indexes.get(i).get(1) - indexes.get(i).get(0) > 1) {
                for(int n = indexes.get(i).get(0); n < indexes.get(i).get(1) - 1; n++) {
                    for(int m = n + 1; m < indexes.get(i).get(1); m++) {
                        if(a[n][1] > a[m][1]) {
                            int[][] temp2 = new int[][]{{0,0}};
                            temp2[0][1] = a[n][1];
                             a[n][1] = a[m][1];
                             a[m][1] = temp2[0][1];
                        }
                    }
                }
            }
        }

//        for(int i = first; i < second - 1; i++) {
//            for(int j = i + 1; j < second; j++) {
//                if(a[i][1] > a[j][1]) {
//                    int[][] temp = new int[][]{{0,0}};
//                    temp[0][1] = a[i][1];
//                    a[i][1] = a[j][1];
//                    a[j][1] = temp[0][1];
//                }
//            }
//        }
//
//
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                bw.write(a[i][j] + " ");


//                System.out.print(a[i][j] + " ");
            }
            bw.newLine();
//            System.out.println();
        }
        bw.flush();
        bw.close();
    }
}
