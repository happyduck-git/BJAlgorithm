import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 골드바흐의추측 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        //테스트 케이스 수 input 받기
        int t = Integer.parseInt(br.readLine());

        //테스트 케이스 수 만큼 반복
        while(t > 0) {
            t -= 1;//무한루프 방지를 위해 1씩 감소시켜줌

            //골드바흐 파티션 만들 수 input 받기
            int a = Integer.parseInt(br.readLine());

            //input 받은 수보다 작은 수 중 소수들만 담은 ListArray 생성
            ArrayList<Integer> primeArrayList = primeArray(a);
            //소수 간 합을 만들기 위한 두개의 arraylist 생성
            ArrayList<Integer> iList = new ArrayList<>();
            ArrayList<Integer> jList = new ArrayList<>();

            for(int i = 0; i < primeArrayList.size(); i++) {
                //중복되는 덧셈을 방지하기 위해서 j = i 로 설정!
                for(int j = i; j < primeArrayList.size(); j++) {
                    //합이 a보다 커지는 경우가 생기면 더 이상 진행할 필요 없으므로 break
                    if(primeArrayList.get(i) + primeArrayList.get(j) > a) {
                        break;
                    }
                    //합이 a와 같아지는 경우가 생기면 해당 값을 iList, jList에 넣고 break
                    if(primeArrayList.get(i) + primeArrayList.get(j) == a) {
                        iList.add(primeArrayList.get(i));
                        jList.add(primeArrayList.get(j));
                        break;
                    }
                }
            }
            //iList에 요소가 하나만 있는 경우에는 바로 sout
            if(iList.size() == 1) {
                System.out.println(iList.get(0) + " " + jList.get(0));
            } else { //하나 이상의 요소가 있다면 값의 차가 가장 작은 케이스를 찾아 주어야 함
                int min = Integer.MAX_VALUE; //min값 찾기 위한 변수
                int indexTracker = 0; //몇번째 인덱스에 위치해있는지 알기위한 변수
                for(int i = 0; i < iList.size(); i++) { //iList 요소 하나씩 돌면서 값 차이 min 찾기
                    int absValue = Math.abs(iList.get(i) - jList.get(i)); //두 수의 차이를 절대값으로 계산
                    if(absValue < min) { //가장 작은 수를 찾을 때마다 min과 indexTracker 업데이트
                        min = absValue;
                        indexTracker = i;
                    }
                }
                //최종적으로 가장 작은 차이를 갖는 수들을 sout
                System.out.println(iList.get(indexTracker) + " " + jList.get(indexTracker));
            }
        }
    }
    //소수를 담아둘 array 생성
    public static ArrayList<Integer> primeArray(int n) {
        ArrayList<Integer> primeList = new ArrayList<>();
        for(int i = 2; i <= n; i++) {
            if(findPrime(i)) {
                primeList.add(i);
            }
        }
        return primeList;
    }
    //1. 소수 찾는 함수
    public static boolean findPrime(int n) {
        //2는 소수이므로 따로 처리
        if(n == 2) { return true;}
        //2이상 n제곱근 이하 수 중에서 나머지가 0인 경우가 있으면 소수가 아니므로 false
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {return false;}
        }
        //나머지가 0이 나온 경우가 없으면 소수이므로 true
        return true;

    }
}
