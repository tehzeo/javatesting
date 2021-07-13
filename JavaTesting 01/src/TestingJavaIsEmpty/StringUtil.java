package TestingJavaIsEmpty;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtil {

    public static boolean isEmpty(String str) {
    return str ==  null || str.trim().length() <= 0;
    }
}
