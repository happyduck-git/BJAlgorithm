import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 바이러스 {
    //필요한 변수 선언
    static int numOfComs;
    static int numOfConnections;
    static int[][] matrix;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        //input 받기
        numOfComs = Integer.parseInt(br.readLine());
        numOfConnections = Integer.parseInt(br.readLine());
        matrix = new int[numOfComs][numOfComs];
        //matrix만들기
        for(int i = 0; i < numOfConnections; i++) {
            st = new StringTokenizer(br.readLine());
            int firstTk = Integer.parseInt(st.nextToken());
            int secondTk = Integer.parseInt(st.nextToken());
            matrix[firstTk - 1][secondTk - 1] = 1;
            matrix[secondTk - 1][firstTk - 1] = 1;
        }
       //지나는 횟수 세기 위한 변수count = 0;
        int count = bFS(0);
        bw.write(count - 1 + "");
        bw.flush();
        br.close();
        bw.close();
    }

    //bFS method 정의
    public static int bFS(int from) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[numOfComs];
        int count = 0;
        queue.offer(from);
        while(!queue.isEmpty()) {
            from = queue.poll();
            count += 1;
            visited[from] = true;
            for(int i = 0; i < matrix[from].length; i++) {
                if(matrix[from][i] == 1 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
        return count;
    }
}
