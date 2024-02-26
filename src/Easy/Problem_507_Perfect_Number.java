package Easy;

public class Problem_507_Perfect_Number {
    //Language Java
    //Runtime 1ms
    //Memory 39.7MB
    public boolean checkPerfectNumber(int num) {
        int sum = 1;

        for (int i = 2; i * i <= num; i++)
        {
            if (num % i == 0)
            {
                if(i * i != num)
                    sum = sum + i + num / i;
                else
                    sum = sum + i;
            }
        }
        if (sum == num && num != 1)
            return true;

        return false;
    }
}