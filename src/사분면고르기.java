import java.io.*;

public class 사분면고르기 {
    public static void main(String[] args) throws IOException {

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //input x
        int x = Integer.parseInt(br.readLine());
        //input y
        int y = Integer.parseInt(br.readLine());
        //Check whether x, y are negative or positive

        //if x < 0 && y < 0 -> sout(3)
        //if x < 0 && y > 0 -> sout(2)
        //if x > 0 && y < 0 -> sout(4)
        //if x > 0 && y > 0 -> sout(1)
        if(x < 0 && y < 0) bw.write(3 + '0');
        else if(x < 0 && y > 0) bw.write(2 + '0');
        else if(x > 0 && y < 0) bw.write(4 + '0');
        else bw.write(1 + '0');

        br.close();
        bw.flush();
        bw.close();

    }


 }

