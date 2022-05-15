public class 셀프넘버 {

    public static void main(String[] args) {

        //전체 수
        int[] wholeNum = new int[10000];
        for(int i = 0; i < 10000; i++) {
            wholeNum[i] = (i + 1);
        }
        //d 수
        int[] dNum = new int[10000];
        for(int j = 0; j < 10000; j++) {
            dNum[j] = d(j);
        }

        //비교
        for(int a = 0; a < 10000; a++) {
            int noDNum = 0;
            int count = 0;
            for(int b = 0; b < 10000; b++) {
                if(wholeNum[a] == dNum[b]) {
                    count += 1;
                }
            }
            if(count == 0) {
                noDNum = wholeNum[a];
            }
            if(noDNum != 0) {
                System.out.println(noDNum);
            }
        }
    }

    //d(n) method
    public static int d(int number) {
        int result = 0;
        String stringNum = number + "";
        for(int i = 0; i < stringNum.length(); i++) {
            result += Character.getNumericValue(stringNum.charAt(i));
        }
        return (result + number);
    }
}
