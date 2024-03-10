package Easy;

import java.util.Stack;

public class Problem_20_Valid_Parentheses {
    //Language Java
    //Runtime 1ms
    //Memory 41.36MB
    public boolean isValid(String s) {
        Stack<Character> isValid = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);

            if (symbol == '(' || symbol == '[' || symbol == '{') {
                isValid.push(symbol);
            } else if (symbol == ')') {
                if (!isValid.isEmpty() && isValid.peek() == '(') {
                    isValid.pop();
                } else {
                    return false;
                }
            } else if (symbol == '}') {
                if (!isValid.isEmpty() && isValid.peek() == '{') {
                    isValid.pop();
                } else {
                    return false;
                }
            } else if (symbol == ']') {
                if (!isValid.isEmpty() && isValid.peek() == '[') {
                    isValid.pop();
                } else {
                    return false;
                }
            }
        }
        return isValid.isEmpty();
    }
}