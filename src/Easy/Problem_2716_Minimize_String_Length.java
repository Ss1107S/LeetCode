package Easy;

import java.util.HashSet;
import java.util.Set;

public class Problem_2716_Minimize_String_Length {
    //Language Java
    //Runtime 9ms
    //Memory 45.3MB
    public int minimizedStringLength(String s) {
        Set<String> minimized = new HashSet();

        for (int i = 0; i < s.length(); i++) minimized.add(s.charAt(i)+"");
        return minimized.size();
    }
}
