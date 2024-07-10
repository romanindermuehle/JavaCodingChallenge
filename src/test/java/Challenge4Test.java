import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Challenge4Test {
    @Test
    public void stringContainsAnother() {
        assertTrue(Challenge4.stringContainsAnother("Hello, world", "Hello"));
        assertTrue(Challenge4.stringContainsAnother("Hello, world", "WORLD"));
        assertFalse(Challenge4.stringContainsAnother("Hello, world", "Goodbye"));
    }

    @Test
    public void countTextOccur() {
        assertEquals(1, Challenge4.countTextOccur("Hello, world", "Hello"));
        assertEquals(1, Challenge4.countTextOccur("Hello, world", "WORLD"));
        assertEquals(0, Challenge4.countTextOccur("Hello, world", "Goodbye"));
        assertEquals(6, Challenge4.countTextOccur("The duck ducked as the duck ducked under the ducking duck.", "duck"));
    }
}
