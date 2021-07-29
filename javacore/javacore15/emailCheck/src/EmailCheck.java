import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCheck {
    public static final Pattern EMAIL_PATTERN = Pattern.compile(("^(.+)@(.+)$"), Pattern.CASE_INSENSITIVE);

    public static String Email(String email) {
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        if (matcher.find()) {
            return "Email: " + email + " - Hợp lệ";
        } else {
            throw new RuntimeException("Email không hợp lệ");
        }
    }
}