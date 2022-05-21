import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 골드바흐의추측 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int t = Integer.parseInt(br.readLine());

        while(t > 0) {
            t -= 1;
            int a = Integer.parseInt(br.readLine());

            ArrayList<Integer> primeArrayList = primeArray(a);
            ArrayList<Integer> iList = new ArrayList<>();
            ArrayList<Integer> jList = new ArrayList<>();


            for(int i = 0; i < primeArrayList.size(); i++) {
                for(int j = i; j < primeArrayList.size(); j++) {
                    if(primeArrayList.get(i) + primeArrayList.get(j) > a) {
                        break;
                    }
                    if(primeArrayList.get(i) + primeArrayList.get(j) == a) {
                        iList.add(primeArrayList.get(i));
                        jList.add(primeArrayList.get(j));
                        break;
                    }
                }
            }

            if(iList.size() == 1) {
                System.out.println(iList.get(0) + " " + jList.get(0));
            } else {
                int min = Integer.MAX_VALUE;
                int indexTracker = 0;
                for(int i = 0; i < iList.size(); i++) {
                    int absValue = Math.abs(iList.get(i) - jList.get(i));
                    if(absValue < min) {
                        min = absValue;
                        indexTracker = i;
                    }
                }
                System.out.println(iList.get(indexTracker) + " " + jList.get(indexTracker));
            }
        }
    }


    public static ArrayList<Integer> primeArray(int n) {
        ArrayList<Integer> primeList = new ArrayList<>();
        for(int i = 2; i <= n; i++) {
            if(findPrime(i)) {
                primeList.add(i);
            }
        }
        return primeList;
    }

    public static boolean findPrime(int n) {
        if(n == 2) { return true;}
        if(n % 2 == 0) { return false; }
        else {
            for(int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0) {return false;}
            }
            return true;
        }
    }
}
