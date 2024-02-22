package Easy;

public class Problem_392_Is_Subsequence {
    //Language Java
    //Runtime 1ms
    //Memory 40.8MB
    public boolean isSubsequence(String s, String t) {
        if(s.equals("")){
            return true;
        }
        int j = 0;
        char cs [] = s.toCharArray();
        char ct [] = t.toCharArray();

        for(int i = 0;i < t.length(); i++){
            if(cs[j] == ct[i]) j++;
            if(j == s.length()) return true;
        }
        return false;
    }
}