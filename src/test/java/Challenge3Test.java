import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Challenge3Test {
    @Test
    public void containTwoStringsSameChars() {
        assertTrue(Challenge3.containTwoStringsSameChars("abca", "abca"));
        assertTrue(Challenge3.containTwoStringsSameChars("abc", "cba"));
        assertTrue(Challenge3.containTwoStringsSameChars("a1 b2", "b1 a2"));
        assertFalse(Challenge3.containTwoStringsSameChars("abc", "abca"));
        assertFalse(Challenge3.containTwoStringsSameChars("abc", "Abc"));
        assertFalse(Challenge3.containTwoStringsSameChars("abc", "cbAa"));
        assertFalse(Challenge3.containTwoStringsSameChars("abcc", "abca"));
    }
}
