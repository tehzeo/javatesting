package testingDevices.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static util.PasswordUtil.SecurityLevel.MEDIUM;
import static util.PasswordUtil.SecurityLevel.WEAK;
import static util.PasswordUtilTest.*;

public class PasswordUtilTest {

    private static final long STRONG = ;

    @Test
    public void weak_when_has_less_than_8_letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("123aa!"));
    }

    @Test
    public void weak_when_has_only_letters() {
        assertEquals(WEAK, PasswordUtil.assessPassword("abcdefghjk"));
    }

    @Test
    public void medium_when_has_letters_and_numbers() {
        assertEquals(MEDIUM, PasswordUtil.assessPassword("abcde12345"));
    }

    @Test
    public void strong_when_has_letters_numbers_and_symbols() {
        assertEquals(STRONG, PasswordUtil.assessPassword("abcd123!"));
    }
}