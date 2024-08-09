import java.util.LinkedHashSet;

public class Challenge6 {
    public static String removeDuplicateLetters(String input) {
        LinkedHashSet<String> withoutDuplicate = new LinkedHashSet<>();

        for (int i = 0; i < input.length(); i++) {
            withoutDuplicate.add(String.valueOf(input.charAt(i)));
        }

        return String.join("", withoutDuplicate);
    }
}
