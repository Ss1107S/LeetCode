package Easy;

public class Problem_680_Valid_Palindrome {
    //Language Java
    //Runtime 8ms
    //Memory 45.6MB
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while(left < right){
            if (s.charAt(left) != s.charAt(right))
                return ValidString (s, left + 1, right)||ValidString (s, left, right-1);
            left++;
            right--;
        }
        return true;
    }
    public boolean ValidString (String s, int left, int right){
        String str = s.substring (left, right+1);
        String result = new StringBuilder (str).reverse().toString();
        return str.equals(result);
    }
}