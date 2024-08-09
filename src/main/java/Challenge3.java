import java.util.Arrays;

public class Challenge3 {
    public static boolean containTwoStringsSameChars(String text, String search) {
        if (text.length() != search.length()) {
            return false;
        }

        char[] sortedText = text.toCharArray();
        Arrays.sort(sortedText);

        char[] sortedSearch = search.toCharArray();
        Arrays.sort(sortedSearch);

        return Arrays.toString(sortedText).equals(Arrays.toString(sortedSearch));
    }
}
