import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 하얀칸 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int count;
    public static void main(String[] args) throws IOException {
        count = 0;

        /* input */
        char[][] chessBoard = new char[8][8];

        for(int i = 0; i < 8; i++) {
            String input = br.readLine();
            for(int j = 0; j < input.length(); j++) {
                chessBoard[i][j] = input.charAt(j);
            }
        }

        /* logic */
        countPinsOnWhites(chessBoard);
        System.out.println(count);

    }
    /* logic */
    private static int countPinsOnWhites(char[][] chessBoard) {
        for(int i = 0; i < chessBoard.length; i++) {
            for(int j = 0; j < chessBoard.length; j++) {
                if((i + j) % 2 == 0 && chessBoard[i][j] == 'F') {
                    count++;
                }
            }
        }
        return count;
    }
}
