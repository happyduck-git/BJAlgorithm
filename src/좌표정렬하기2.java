import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 좌표정렬하기2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        int[][] a = new int[t][2];

        for(int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            a[i][0] = Integer.parseInt(st.nextToken());
            a[i][1] = Integer.parseInt(st.nextToken());
        }

        quickSort(a, 0, a.length - 1);


        int first = 0;
        int second = 1;
        ArrayList<ArrayList<Integer>> indexes = new ArrayList<>();
        ArrayList<Integer> temp;
        while(second != a.length) {
            if((a[first][0] - a[second][0] == 0)) {
                second += 1;
            } else {
                temp = new ArrayList<>();
                temp.add(first);
                temp.add(second);
                indexes.add(temp);
                first = second;
                second += 1;
            }
        }
        temp = new ArrayList<>();
        temp.add(first);
        temp.add(second);
        indexes.add(temp);

        //index 배열 보고 해당하는 인덱스 숫자들 swap

        for(int i = 0; i < indexes.size(); i++) {
            if(indexes.get(i).get(1) - indexes.get(i).get(0) > 1) {

                quickSort2(a,indexes.get(i).get(0),indexes.get(i).get(1) - 1);

            }
        }

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                bw.write(a[i][j] + " ");
            }
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }

    private static void quickSort(int[][] array, int start, int end) {
        if(end <= start) { return; }

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    private static int partition(int[][] array, int start, int end) {
        int pivot = array[end][0];
        int i = start - 1;

        for(int j = start; j <= (end - 1); j++) {
            if(array[j][0] < pivot) {
                i++;
                int temp0 = array[i][0];
                array[i][0] = array[j][0];
                array[j][0] = temp0;

                int temp1 = array[i][1];
                array[i][1] = array[j][1];
                array[j][1] = temp1;
            }
        }
        i++;
        int temp0 = array[i][0];
        array[i][0] = array[end][0];
        array[end][0] = temp0;

        int temp1 = array[i][1];
        array[i][1] = array[end][1];
        array[end][1] = temp1;
        return i;
    }

    private static void quickSort2(int[][] array, int start, int end) {
        if(end <= start) { return; }

        int pivot = partition2(array, start, end);
        quickSort2(array, start, pivot - 1);
        quickSort2(array, pivot + 1, end);
    }

    private static int partition2(int[][] array, int start, int end) {
        int pivot = array[end][1];
        int i = start - 1;

        for(int j = start; j <= (end - 1); j++) {
            if(array[j][1] < pivot) {
                i++;
                int temp0 = array[i][0];
                array[i][0] = array[j][0];
                array[j][0] = temp0;

                int temp1 = array[i][1];
                array[i][1] = array[j][1];
                array[j][1] = temp1;
            }
        }
        i++;
        int temp0 = array[i][0];
        array[i][0] = array[end][0];
        array[end][0] = temp0;

        int temp1 = array[i][1];
        array[i][1] = array[end][1];
        array[end][1] = temp1;
        return i;
    }
}
