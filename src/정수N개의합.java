public class 정수N개의합 {


    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        System.out.println(sum(a));
    }

    private static long sum(int[] a) {
        long ans = 0;
        for(int i : a) {
            ans += i;
        }
        return ans;
    }
}
