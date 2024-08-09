import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Challenge5Test {
    String mockFilePath = "src/main/resources/LoremIpsum.txt";

    @Test
    public void countChars() throws IOException {
        assertEquals(2, Challenge5.countChars("The rain in Spain", 'a'));
        assertEquals(4, Challenge5.countChars("Mississippi", 'i'));
        assertEquals(3, Challenge5.countChars("Hacking with Swift", 'i'));
        assertEquals(13266, Challenge5.countChars(String.valueOf(Files.readAllLines(Path.of(mockFilePath))), 'i'));
    }
}
