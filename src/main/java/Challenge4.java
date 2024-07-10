public class Challenge4 {
    public static boolean stringContainsAnother(String text, String search) {
        String lowercasedText = text.toLowerCase();
        String lowercasedSearch = search.toLowerCase();
        int searchIndexCount = 0;
        boolean stringFound = false;

        for (int i = 0; i < text.length(); i++) {
            if (lowercasedText.charAt(i) == lowercasedSearch.charAt(searchIndexCount)) {
                searchIndexCount++;

                if (searchIndexCount >= search.length()) {
                    stringFound = true;
                    break;
                }
            } else {
                searchIndexCount = 0;
            }
        }

        return stringFound;
    }

    public static int countTextOccur(String text, String search) {
        String lowercasedText = text.toLowerCase();
        String lowercasedSearch = search.toLowerCase();
        int searchIndexCount = 0;
        int textOccurring = 0;

        for (int i = 0; i < text.length(); i++) {
            if (lowercasedText.charAt(i) == lowercasedSearch.charAt(searchIndexCount)) {
                searchIndexCount++;

                if (searchIndexCount >= search.length()) {
                    textOccurring += 1;
                    searchIndexCount = 0;
                }
            } else {
                searchIndexCount = 0;
            }
        }

        return textOccurring;
    }
}
