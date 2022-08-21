import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 로봇프로젝트 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        while(sc.hasNextInt()) {
            int x = sc.nextInt() * 10000000;
            int n = sc.nextInt();
            int[] arr = new int[n];
            ArrayList<Integer> ans1 = new ArrayList<>();
            ArrayList<Integer> ans2 = new ArrayList<>();

            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            //Arr 오름차순 정렬하기
            Arrays.sort(arr);

            for(int i = 0; i < (n/2); i++) {
                int low = 0;
                int high = n;
                int f = x - arr[i];

                while(low < high) {
                    int mid = (low + high) / 2;
                    if(f > arr[mid]) {
                        low = mid + 1;
                    } else if(f < arr[mid]) {
                        high = mid - 1;
                    } else {

                        ans1.add(arr[i]);
                        ans2.add(arr[mid]);
                        break;

                    }
                }

            }

            if(ans1.size() == 1) {
//                System.out.println("yes " + ans1.get(0) + " " + ans2.get(0));
                sb.append("yes ").append(ans1.get(0)).append(" ").append(ans2.get(0)).append("\n");
            } else if (ans1.size() > 1) {
                int max = Integer.MIN_VALUE;
                int index = 0;
                for(int i = 0 ; i < ans1.size(); i ++) {
                    if(ans2.get(i) - ans1.get(i) > max) {
                        max = Math.abs(ans2.get(i) - ans1.get(i));
                        index = i;
                    }
                }
//                System.out.println("yes " + ans1.get(index) + " " + ans2.get(index)  );
                sb.append("yes ").append(ans1.get(index)).append(" ").append(ans2.get(index)).append("\n");
            } else {
//                System.out.println("danger");
                sb.append("danger").append("\n");
            }

//            System.out.println(sb);

        }
        System.out.println(sb);
    }
}
