package Easy;

public class Problem_344_Reverse_String {
    //Language Java
    //Runtime 0ms
    //Memory 50.5MB
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;

        while(start <= end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}