import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 부녀회장이될테야 {
    //2775번
    public static void main(String[] args) throws IOException {
            //테케 수 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        //t만큼 돌기
        while(t > 0) {
            t -= 1; //to prevent infinite loop
            //floor
            int k = Integer.parseInt(br.readLine());
            //ho
            int n = Integer.parseInt(br.readLine());

            System.out.println(people(k, n));
        }

    }

    public static int people(int floor, int ho) {
        //base code
        if(floor == 0) { return ho; }
        if(ho == 1) { return 1; }

        return people(floor - 1, ho) + people(floor, ho - 1);
    }
}
