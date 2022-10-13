import java.util.Scanner;

public class 크로아티아알파벳 {

    static Scanner sc = new Scanner(System.in);
    static int count = 0;
    public static void main(String[] args) {

        String input = sc.next();

        for(int i = 0; i < input.length(); i++) {

            if(input.charAt(i) == '=' || input.charAt(i+1) == '-') {
                continue;
            }

            if(input.charAt(i) == 'c') {
                if(input.charAt(i+1) == '=' || input.charAt(i+1) == '-') {
                    count++;
                }
            }

            if(input.charAt(i) == 'l' || input.charAt(i) == 'n') {
                if(input.charAt(i+1) == 'j') {
                    count++;
                }
            }

            if(i > 0 && input.charAt(i) == 'j' && (input.charAt(i-1) == 'l' || input.charAt(i) == 'n')) {
                continue;
            }

            if(input.charAt(i) == 'd' && input.charAt(i+1) == 'z') {

            }


        }
    }

}
