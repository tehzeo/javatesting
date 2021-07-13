package TestingJavaIsEmpty;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class StringUtilTest {

    // Start the testing!
    @Test
    public void test_string_is_not_empty() {
        assertFalse(StringUtil.isEmpty("words"));
    }

    @Test
    public void empty_quote_is_string_empty(){
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void null_is_string_empty() {
        assertTrue(StringUtil.isEmpty(null));
    }
    @Test
    public void string_spaces_is_string_empty(){
        assertTrue(StringUtil.isEmpty(" "));
    }
}
