package Easy;

public class Problem_557_Reverse_Words_in_a_StingIII {
    //Language Java
    //Runtime 12ms
    //Memory 45MB
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversed.append(reversedWord).append(" ");
        }
        return reversed.toString().trim();
    }
}