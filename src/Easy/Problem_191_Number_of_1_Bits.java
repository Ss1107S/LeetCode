package Easy;

public class Problem_191_Number_of_1_Bits {
    //Language Java
    //Runtime 0ms
    //Memory 39.6MB
    public int hammingWeight(int n) {
        int result = 0;

        for(int i = 0; i < 32; i++){
            result+= ((n >> i) & 1);
        }
        return result;
    }
}