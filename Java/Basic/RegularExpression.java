public class RegularExpression {
    public static void main(String[] args) {
        String text = "The rain in Spain stays mainly in the plain.";
        String pattern = "ain";

        // Check if the pattern exists in the text
        boolean matches = text.matches(".*" + pattern + ".*");
        System.out.println("Pattern found: " + matches);

        // Replace all occurrences of the pattern with "XYZ"
        String replacedText = text.replaceAll(pattern, "XYZ");
        System.out.println("Replaced Text: " + replacedText);

        // Split the text by spaces
        String[] words = text.split(" ");
        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
