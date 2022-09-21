import java.util.Scanner;

public class 별찍기4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int blank = 0;

        while(n > 0) {
            for(int i = 0; i < blank; i++) {
                sb.append(" ");
            }
            for(int i = 0; i < n; i++) {
                sb.append("*");
            }
            sb.append("\n");
            blank++;
            n--;
        }

        System.out.println(sb);

    }

}
