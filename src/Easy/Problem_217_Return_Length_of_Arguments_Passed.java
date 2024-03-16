package Easy;

import java.util.Arrays;

public class Problem_217_Return_Length_of_Arguments_Passed {
    //Language JavaScript
    //Runtime 18ms
    //Memory 60,4MB
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> twiceValue = new HashSet<>();

        for (int num : nums) {
            if (!twiceValue.add(num)) {
                return true;
            }
        }
        return false;
    }
}