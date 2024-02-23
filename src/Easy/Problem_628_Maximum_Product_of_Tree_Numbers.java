package Easy;

import java.util.Arrays;

public class Problem_628_Maximum_Product_of_Tree_Numbers {
    //Language Java
    //Runtime 12ms
    //Memory 45.2MB
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        
        int case1 = nums[0] * nums[1] * nums[nums.length-1];
        int case2 = nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];
        int maxProduct = Integer.max(case1, case2);

        return maxProduct;
    }
}