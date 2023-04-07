package practice7;

public class Concatenation {
    public static void main(String[] args) {
        /**
         * Write a function that concatenates two words into single,
         * however if the concatenation creates a similar double char, then omit one of the character's
         * ex:
         * "abc" "cat" -> "abcat"
         *
         * ex2:
         * "abc", "xyz" -> "abcxyz"
         *
         * ex3:
         * "happy", "yolk" -> happyolk
         */

        //TODO WRITE YOUR CODE HERE

    }

    public static String concat(String word1, String word2) {
        // TODO IMPLEMENT METHOD
        int length1 = word1.length();
        int length2 = word2.length();
        if (length1 == 0 || length2 == 0) {
            return word1 + word2;
        }
        if (word1.charAt(length1 - 1) == word2.charAt(0)) {
            return word1 + word2.substring(1);
        }
        return word1 + word2;
    }
}
