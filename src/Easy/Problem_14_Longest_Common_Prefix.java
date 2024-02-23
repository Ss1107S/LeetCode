package Easy;

public class Problem_14_Longest_Common_Prefix {
    //Language Java
    //Runtime 0ms
    //Memory 40.7MB
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)return "";
        String x = strs[0];

        for(int i = 1; i < strs.length; i++)while(strs[i].indexOf(x) != 0)x = x.substring(0, x.length()-1);
        return x;
    }
}