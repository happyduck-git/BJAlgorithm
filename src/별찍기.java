import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2439번 별찍기2
public class 별찍기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        for(int i = 1; i <= N; i++){
            int a = i;
            int b = i;
            while(a != N){
                System.out.print(" ");
                a += 1;
            }

            for(int n = 1; n <= b; n++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }


}
