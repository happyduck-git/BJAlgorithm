import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BoilingWater {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int b = Integer.parseInt(br.readLine());

        int result = (5 * b) - 400;
        System.out.println(result);

        if(result > 100) System.out.println("-1");
        else if(result == 100) System.out.println("0");
        else System.out.println("1");


    }
}
