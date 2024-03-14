package Easy;

import java.util.Arrays;

public class Problem_136_Single_Number {
    //Language Java
    //Runtime 7ms
    //Memory 46.1MB
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int j = 0;

        for (int i = 1; i < nums.length; i = i + 2){
            if(nums[i] != nums[j]){
                return nums[j];
            }
            j = j + 2;
        }
        return nums[j];
    }
}