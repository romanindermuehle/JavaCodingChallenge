public class Challenge2 {
    public static boolean isStringRotatedTheSame(String text) {
        String lowerCaseText = text.toLowerCase();
        StringBuilder reversedText = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText.append(lowerCaseText.charAt(i));
            System.out.println("Index =" + i);
            System.out.println(reversedText.toString());
        }

        return reversedText.toString().equals(text.toLowerCase());
    }
}
