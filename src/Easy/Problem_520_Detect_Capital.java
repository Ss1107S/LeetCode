package Easy;

public class Problem_520_Detect_Capital {
    //Language Java
    //Runtime 2ms
    //Memory 41.9MB
    public boolean detectCapitalUse(String word) {
        boolean firstLetterUpper = Character.isUpperCase(word.charAt(0));

        word = word.substring(1,word.length());

        boolean subUpper = word.equals(word.toUpperCase()),
                subLower = word.equals(word.toLowerCase());

        return firstLetterUpper ? subUpper || subLower : subLower;
    }
}
