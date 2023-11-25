public class m8 {
    public static int
    countvowels(String input) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (vowels.indexOf(ch) != -1)
                count++;

        }

        return count;
    }

    public static void main(String[] args) {
        String input = "Number";

    }
}
