public class m9 {
    public static String
    removepunctuation(String input) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);


            {
                continue;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String sentence = "Let's try'Mike";
        String result = removepunctuation(sentence);
        System.out.println(result);
    }
}