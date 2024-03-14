public class OddPositionChars {
    public static void main(String[] args) {
        String inputText = "type here to search";
        
        for (int index = 1; index < inputText.length(); index += 2) {
            if (inputText.charAt(index) != ' ') {
                System.out.print(inputText.charAt(index));
            }
        }
    }
}
