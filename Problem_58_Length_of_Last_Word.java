package Easy;

public class Problem_58_Length_of_Last_Word {
    //Language Java
    //Runtime 0ms
    //Memory 40.8MB
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        int count = 0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i) != ' '){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}