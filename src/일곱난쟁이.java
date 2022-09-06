import java.util.Arrays;
import java.util.Scanner;

public class 일곱난쟁이 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        /* input */
        int[] heights = new int[9];
        int height = 0;
        int sum = 0;
        for(int i = 0; i < 9; i++) {
            height = sc.nextInt();
            sum += height;
            heights[i] = height;
        }

        Arrays.sort(heights);

        /* logic */

        int temp = sum;

        for(int a = 0; a < 8; a++) {
            temp -= heights[a];
            for(int b = a + 1; b < 9; b++) {
                temp -= heights[b];
                if(temp == 100) {
                    heights[b] = 0;
                    break;
                } else {
                    temp += heights[b];
                }
            }
            if(temp == 100) {
                heights[a] = 0;
                break;
            } else {
                temp += heights[a];
            }
        }

        for(int i : heights) {
            if(i != 0) {
                System.out.println(i);
            }
        }












    }

}
