import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 스택 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        //input: times
        int times = Integer.parseInt(st.nextToken());
        Stack<Integer> answers = new Stack<>();

        for(int i = 0; i < times; i++) {
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();

            //push int
            if(input.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                answers.push(num);
            }

            //pop
            else if(input.equals("pop")) {
                if(answers.isEmpty()) {
                    System.out.println(-1);
                } else {
                    int removed = answers.pop();
                    System.out.println(removed);
                }
            }

            //size
            else if(input.equals("size")) {
                System.out.println(answers.size());
            }

            //empty
            else if(input.equals("empty")) {
                if(answers.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }

            //top
            else if(input.equals("top")) {
                if(answers.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(answers.peek());
                }
            }
        }
        br.close();
    }
}


//public class 스택 {
//    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    public static void main(String[] args) throws IOException {
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        //input: times
//        int times = Integer.parseInt(st.nextToken());
//        ArrayList<Integer> answers = new ArrayList<>();
//
//        for(int i = 0; i < times; i++) {
//            st = new StringTokenizer(br.readLine());
//            String input = st.nextToken();
//
//            //push int
//            if(input.equals("push")) {
//                int num = Integer.parseInt(st.nextToken());
//                answers.add(num);
//            }
//
//            //pop
//            else if(input.equals("pop")) {
//                if(answers.isEmpty()) {
//                    System.out.println(-1);
//                } else {
//                    int removed = answers.remove(answers.size() - 1);
//                    System.out.println(removed);
//                }
//            }
//
//            //size
//            else if(input.equals("size")) {
//                System.out.println(answers.size());
//            }
//
//            //empty
//            else if(input.equals("empty")) {
//                if(answers.isEmpty()) {
//                    System.out.println(1);
//                } else {
//                    System.out.println(0);
//                }
//            }
//
//            //top
//            else if(input.equals("top")) {
//                if(answers.isEmpty()) {
//                    System.out.println(-1);
//                } else {
//                    System.out.println(answers.get(answers.size() - 1));
//                }
//            }
//        }
//        br.close();
//    }
//}
