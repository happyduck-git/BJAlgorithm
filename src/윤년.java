import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 윤년 {
    //2753번
    public static void main(String[] args) throws IOException {
        //input 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        //윤년 판별하기
        if((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 400 == 0)){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
