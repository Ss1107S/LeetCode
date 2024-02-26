package Easy;

import java.util.Arrays;

public class Problem_1979_Find_Greatest_Common_Devisor_of_Array {
    //Language Java
    //Runtime 2ms
    //Memory 43.5MB
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int num1 = nums[0];
        int num2 = nums[nums.length - 1];
        int large = num1;

        for(int i = 1; i <= num2; i++){
            if(num1 % i == 0 && num2 % i == 0){
                large = i;
            }
        }
        return large;
    }
}
