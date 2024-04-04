package Easy;

import java.util.HashSet;

public class Problem_2729_Check_if_The_Number_is_Fascinating {
    //Language Java
    //Runtime 9ms
    //Memory 41.7MB
    public boolean isFascinating(int n) {
        String answer = String.valueOf(n) + String.valueOf(2*n) + String.valueOf(3*n);

        HashSet<Character> isFascinating = new HashSet<>();

        if(answer.contains("0")) return false;
        if(answer.length()>9) return false;
        for(int i=0; i<answer.length(); i++){
            char digit = answer.charAt(i);
            if(isFascinating.contains(digit)){
                return false;
            }else{
                isFascinating.add(digit);
            }
        }
        if(isFascinating.size()==9){
            return true;
        }
        return false;
    }
}
