import java.util.Set;
import java.util.stream.Collectors;

public class Challenge1 {
    public static boolean areLettersUnique(String text) {
        Set<Character> uniqueLetters = text.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());

        return uniqueLetters.size() == text.length();
    }
}
