package Easy;

public class Problem_1929_Concatenation_of_Array {
    //Language Java
    //Runtime 1ms
    //Memory 45MB
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];

        for(int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }
}