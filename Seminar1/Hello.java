import java.time.LocalDateTime;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        LocalDateTime myLocalDateTime = LocalDateTime.now();
        System.out.printf("%tD ",myLocalDateTime);

    }
}