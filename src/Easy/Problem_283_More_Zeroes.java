package Easy;

public class Problem_283_More_Zeroes {
    //Language Java
    //Runtime 2ms
    //Memory 45.9MB
    public void moveZeroes(int[] nums) {
        if (nums.length == 1){
            return;
        }
        int x = 0;

        for (int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[x] = nums[i];
                x++;
            }
        }
        while (x < nums.length){
            nums[x] = 0;
            x++;
        }
    }
}