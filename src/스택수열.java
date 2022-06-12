import java.io.*;
import java.util.ArrayList;

public class 스택수열 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            nums.add(i);
        }

        ArrayList<Integer> sample = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            sample.add(Integer.parseInt(br.readLine()));
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        int index = 0;

        for(int i = 0; i < n; i++) {
            for(int j = index; j < n; j++) {
                if(sample.get(i) >= nums.get(j)) {
                    temp.add(nums.get(j));
                    index += 1;
                    sb.append("+\n");
                } else {
                    answer.add(temp.get(temp.size() - 1));
                    temp.remove(temp.size() - 1);
                    sb.append("-\n");
                    break;
                }
            }
        }
        if(temp.size() != 0) {
            while(temp.size() != 0) {
                answer.add(temp.get(temp.size() - 1));
                temp.remove(temp.size() - 1);
                sb.append("-\n");
            }
        }

        if(answer.equals(sample)) {
            bw.write(sb.substring(0,sb.length()-1));
        } else {
            bw.write("NO");
        }
        bw.flush();
        bw.close();
    }

//    public static void main(String[] args) throws IOException {
//
//        int n = Integer.parseInt(br.readLine());
//        StringBuilder nums = new StringBuilder();
//
//        for(int i = 1; i <= n; i++) {
//            nums.append(i);
//        }
//        StringBuilder sample = new StringBuilder();
//        for(int i = 0; i < n; i++) {
//            sample.append(Integer.parseInt(br.readLine()));
//        }
//
//        //+, - 담을 sb
//        StringBuilder sb = new StringBuilder();
//        //temp sb and answer sb
//        StringBuilder temp = new StringBuilder();
//        StringBuilder answer = new StringBuilder();
//        int index = 0;
//
//        for(int i = 0; i < n; i++) {
//            for(int j = index; j < n; j++) {
//                if(sample.charAt(i) >= nums.charAt(j)) {
//                    temp.append(nums.charAt(j));
//                    index += 1;
//                    sb.append("+\n");
//                } else {
//                    answer.append(temp.charAt(temp.length() - 1));
//                    temp.deleteCharAt(temp.length() - 1);
//                    sb.append("-\n");
//                    break;
//                }
//            }
//        }
//        if(temp.length() != 0) {
//            while(temp.length() != 0) {
//                answer.append(temp.charAt(temp.length() - 1));
//                temp.deleteCharAt(temp.length() - 1);
//                sb.append("-\n");
//            }
//        }
//        if(answer.compareTo(sample) == 0) {
//            System.out.println(sb.substring(0,sb.length()-1));
//        } else {
//            System.out.println("NO");
//        }
//    }



}
