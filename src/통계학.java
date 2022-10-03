import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class 통계학 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        /* 1st input - total nums */
        int n = Integer.parseInt(br.readLine());
        /* 2nd input - nums array */
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        /* logic */
        System.out.println(method1(arr));
        System.out.println(method2(arr));
        System.out.println(method3(arr));
        System.out.println(method4(arr));

    }

    private static int method1(int[] array) {
        int sum = 0;
        for(int num : array) {
            sum += num;
        }

        return Math.round((float)sum / (array.length));
    }

    private static  int method2(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }

    private static  int method3(int[] array) {
        /* counting sort */
        int[] countArr = new int[8001];
        for(int num : array) {
            countArr[num + 4000]++;
        }

        /* find the biggest value */
        ArrayList<Integer> maximumIndices = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i = 0; i < countArr.length; i++) {
            if(countArr[i] > max) {
                max = countArr[i];
            }
        }

        for(int i = 0; i < countArr.length; i++) {
            if(countArr[i] == max) {
                maximumIndices.add(i);
            }
        }

        if(maximumIndices.size() > 1) {
            maximumIndices.sort(Comparator.naturalOrder());
            return maximumIndices.get(1) - 4000;
        }
        return maximumIndices.get(0) - 4000;

    }

    private static  int method4(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1] - array[0];
    }
}


