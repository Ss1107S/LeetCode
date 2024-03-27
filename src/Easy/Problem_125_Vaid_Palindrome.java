package Easy;

public class Problem_125_Vaid_Palindrome {
    //Language Java
    //Runtime 14ms
    //Memory 44.9MB
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        if (s.isEmpty()) return true;

        int stringLength = s.length();
        int left = 0;
        int right = stringLength - 1;

        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
