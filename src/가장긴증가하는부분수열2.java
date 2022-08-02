import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 가장긴증가하는부분수열2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        arr[0] = 0;
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(0);

        System.out.println(calculator(arr, temp));

    }

    private static int calculator(int[] arr, ArrayList<Integer> temp) {
        int max = Integer.MIN_VALUE;
        for(int i = 1; i < arr.length; i++) {
            int tempSize = temp.size() - 1;
            if(arr[i] > temp.get(tempSize)) {
                temp.add(arr[i]);
            } else if (arr[i] < temp.get(tempSize)) {
                for(int j = 0; j < tempSize+1; j++) {
                    if(temp.get(j) < arr[i]) {
                        max = j;
                    }

                }
                temp.remove((Integer) max+1);
                temp.add(max+1, arr[i]);
            }
        }
        return temp.size() - 1;
    }
}




















