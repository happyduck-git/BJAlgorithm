import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 괄호 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        //number of inputs
        int t = Integer.parseInt(br.readLine());
        //test starts
        for(int i = 0; i < t; i++) { //repeat for t times
            //String input
            String input = br.readLine();
            List<String> list = Arrays.asList(input.split(""));
            ArrayList<String> arrayList = new ArrayList<>(list);

            findVPS(arrayList);
        }

    }

    public static ArrayList<String> findVPS(ArrayList<String> arrayList) {
        //base case
        if(arrayList.isEmpty()) {
            System.out.println("YES");
            return null;
        }

        if(arrayList.get(arrayList.size() - 1).equals("(")) {
            System.out.println("NO");
            return null;
        }

        if(arrayList.size() % 2 != 0) {
            System.out.println("NO");
            return null;
        }

        int right = 0;
        int left = 0;

        do{
            if(arrayList.isEmpty()) {
                System.out.println("NO");
                return null;
            }
            String parenthesis = arrayList.get(arrayList.size()-1);
            if(parenthesis.equals("(")) {
                left += 1;
                arrayList.remove(arrayList.size()-1);
            } else {
                right += 1;
                arrayList.remove(arrayList.size()-1);
            }
        } while(right != left);

        return findVPS(arrayList);
    }
}
