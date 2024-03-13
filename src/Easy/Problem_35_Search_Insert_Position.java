package Easy;

public class Problem_35_Search_Insert_Position {
    //Language Java
    //Runtime 0ms
    //Memory 42.8MB
    public int searchInsert(int[] nums, int target) {
        int x = 0;

        for (int i = 0; i < nums.length; i++){
            if(nums[i] == target)
                return i;
            else if (nums[i] < target)
                x = x + 1;
        }
        return x;
    }
}