import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Challenge6Test {
    @Test
    public void removeDuplicates() {
        assertEquals("helo", Challenge6.removeDuplicateLetters("hello"));
        assertEquals("wombat", Challenge6.removeDuplicateLetters("wombat"));
        assertEquals("Misp", Challenge6.removeDuplicateLetters("Mississippi"));
    }
}
