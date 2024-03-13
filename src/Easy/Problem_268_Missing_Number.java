package Easy;

public class Problem_268_Missing_Number {
    //Language Java
    //Runtime 0ms
    //Memory 45MB
    public int missingNumber(int[] nums) {
        int s = nums.length;
        int totalSum = s * (s + 1) / 2;
        int sum = 0;
        int result;

        for (int i = 0; i < s; i++) {
            sum = sum + nums[i];
        }
        return totalSum - sum;
    }
}