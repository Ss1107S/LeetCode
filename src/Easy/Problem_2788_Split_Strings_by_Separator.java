package Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Problem_2788_Split_Strings_by_Separator {
    //Language Java
    //Runtime 7ms
    //Memory 46.2MB
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String>list=new ArrayList<>();

        for (String str:words){
            StringTokenizer t = new StringTokenizer(str, String.valueOf(separator));

            while (t.hasMoreTokens()) {
                list.add(t.nextToken().toString());
            }
        }
        return list;
    }
}