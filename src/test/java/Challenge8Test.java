import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Challenge8Test {
    @Test
    public void testChallenge8() {
        assertTrue(Challenge8.isRotated("abcde", "eabcd"));
        assertTrue(Challenge8.isRotated("abcde", "cdeab"));
        assertFalse(Challenge8.isRotated("abcde", "abced"));
        assertFalse(Challenge8.isRotated("abc", "a"));

    }

    @Test
    public void testChallenge8Advanced() {
        assertTrue(Challenge8.isRotatedAdvanced("abcde", "eabcd"));
        assertTrue(Challenge8.isRotatedAdvanced("abcde", "cdeab"));
        assertFalse(Challenge8.isRotatedAdvanced("abcde", "abced"));
        assertFalse(Challenge8.isRotatedAdvanced("abc", "a"));

    }
}
