import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 팩토리얼 {


    public static void main(String[] args) throws IOException {

        List<String> list = new ArrayList<>(){{
            add("A");
            add("D");
            add("F");
            add("B");
        }};

        String[] listToArr = list.stream()
                .toArray(size->new String[size]); //()안에 object type 명시해주어야 함 (안하면 Object[]으로 반환)



        List<Integer> integerList = new ArrayList<>(){{
            add(1);
            add(5);
            add(2);
        }};


        int[] listToArr2 = integerList.stream()
                .mapToInt(n->n)//mapToInt를 사용해 IntStream으로 변환
                .toArray(); //()안에 따로 object type 명시해주지 않아도 됨

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        System.out.println(factorial(n));
    }
    public static int factorial(int num) {
        //num == 0 || num == 1

        if(num == 0 || num == 1) {return 1;}
        return num * factorial(num - 1);
    }
}
