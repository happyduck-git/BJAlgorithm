import java.io.*;
import java.util.StringTokenizer;

public class 달팽이는올라가고싶다 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        //공백으로 나누기
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        if(a <= v) {
            int currentLoc = 0;
            int count = 0;
            while(currentLoc < v) {
                currentLoc += (a - b);
                count += 1;
                if((currentLoc + a) >= v) {
                    System.out.println(count + 1);
                    break;
                }
            }
        } else {
            System.out.println(1);
        }
    }
}


