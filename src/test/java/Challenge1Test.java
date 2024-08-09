import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class Challenge1Test {
    @Test
    public void areLettersUnique() {
        assertTrue(Challenge1.areLettersUnique("No duplicates"));
        assertTrue(Challenge1.areLettersUnique("abcdefghijklmnopqrstuvwxyz"));
        assertTrue(Challenge1.areLettersUnique("AaBbCc"));
        assertFalse(Challenge1.areLettersUnique("Hello, world"));
    }
}
