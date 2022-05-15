import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 분수찾기 {

    //1193번-통과
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        //X input
        int x = Integer.parseInt(br.readLine());

        //which row?
        int a = 0;
        int b = 1;
        int count = 0;
        while(a < x) {
            a += b;
            b += 1;
            count += 1;
        }
        //location of x in the row?
        int location = (a - x + 1);
        //odd || even different direction
        if(x == 1) {
            System.out.println("1/1");
        } else {
            if (count % 2 != 0) {
                //odd
                System.out.println(location + "/" + (count + 1 - location));

            } else {
                //even
                System.out.println(((count + 1 - location) + "/" + location));
            }
        }

    }
}
