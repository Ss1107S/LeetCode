package Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Problem_2259_Remove_Digit_From_Number_to_Maximize_Result {
    //Language Java
    //Runtime 4ms
    //Memory 42.1MB
    public String removeDigit(String number, char digit) {
        List<String> nums = new ArrayList<>();

        for (int i = 0; i < number.length(); i++){
            if (number.charAt(i) == digit)
                nums.add(number.substring (0, i) + number.substring(i + 1));
        }
        return nums.stream().sorted().collect(Collectors.toList()).get(nums.size() - 1);
    }
}