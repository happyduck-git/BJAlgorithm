import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최댓값 {


    public static void main(String[] args) throws IOException {

        //BufferedReader사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int where = 0;

        for (int i = 0; i <= 8; i++) {
            if (Integer.parseInt(br.readLine()) > max) {
                max = Integer.parseInt(br.readLine());
                where = (i + 1);
            }
        }
        System.out.println(max);
        System.out.println(where);


    }
}


//Scanner 사용
//        Scanner sc = new Scanner(System.in);
//        int max = 0;
//        int where = 0;
//        int[] A = new int[9];
//
//        for(int i = 0; i <= 8; i++) {
//            A[i] = sc.nextInt();
//        }
//
//        for(int i = 0; i <= 8; i++) {
//            if(A[i] > max) {
//                max = A[i];
//                where = (i + 1);
//            }
//        }
//
//        System.out.println(max);
//        System.out.println(where);
//    }
