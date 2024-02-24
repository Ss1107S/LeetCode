package Easy;

public class Problem_1662_Check_If_Two_String_Arrays_are_Equivalent {
    //Language Java
    //Runtime 1ms
    //Memory 41.1MB
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }
}