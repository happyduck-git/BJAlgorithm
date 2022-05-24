import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 설탕배달 {
    //2839번 설탕배달
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int five = 0;
        int three = 0;

        //5로 나누어 떨어지는 경우
        if(n % 5 == 0) {
            five = (n / 5);
            System.out.println(five);
        } else { //5로 나누어 떨어지지 않는 경우
            if ((n % 5) % 3 == 0){
                five = (n / 5);
                three = (n % 5) / 3;
                System.out.println(five + three);
            // -> % 3 == 0 인지 확인
            } else if(n % 3 == 0) { // % 3 == 0
                three = (n / 3);
                System.out.println(three);
            } else {
               //% 3 != 0
                if ((n % 3) % 5 == 0) {
                    
                }
                System.out.println(-1);
            }
        }

//        if(n % 5 != 0) {
//            three = (n % 5) / 3;
//        }
//        if((n % 5) % 3 != 0) {
//            if(n % 3 == 0) {
//                three = (n / 3);
//                System.out.println(three);
//            } else {
//                System.out.println(-1);
//            }
//        } else {
//            System.out.println(five + three);
//        }
    }
}
