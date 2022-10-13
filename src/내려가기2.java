import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 내려가기2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] matrix;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        /* input1 */
        int n = Integer.parseInt(br.readLine());
        /* input2 */
        matrix = new int[n][3];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[][] maxMatrix = new int[n][3];
        int[][] minMatrix = new int[n][3];
        maxMatrix[0][0] = minMatrix[0][0] = matrix[0][0];
        maxMatrix[0][1] = minMatrix[0][1] = matrix[0][1];
        maxMatrix[0][2] = minMatrix[0][2] = matrix[0][2];
        
        for(int i = 1; i < n; i++) {
            maxMatrix[i][0] = Math.max(maxMatrix[i-1][0], maxMatrix[i-1][1]) + matrix[i][0];
            maxMatrix[i][1] = Math.max(maxMatrix[i-1][0], Math.max(maxMatrix[i-1][1], maxMatrix[i-1][2])) + matrix[i][1];
            maxMatrix[i][2] = Math.max(maxMatrix[i-1][1], maxMatrix[i-1][2]) + matrix[i][2];

            minMatrix[i][0] = Math.min(minMatrix[i-1][0], minMatrix[i-1][1]) + matrix[i][0];
            minMatrix[i][1] = Math.min(minMatrix[i-1][0], Math.min(minMatrix[i-1][1], minMatrix[i-1][2])) + matrix[i][1];
            minMatrix[i][2] = Math.min(minMatrix[i-1][1], minMatrix[i-1][2]) + matrix[i][2];
        }
        
        int max = Math.max(maxMatrix[n-1][0], Math.max(maxMatrix[n-1][1], maxMatrix[n-1][2]));
        int min = Math.min(minMatrix[n-1][0], Math.min(minMatrix[n-1][1], minMatrix[n-1][2]));

        sb.append(max).append(" ").append(min);
        System.out.println(sb);
    }

}

/*
    for (int i = 1; i <= n; i++) {
            maxD[i][0] = Math.max(maxD[i - 1][0], maxD[i - 1][1]) + map[i][0];
            maxD[i][1] = Math.max(maxD[i - 1][0], Math.max(maxD[i - 1][1], maxD[i - 1][2])) +  map[i][1];
            maxD[i][2] = Math.max(maxD[i - 1][2], maxD[i - 1][1]) + map[i][2];

            minD[i][0] = Math.min(minD[i - 1][0], minD[i - 1][1]) + map[i][0];
            minD[i][1] = Math.min(minD[i - 1][0], Math.min(minD[i - 1][1], minD[i - 1][2])) +  map[i][1];
            minD[i][2] = Math.min(minD[i - 1][2], minD[i - 1][1]) + map[i][2];
        }
 */
