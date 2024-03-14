package Easy;

import java.util.Arrays;

public class Problem_217_Return_Length_of_Arguments_Passed {
    //Language JavaScript
    //Runtime 18ms
    //Memory 55MB
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                return true;
            }
        }
        return false;
    }
}