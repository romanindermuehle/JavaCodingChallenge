public class Challenge8 {
    public static boolean isRotated(String text, String search) {
        if (text.length() != search.length()) {
            return false;
        }

        int textIndexCount = -1;
        int searchIndexCount = 0;
        boolean isStringRotated = false;

        for (int i = 0; i < text.length() * 2; i++) {
            if (textIndexCount == text.length() - 1) {
                textIndexCount = 0;
            } else {
                textIndexCount++;
            }
            System.out.println(text.charAt(textIndexCount) + " " + textIndexCount + "," + search.charAt(searchIndexCount) + " " + searchIndexCount);
            if (text.charAt(textIndexCount) == search.charAt(searchIndexCount)) {
                searchIndexCount++;

                if (searchIndexCount >= text.length()) {
                    isStringRotated = true;
                    break;
                }
            } else {
                searchIndexCount = 0;
            }
        }
        return isStringRotated;
    }

    public static boolean isRotatedAdvanced(String text, String search) {
        if (text.length() != search.length()) {
            return false;
        }

        int searchIndexCount = 0;
        boolean isStringRotated = false;

        for (int i = 0; i < text.length() * 2; i++) {
            System.out.println(text.charAt(i % text.length()) + ", " + search.charAt(searchIndexCount) + ", " + "Index = " + i + " " + "TextLength = " + text.length() + " " + "Modulo: " + i % text.length());
            if (text.charAt(i % text.length()) == search.charAt(searchIndexCount)) {
                searchIndexCount++;

                if (searchIndexCount >= text.length()) {
                    isStringRotated = true;
                    break;
                }
            } else {
                searchIndexCount = 0;
            }
        }
        return isStringRotated;
    }
}
