package Easy;

public class Problem_1342_Number_of_Steps_to_Reduce {
    //Language Java
    //Runtime 0ms
    //Memory 40.5MB
    public int numberOfSteps(int num) {
        if (num == 0)
            return num;

        return 1 + (num % 2 == 0 ? numberOfSteps(num / 2) : numberOfSteps(num - 1));
    }
}