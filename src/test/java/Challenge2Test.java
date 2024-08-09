import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Challenge2Test {
    @Test
    public void isStringRotatedTheSame() {
        assertTrue(Challenge2.isStringRotatedTheSame("rotator"));
        assertTrue(Challenge2.isStringRotatedTheSame("Rats live on no evil star"));
        assertFalse(Challenge2.isStringRotatedTheSame("Never odd or even"));
        assertFalse(Challenge2.isStringRotatedTheSame("Hello, world"));
    }
}
