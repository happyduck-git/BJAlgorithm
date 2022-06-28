import java.io.*;
import java.util.StringTokenizer;

public class 평범한배낭2 {
    static int numOfItems;
    static int capacityOfKnapsack;
    static int[][] knapsackTable;
    static int totalBenefit;
    static int[] weights;
    static int[] values;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //first line input
        StringTokenizer st = new StringTokenizer(br.readLine());
        numOfItems = Integer.parseInt(st.nextToken());
        capacityOfKnapsack = Integer.parseInt(st.nextToken());

        //second+ line input
        weights = new int[numOfItems + 1];
        values = new int[numOfItems + 1];
        for(int i = 1; i < numOfItems + 1; i++) {
            st = new StringTokenizer(br.readLine());
            weights[i] = Integer.parseInt(st.nextToken());
            values[i] = Integer.parseInt(st.nextToken());
        }


        knapsackTable = new int[numOfItems+1][capacityOfKnapsack+1];

        for(int i = 1; i < numOfItems + 1; i++) {
            for(int j = 1; j < capacityOfKnapsack + 1; j++) {
                int notTakingItem = knapsackTable[i - 1][j];
                int takingItem = 0;

                if(weights[i] <= j) {
                    takingItem = values[i] + knapsackTable[i - 1][j - weights[i]];
                }

                knapsackTable[i][j] = Math.max(notTakingItem, takingItem);

            }
        }
        totalBenefit = knapsackTable[numOfItems][capacityOfKnapsack];

        br.close();
        bw.write(totalBenefit + "");
        bw.flush();
        bw.close();
    }
}






















