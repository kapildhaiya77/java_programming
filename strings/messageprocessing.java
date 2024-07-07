import java.util.*;

public class messageprocessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String message = scanner.nextLine();

        String result = removeSpaces(message);

        System.out.println("Output: " + result);
    }

    public static String removeSpaces(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        // Use a regular expression to replace all occurrences of one or more spaces with an empty string
        return input.replaceAll("\\s+", "");
    }
}
