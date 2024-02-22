package Easy;

public class Problem_125_Valid_Palindrome {
    //Language Java
    //Runtime 153ms
    //Memory 45.5MB
    public boolean isPalindrome(String s) {
        if (s.isEmpty()){
            return true;
        }
        s = s.replaceAll("[^A-Za-z0-9]", "");
        var i = 0;
        var result = "";

        while(i < s.length()){
            result = s.charAt(i)+result;
            i += 1;
        }
        return s.equalsIgnoreCase(result);
    }
}