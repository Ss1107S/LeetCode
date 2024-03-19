package Easy;

public class Problem_1920_Buid_Array_from_Permutation {
    //Language Java
    //Runtime 1ms
    //Memory 45.6MB
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}