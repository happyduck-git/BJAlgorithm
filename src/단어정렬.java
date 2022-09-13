import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class 단어정렬 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        int n = sc.nextInt();
        sc.nextLine();

        HashMap<Integer, ArrayList<String>> map = new HashMap<>();

        while(n > 0) {
            n--;

            String nextInput = sc.nextLine();
            int count = nextInput.length();

            if(map.containsKey(count)) {
                if(map.get(count).contains(nextInput)) {
                    continue;
                }
                map.get(count).add(nextInput);
            } else {
                map.put(count, new ArrayList<>());
                map.get(count).add(nextInput);
            }


        }

        for(int i = 1; i <= 50; i++) {
            if(map.containsKey(i)) {
                map.get(i).sort(Comparator.naturalOrder());
                for(String s : map.get(i)) {
                    sb.append(s).append("\n");
                }
            }
        }

        System.out.println(sb);

    }
}
