package Easy;

public class Problem_2264_Largest_3_Same_Digit_Number_in_String {
    //Language Java
    //Runtime 2ms
    //Memory 42.6MB
    public String largestGoodInteger(String num) {
        String result = "";
        for(int i = 2; i < num.length(); i++)
            if(num.charAt(i) == num.charAt(i-1) &&
                    num.charAt(i - 1) == num.charAt(i - 2))
                if(num.substring(i - 2, i + 1).compareTo(result) > 0)
                    result = num.substring(i - 2, i + 1);
        return result;
    }
}