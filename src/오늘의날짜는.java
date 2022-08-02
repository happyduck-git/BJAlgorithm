import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class 오늘의날짜는 {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now(ZoneOffset.UTC);
        System.out.println(time.getYear());
        System.out.println(time.getMonth().getValue());
        System.out.println(time.toLocalDate().getDayOfMonth());
    }
}
