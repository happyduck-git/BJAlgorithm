import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GreenhouseGrowth {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        String lights = br.readLine();
        for(int i = 0; i < m; i++) {
            if(lights.charAt(i) == 'A') {
                for(int a = 0; a < (n - 1); a++) {
                    if(arr[a+1] > arr[a]) {
                        arr[a]++;
                    }
                }
            } else {
                for(int b = (n-1); b > 0; b--) {
                    if(arr[b-1] > arr[b]) {
                        arr[b]++;
                    }
                }
            }
        }

        for(int i = 0; i < n; i++) {
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);

    }

    /*
    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(Arrays.toString(arr));

        String lights = br.readLine();
        for(int i = 0; i < m; i++) {
            if(lights.charAt(i) == 'A') lightA(arr);
            else lightB(arr);
        }

        for(int i = 0; i < n; i++) {
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);

    }
    private static void lightA(int[] arr) {
        int pointA = 0;
        int pointB = 1;

        while(pointB < arr.length) {
            int temp = arr[pointA];
            if(temp > arr[pointB]) {
                temp = arr[pointB];
                arr[pointB] += 1;
            }
            pointA++;
            pointB++;
        }
    }

    private static void lightB(int[] arr) {
        int pointA = arr.length - 1;
        int pointB = arr.length - 2;

        while(pointB >= 0) {
            int temp = arr[pointA];
            if(temp > arr[pointB]) {
                temp = arr[pointB];
                arr[pointB] += 1;
            }
            pointA--;
            pointB--;
        }
    }

     */
}
