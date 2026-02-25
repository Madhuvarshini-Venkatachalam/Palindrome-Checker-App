public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string to check
        String word = "racecar";

        // Step 1: Reverse the string using a for loop
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i); // String concatenation
        }

        // Step 2: Compare original and reversed string
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("Program executed successfully!");
    }
}