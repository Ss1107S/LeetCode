package Easy;

public class Problem_1903_Largest_Odd_Number_in_String {
    //Language Java
    //Runtime 1ms
    //Memory 45.2MB
    public String largestOddNumber(String num) {
        for (int index = num.length() - 1; index >= 0; index--) {
            int digit = num.charAt(index) - '0';
            if ((digit & 1) == 1) {
                return num.substring(0, index + 1);
            }
        }
        return "";
    }
}