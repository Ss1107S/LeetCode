package Easy;

public class Problem_389_Find_the_Difference {
    //Language Java
    //Runtime 1ms
    //Memory 41.1MB
    public char findTheDifference(String s, String t) {
        char c = 0;
        for(char cs : s.toCharArray()) c ^= cs;
        for(char ct : t.toCharArray()) c ^= ct;
        return c;
    }
}