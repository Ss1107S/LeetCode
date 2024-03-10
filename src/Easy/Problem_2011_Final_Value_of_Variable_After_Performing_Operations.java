package Easy;

public class Problem_2011_Final_Value_of_Variable_After_Performing_Operations {
    //Language Java
    //Runtime 0ms
    //Memory 42.4MB
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(int i = 0; i < operations.length; i++)    {
            if(operations[i].charAt(1) == '+') x++;
            else x--;
        }
        return x;
    }
}