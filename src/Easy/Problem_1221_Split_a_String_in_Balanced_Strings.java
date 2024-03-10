package Easy;

public class Problem_1221_Split_a_String_in_Balanced_Strings {
    //Language Java
    //Runtime 0ms
    //Memory 41.3MB
    public int balancedStringSplit(String s) {
        int x = 0;
        int counter = 0;

        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'L'){
                x++;
            }else{
                x--;
            }
            if(x == 0){
                counter++;
            }
        }
        return counter;
    }
}