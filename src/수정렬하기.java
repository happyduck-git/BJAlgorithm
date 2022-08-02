import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수정렬하기 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        //input n (number of tests)
        int n = Integer.parseInt(br.readLine());
        //make an array (will use counting sort)
        int[] countArr = new int[20001];

        //for loop input
        for(int i = 0; i < n; i++) {
            int temp = Integer.parseInt(br.readLine());
            countArr[temp + 1000]++;
        }

        //system out in ascending order
        for(int i = 0; i < countArr.length; i++) {
            if(countArr[i] != 0) {
                System.out.println(i - 1000);
            }
        }


    }
}
