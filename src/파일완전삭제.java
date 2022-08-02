import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 파일완전삭제 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        //n input => figure out it's even or odd
        int n = Integer.parseInt(br.readLine());

        // 2nd input using br.readLine
        String originalFile = br.readLine();
        StringBuilder sb = new StringBuilder();
        if((n % 2) == 0) { //even
            sb.append(originalFile);

        } else {

            for(int i = 0; i < originalFile.length(); i++) {
                if(originalFile.charAt(i) == '0') {
                    sb.append(1);
                } else {
                    sb.append(0);
                }
            }
        }
            //if n is an odd num, no need to change anything just system out that input n
            //else, use .charAt(i) and for loop to change numbers
                //0 to 1, 1 to 0
        String modifiedFile = br.readLine();
        if(sb.toString().equals(modifiedFile)) {
            System.out.println("Deletion succeeded");
        } else {
            System.out.println("Deletion failed");
        }
    }
}
