package Easy;

public class Problem_549_Repeated_Substring_Pattern {
    //Language Java
    //Runtime 4ms
    //Memory 45MB
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        for (int i = 1; i < n; i++) {
            if (n % i == 0 && s.startsWith(s.substring(i)))
                return true;
        }
        return false;
    }
}