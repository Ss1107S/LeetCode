package Easy;

public class Problem_202_Happy_Number {
    //Language Java
    //Runtime 0ms
    //Memory 40.9MB
    public boolean isHappy(int n) {
        int sum=0;

        while (n >= 7){
            while (n > 0){
                int n1 = n % 10;
                sum = sum + (n1 * n1);
                n = n / 10;
            }
            n = sum;
            sum = 0;
        }
        if (n == 1)
            return true;
        return false;
    }
}