import java.io.*;

public class 베르트랑공준 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int count;
    public static void main(String[] args) throws IOException {

        while(true) {
            int inputNum = Integer.parseInt(br.readLine());
            if(inputNum == 0) break;
            count = 0;
            for(int i = (inputNum + 1); i <= (2*inputNum); i++) {
                if(isPrime(i)) count++;
            }
            bw.write(count +"\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    private static boolean isPrime(int num) {
        if(num == 1) return false;
        if(num == 2) return true;

        for(int i = 2; i <= Math.sqrt(num); i++) {
            if((num % i) == 0) return false;
        }
        return true;
    }
}
