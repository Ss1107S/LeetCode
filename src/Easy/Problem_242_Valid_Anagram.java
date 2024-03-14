package Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem_242_Valid_Anagram {
    //Language Java
    //Runtime 3ms
    //Memory 44.MB

    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }
}
