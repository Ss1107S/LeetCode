package Easy;

public class Problem_1796_Second_Largest_Digit_in_a_String {
    //Language Java
    //Runtime 1ms
    //Memory 41.9MB
    public int secondHighest(String s) {
        int first = -1, second = -1;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) - '0' <= 9){
                int digit  =s.charAt(i) - '0';

                if(digit > first){
                    second = first;
                    first = digit;
                }else if(digit > second && digit < first)
                    second = digit;
            }
        }
        return second;
    }
}