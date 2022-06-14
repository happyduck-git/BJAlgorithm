import java.io.*;
import java.util.ArrayList;

public class 스택수열 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> nums = new ArrayList<>(); //1부터 n까지 수 담기
        for(int i = 1; i <= n; i++) {
            nums.add(i);
        }

        ArrayList<Integer> sample = new ArrayList<>(); //input으로 들어오는 수 담기
        for(int i = 0; i < n; i++) {
            sample.add(Integer.parseInt(br.readLine()));
        }

        StringBuilder sb = new StringBuilder(); //+,- 기호 append할 sb 생성
        ArrayList<Integer> temp = new ArrayList<>(); //임시로 담아 숫자 둘 stack 역할하는 arrayList 생성 (push)
        ArrayList<Integer> answer = new ArrayList<>(); //temp에서 pop해서 나오는 숫자 담을 arrayList 생성
        int index = 0; //inner for loop의 시작점 설정 위한 index

        //이중 for loop으로 숫자 크기 비교하여 push or pop 수행
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

        //temp에 남아있는 수 모두 Last in부터 꺼내기
        if(temp.size() != 0) {
            while(temp.size() != 0) {
                answer.add(temp.get(temp.size() - 1));
                temp.remove(temp.size() - 1);
                sb.append("-\n");
            }
        }

        //실제 나온 결과값인 answer와 input으로 받은 값 sample이 일치하는지 확인
        if(answer.equals(sample)) {
            bw.write(sb.substring(0,sb.length()-1)); //맨 뒤에 붙어있는 \n 제거하기 위해 .substring 사용
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
