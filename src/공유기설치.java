import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.StringTokenizer;

public class 공유기설치 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {


        Date date = new Date();
        System.out.println(date.getTime());


//        /*input 1*/
//        st = new StringTokenizer(br.readLine());
//        int n = Integer.parseInt(st.nextToken());
//        int c = Integer.parseInt(st.nextToken());
//
//        /* input 2 */
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(br.readLine());
//        }
//        Arrays.sort(arr);
//
//        System.out.println(finder(arr, c - 2));
//


    }

    private static int finder(int[] arr, int c) {
        int low = 1;
        int high = arr[arr.length-1] - arr[0];
        int result = 0;

        while(low <= high) {
            int mid = (low + high) / 2;
            int left = arr[0];
            int count = 1;

            for(int i = 1; i < arr.length; i++) {
                if(arr[i] - left >= mid) {
                    count++;
                    left = arr[i];
                }
            }

            if(count > c) {
                result = mid;
                low = mid+1;
            } else {
                high = mid - 1;
            }
        }

        return 1; //바꿔야함!!
    }

}
























