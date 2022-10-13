import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGB거리 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int numOfHouses = 0;
    static int[][] priceMatrix;
    static int[][] estimateMatrix;
    public static void main(String[] args) throws IOException {

        /* input 1 */
        numOfHouses = Integer.parseInt(br.readLine());
        /* input 2 */
        priceMatrix = new int[numOfHouses][3];
        for(int i = 0; i < numOfHouses; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j++) {
                priceMatrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        /* logic */
        estimateMatrix = new int[numOfHouses][3];
        estimateMatrix[0][0] = priceMatrix[0][0];
        estimateMatrix[0][1] = priceMatrix[0][1];
        estimateMatrix[0][2] = priceMatrix[0][2];

        System.out.println(Math.min(Math.min(calculator(numOfHouses-1, 0), calculator(numOfHouses-1, 1)), calculator(numOfHouses-1,2)));
    }

    private static int calculator(int numOfHouses, int color) {
        if(estimateMatrix[numOfHouses][color] == 0) {
            if(color == 0) return estimateMatrix[numOfHouses][color] = Math.min(calculator(numOfHouses-1,1), calculator(numOfHouses-1, 2)) + priceMatrix[numOfHouses][color];
            if(color == 1) return estimateMatrix[numOfHouses][color] = Math.min(calculator(numOfHouses-1,0), calculator(numOfHouses-1, 2)) + priceMatrix[numOfHouses][color];
            if(color == 2) return estimateMatrix[numOfHouses][color] = Math.min(calculator(numOfHouses-1,0), calculator(numOfHouses-1, 1)) + priceMatrix[numOfHouses][color];
        }
        return estimateMatrix[numOfHouses][color];
    }


/*
    private static void colorSelector(int currentHouse, int sum, int occupied) {

        //edge case
        if(currentHouse == numOfHouses) {
            if(sum < min) min = sum;

            return;
        }

        int[] nominees = priceMatrix[currentHouse];
        for(int i = 0; i < 3; i++) {
            if(currentHouse == 0) {
                occupied = i;
                sum += nominees[i];
            } else {
                if(i == occupied) continue;
                occupied = i;
                sum += nominees[i];
            }

            colorSelector(currentHouse + 1, sum, occupied);
        }
    }

 */
}




























