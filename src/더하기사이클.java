import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 더하기사이클 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        int count = 0;
        int copy = Integer.parseInt(N);
        int transformedInt = 0;
        do {
            int newInt = (copy / 10) + (copy % 10);
            transformedInt = (copy % 10) * 10 + (newInt % 10);
            copy = transformedInt;
            count += 1;
        } while (Integer.parseInt(N) != transformedInt);

    //내 풀이 - 미통과 (형변형도 많고 복잡해서 그런 듯)
//        int count = 0;
//        String copyOfN = N;
//        String transformedN = "0";
//
//        while(Integer.parseInt(N) != Integer.parseInt(transformedN)) {
//            if(Integer.parseInt(copyOfN) < 10){
//                copyOfN = "0" + copyOfN;
//            }
//            int temp = (Integer.parseInt(copyOfN) / 10) + (Integer.parseInt(copyOfN) % 10);
//            transformedN = String.valueOf(Integer.parseInt(copyOfN) % 10) + String.valueOf(temp % 10);
//            copyOfN = transformedN;
//            count += 1;
//        }
        System.out.println(count);
    }
}
