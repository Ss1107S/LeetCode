package Easy;

public class Problem_1816_Truncate_Sentence {
    //Language Java
    //Runtime 0ms
    //Memory 40.9MB
    public String truncateSentence(String s, int k) {
        int count = 0;
        int index = 0;

        for(index = 0; index < s.length(); index++){
            if(s.charAt(index) == ' ')
                count++;

            if(count == k)
                break;
        }
        return s.substring (0, index);
    }
}
}
