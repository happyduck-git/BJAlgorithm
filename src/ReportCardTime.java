import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReportCardTime {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());

        while(n > 0) {
            n--;
            st = new StringTokenizer(br.readLine());
            sb.append(st.nextToken()).append(" ");
            sb.append(reportCardCalculator(Integer.parseInt(st.nextToken()))).append("\n");

        }
        System.out.println(sb);

    }

    private static String reportCardCalculator(int score) {
        if(isBetwwen(score, 0, 59)) {
            return "F";
        } else if (isBetwwen(score, 60, 66)) {
            return "D";
        } else if (isBetwwen(score, 67, 69)) {
            return "D+";
        } else if (isBetwwen(score, 70, 76)) {
            return "C";
        } else if (isBetwwen(score, 77, 79)) {
            return "C+";
        } else if (isBetwwen(score, 80, 86)) {
            return "B";
        } else if(isBetwwen(score, 87, 89)) {
            return "B+";
        } else if(isBetwwen(score, 90, 96)) {
            return "A";
        } else {
            return "A+";
        }
    }

    private static boolean isBetwwen(int x, int lower, int upper) {
        return lower <= x && x <= upper;
    }


}

















