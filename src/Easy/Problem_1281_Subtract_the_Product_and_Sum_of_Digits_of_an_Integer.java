package Easy;

public class Problem_1281_Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {
    //Language Java
    //Runtime 0ms
    //Memory 40.7MB
    public int subtractProductAndSum(int n) {
        int sum = 0, i = 1;
        while (n > 0) {
            int x = n % 10;
            sum = sum + x;
            i = i * x;
            n = n / 10;
        }
        return i - sum;
    }
}