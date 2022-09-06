import java.util.Scanner;

public class 평균점수 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int sum = 0;
        int temp = 0;
        for(int i = 0; i < 5; i++) {
            temp = sc.nextInt();
            if(temp < 40) {
                sum += 40;
            } else {
                sum += temp;

            }

        }

        System.out.println(sum / 5);

    }
}
