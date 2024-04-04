package Easy;

import java.util.HashSet;

public class Problem_217_Contains_Duplicate {
    //Language Java
    //Runtime 8ms
    //Memory 60.4MB
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
