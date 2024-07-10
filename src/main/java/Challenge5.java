public class Challenge5 {
    public static int countChars(String text, char letter) {
        int letterCount = 0;

        System.out.println("Text length: " + text.length());

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter) {
                letterCount++;
            }
        }

        return letterCount;
    }
}
