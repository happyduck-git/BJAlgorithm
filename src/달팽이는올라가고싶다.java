import java.io.*;
import java.util.StringTokenizer;

public class 달팽이는올라가고싶다 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        //공백으로 나누기
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        long v = Integer.parseInt(st.nextToken());

        long count = 0;
        long temp = 0;
        long up = 0;
        if(a > v) {
            count++;
            System.out.println(count);
        } else {
            while(v > a) {
                temp = v / a;
                up = (a - b) * temp;
                v -= up;
                count += temp;
                if(a > v) {
                    break;
                }
            }
            System.out.println(count+1);
        }

    }
}

/*
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
 */

