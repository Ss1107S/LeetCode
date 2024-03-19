package Easy;

public class Problem_1_Two_Sum {
    //Language Java
    //Runtime 38ms
    //Memory 45.3MB
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++){
            for (int j = i + 1; j < n; j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int []{};
    }
}