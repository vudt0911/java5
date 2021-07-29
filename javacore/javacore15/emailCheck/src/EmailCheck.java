import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCheck {
    public static final Pattern EMAIL_PATTERN = Pattern.compile(("^(.+)@(.+)$"), Pattern.CASE_INSENSITIVE);

    public static void Email(String email) {
        try {
            Matcher matcher = EMAIL_PATTERN.matcher(email);
            if (matcher.find()) {
                System.out.println("Email: " + email + " hợp lệ");
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Email: " + email + " không hợp lệ");
        }

    }
}