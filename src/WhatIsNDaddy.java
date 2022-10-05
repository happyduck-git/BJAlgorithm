import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class WhatIsNDaddy {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /* input n */
        int n = Integer.parseInt(br.readLine());
        int m = 0;
        ArrayList<int[]> arrayList = new ArrayList<>();


        while(n >= m) {
            if(n <= 5) {
                arrayList.add(new int[]{n,m});

            }
            n--;
            m++;
        }
        System.out.println(arrayList.size());

    }
}
