package Easy;

public class Problem_20_Valid_Parentheses {
    //Language Java
    //Runtime 41ms
    //Memory 45.4MB
    public boolean isValid(String s) {
        while (s.contains("{}") || s.contains("()") || s.contains("[]")) {
            s = s.replace("{}", "").replace("()", "").replace("[]", "");
        }

        return s.isEmpty();
    }
}
