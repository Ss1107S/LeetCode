package Easy;

public class Problem_27_Remove_Element {
    //Language Java
    //Runtime 0ms
    //Memory 41.6MB
    public int removeElement(int[] nums, int val) {
        int index = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}