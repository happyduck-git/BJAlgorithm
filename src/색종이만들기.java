import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 색종이만들기 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] matrix;
    static int white = 0;
    static int blue = 0;
    public static void main(String[] args) throws IOException {

        /*input*/
        int n = Integer.parseInt(br.readLine());
        matrix = new int[n][n];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        /*logic*/

        checker(n, 0, 0);

        System.out.println(white);
        System.out.println(blue);
    }

    private static void checker(int length, int row, int column) { //탐색해야 하는 길이와 시작 row, 시작 column을 파라미터로 제시

        /*탐색 지표*/
        boolean flag = true; //색종이 색상이 일치하는지 알기 위한 지표
        boolean color = true; //어떤 색상인지 알기 위한 지표(true == blue, false == white)

        /*base case*/
        //탐색하는 길이가 1인 경우에는 더 이상 진행하지 않고 escape!
        if(length == 1) {
            //색종이 색상 확인하기
            if(matrix[row][column] == 1) blue++;
            else white++;
            return;
        }

        /*탐색*/
        /*(length x length)인 정사각형을 matrix[row][column]부터 matrix[row+length-1][column+length-1] 까지 탐색하는 과정*/
        for(int a = row; a < length + row; a++) {
            for(int b = column; b < length + column; b++) {
                color = matrix[a][b] == 1; //matrix[a][b]가 1이면 color는 blue(true)로 표시. 0인 경우는 white(false)로 유지.
                if(matrix[a][b] != matrix[row][column]) { //숫자가 다른 구간이 나오면 색종이 색상이 다르다는 의미이므로 flag를 false로 바꾸어주고 for loop에서 빠져 나오기
                    flag = false;
                    break;
                }
            }
            if(!flag) break; //flag를 false인 경우는 outer for loop에서도 빠져 나오기
        }
        if(!flag) { //flag가 false인 경우는 length를 반으로 나눈 후 네 구간 모두 탐색
            checker(length/2, row, column);
            checker(length/2, row, column + (length/2) );
            checker(length/2, row + (length/2), column);
            checker(length/2, row + (length/2), column + (length/2));
        } else { //flag가 true로 유지되었다는 것은 length * length 구간에 다른 색상의 종이가 없었다는 의미
            //색종이 색상 확인하기
            if(color) blue++;
            else white++;
        }
    }

}
