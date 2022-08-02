import java.io.*;

public class 곱셈 {
    //2588번 곱셈
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        calculation(a,b);
        System.out.println(a*b);
    }
    public static void calculation(int num1, int num2) {
        //base case
        if(num2 == 0) return;

        //recursive
        int a = (num2 % 10);
        num2 = (num2 / 10);
        System.out.println(num1 * a);
        calculation(num1, num2);
    }
}
