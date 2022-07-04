import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class 최대힙 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        int totalNum = Integer.parseInt(br.readLine());

        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 0; i < totalNum; i++) {
            int numPassed = Integer.parseInt(br.readLine());

            if(numPassed == 0) {
                //if list is empty
                if(list.size() == 0) {
                    sb.append("0" + "\n");
                } else {
                    Integer max = 0;
                    for(int j = 0; j < list.size(); j++) {
                        if(list.get(j) > max) { max = list.get(j);}
                    }

                    sb.append(max+"").append("\n");

                    list.remove(max);
                }
            } else {
                    list.add(numPassed);
            }

        }
        System.out.println(sb.toString());

    }
}































