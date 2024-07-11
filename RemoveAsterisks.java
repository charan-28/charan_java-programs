public class RemoveAsterisks {
    public static void main(String[] args) {
        String input = "meet**ca*e";
        String output = removeAsterisks(input);
        System.out.println(output);
    }

    private static String removeAsterisks(String input) {
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (ch != '*') {
                result.append(ch);
            }
        }

        return result.toString();
    }
}